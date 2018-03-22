/**
 * ClienteControlador.java
 *
 * Creada el 7/10/2017, 10:15:13 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 7/10/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.controlador;

import co.edu.uniautonoma.sioat.datos.dto.ClienteDTO;
import co.edu.uniautonoma.sioat.interfaz.JsonRequestMappingUtil;
import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import co.edu.uniautonoma.sioat.servicio.ClienteServicio;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 7/10/2017
 */
@Controller
@Configuration
@JsonRequestMappingUtil("/clientecontrolador")
public class ClienteControlador {

    private static final Log log = LogFactory.getLog(ClienteControlador.class);

    @Autowired
    private ClienteServicio clienteservicio;

    @JsonRequestMappingUtil("listar")
    public @ResponseBody
    Map<String, Object> listarCliente() {
        try {
            return ExtJSReturnUtil.mapOK(clienteservicio.listar());
        } catch (Exception e) {
            log.error("Error listando clientes", e);
            return ExtJSReturnUtil.mapError("error_listar");
        }
    }

    @JsonRequestMappingUtil("crear")
    public @ResponseBody
    Map<String, Object> agregarCliente(@RequestBody List<ClienteDTO> listaclientes) {
        try {
            List<ClienteDTO> respuesta = clienteservicio.crear(listaclientes);
            if (respuesta != null) {
                return ExtJSReturnUtil.mapOK(respuesta);
            } else {
                log.error("Nit existente, por favor ingrese otro");
                return ExtJSReturnUtil.mapError("Nit existente, por favor ingrese otro");
            }
        } catch (Exception e) {
            log.error("Error al crear cliente", e);
            return ExtJSReturnUtil.mapError("Error al crear cliente");
        }
    }

    @JsonRequestMappingUtil("actualizar")
    public @ResponseBody
    Map<String, Object> actualizarCliente(@RequestBody List<ClienteDTO> listaclientes) {
        try {
            List<ClienteDTO> respuesta = clienteservicio.actualizar(listaclientes);
            if (respuesta != null) {
                return ExtJSReturnUtil.mapOK(respuesta);
            } else {
                log.error("Nit existente, por favor ingrese otro");
                return ExtJSReturnUtil.mapError("Nit existente, por favor ingrese otro");
            }
        } catch (Exception e) {
            log.error("Error al editar cliente", e);
            return ExtJSReturnUtil.mapError("Error al editar cliente");
        }
    }

    @JsonRequestMappingUtil("eliminar")
    public @ResponseBody
    Map<String, Object> eliminarCliente(@RequestBody List<ClienteDTO> listaclientes) {
        try {
            clienteservicio.eliminar(listaclientes);
            log.info("Exito eliminado clientes");
            return ExtJSReturnUtil.mapOK("Exito eliminando clientes");
        } catch (Exception e) {
            log.error("Error al eliminar cliente", e);
            return ExtJSReturnUtil.mapError("Error al eliminar cliente");
        }
    }

}
