/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.controlador;

import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import co.edu.uniautonoma.sioat.interfaz.JsonRequestMappingUtil;
import co.edu.uniautonoma.sioat.servicio.ReporteServicio;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author admin
 */
@Controller
@Configuration
@JsonRequestMappingUtil("/reportecontrolador")
public class ReporteControlador {

    private static final Log log = LogFactory.getLog(ReporteControlador.class);

    @Autowired
    private ReporteServicio reporteservicio;

    @JsonRequestMappingUtil(value = "generarplantilla", method = RequestMethod.GET)
    public ResponseEntity<byte[]> generarPlantilla(HttpServletRequest request,
            HttpServletResponse response) {
        try {
            return reporteservicio.descargarPlantillaCifras();
        } catch (IOException ex) {
            log.error("Error descargando plantilla", ex);
            return null;
        }
    }

    @JsonRequestMappingUtil(value = "cargarplantilla", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> cargarPlantilla(@RequestParam(value = "plantilla") MultipartFile file) {
        try {
            return reporteservicio.cargarPlantillaCifras(file);
        } catch (IOException ex) {
            log.error("Error cargando plantilla", ex);
            return ExtJSReturnUtil.mapError("errorgeneral");
        }
    }

}
