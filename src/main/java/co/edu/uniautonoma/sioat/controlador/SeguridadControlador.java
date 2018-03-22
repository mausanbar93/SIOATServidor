/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.controlador;

import co.edu.uniautonoma.sioat.datos.UsuarioSesion;
import co.edu.uniautonoma.sioat.datos.dto.UsuarioDTO;
import co.edu.uniautonoma.sioat.datos.util.AuthUtil;
import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import co.edu.uniautonoma.sioat.interfaz.JsonRequestMappingUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import co.edu.uniautonoma.sioat.seguridad.SeguridadServicio;
import co.edu.uniautonoma.sioat.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *@author Ing. Brayan Perafan
 */
@Controller
@Configuration
@EnableAsync
@EnableScheduling
@JsonRequestMappingUtil("/seguridadcontrolador")
public class SeguridadControlador {

    private static final Log log = LogFactory.getLog(SeguridadControlador.class);

    @Value("${constantes.ESTANDAR_TIEMPO}")
    private Integer ESTANDAR_TIEMPO;
    @Value("${constantes.TIEMPO_SESION}")
    private Integer TIEMPO_SESION;

    @Autowired
    private UsuarioServicio usuarioservicio;
    @Autowired
    protected SeguridadServicio seguridadServicio;

    @JsonRequestMappingUtil("login")
    public @ResponseBody
    Map<String, Object> validarLogin(@RequestParam("username") String username, @RequestParam("password") String password,
            HttpServletRequest request, HttpServletResponse response) {
        try {
            List<UsuarioDTO> respuesta = usuarioservicio.login(username, password);
            if (respuesta != null) {
                if (respuesta.get(0).getHabilitado()) {
                    Long tiempoSesion = new Long(ESTANDAR_TIEMPO * TIEMPO_SESION);
                    seguridadServicio.login(respuesta.get(0), tiempoSesion);
                    return ExtJSReturnUtil.mapOK(respuesta);
                } else {
                    log.error("Usuario inhabilitado");
                    return ExtJSReturnUtil.mapError("Usuario inhabilitado");
                }
            } else {
                log.error("Usuario no existente");
                return ExtJSReturnUtil.mapError("Usuario no existente");
            }
        } catch (Exception e) {
            log.error("Error ejecutando login", e);
            return ExtJSReturnUtil.mapError("Error ejecutando login");
        }
    }

    @JsonRequestMappingUtil(value = "/verificarSesion", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> verificarSesion() {
        Authentication auth = AuthUtil.getCurrentAuth();
        if (auth != null) {
            UsuarioSesion hash = AuthUtil.getCurrentUser();
            if (hash != null) {
                return ExtJSReturnUtil.mapOK(hash);
            } else {
                List<String> respuesta = new ArrayList();
                respuesta.add("nosession");
                return ExtJSReturnUtil.mapOK(respuesta);
            }
        } else {
            List<String> respuesta = new ArrayList();
            respuesta.add("nosession");
            return ExtJSReturnUtil.mapOK(respuesta);
        }
    }

    @JsonRequestMappingUtil(value = "/logout", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            seguridadServicio.logout(request, response);
            return new ModelAndView("redirect:/");
        } catch (Exception ex) {
            log.error("Error ejecutando logout", ex);
            return new ModelAndView("redirect:/");
        }
    }

}
