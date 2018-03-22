/**
 * ActividadEconomicaControlador.java
 * 
 * Creada el 28/10/2017, 11:57:49 AM
 * 
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 28/10/2017.
 * 
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras 
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */

package co.edu.uniautonoma.sioat.controlador;


import co.edu.uniautonoma.sioat.datos.CodigoAdministracion;
import co.edu.uniautonoma.sioat.interfaz.JsonRequestMappingUtil;
import co.edu.uniautonoma.sioat.repositorio.CodigoAdministracionRepositorio;
import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 28/10/2017
 */
@Controller
@Configuration
@JsonRequestMappingUtil("/codigo_administracion")
public class CodigoAdministracionControlador {
private static final Log log = LogFactory.getLog(CodigoAdministracionControlador.class);
    @Autowired
    private CodigoAdministracionRepositorio codigoadministracionpositorio;

    @JsonRequestMappingUtil(value = "listar", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> listarcodigoadministracion() throws Exception {
        try {
            Iterable<CodigoAdministracion> datos = codigoadministracionpositorio.findAll();
            return ExtJSReturnUtil.mapOK(datos);
        } catch (Exception e) {
            log.error("ERROR LISTANDO CODIGO ADMINISTRACION", e);
            return ExtJSReturnUtil.mapError("error listando codigo administracion");
        }
    }

}