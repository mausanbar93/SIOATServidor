/**
 * SubActividadControlador.java
 * 
 * Creada el 28/10/2017, 12:26:15 PM
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

import co.edu.uniautonoma.sioat.datos.ActividadEconomica;
import co.edu.uniautonoma.sioat.datos.SubActividadEconomica;
import co.edu.uniautonoma.sioat.interfaz.JsonRequestMappingUtil;
import co.edu.uniautonoma.sioat.repositorio.ActividadEconomicaRepositorio;
import co.edu.uniautonoma.sioat.repositorio.SubActividadRepositorio;
import co.edu.uniautonoma.sioat.datos.util.ExtJSReturnUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 28/10/2017
 */
@Controller
@Configuration
@JsonRequestMappingUtil("/sub_actividad")
public class SubActividadControlador {
    private static final Log log = LogFactory.getLog(SubActividadControlador.class);
    @Autowired
    private SubActividadRepositorio subactividadrepositorio;

    @JsonRequestMappingUtil(value = "listar", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> listaractividadeconomica(@RequestParam("actividad") Integer actividad) throws Exception {
        try {
            Iterable<SubActividadEconomica> datos = subactividadrepositorio.findAll();
            log.info(actividad);
            List<SubActividadEconomica> datos_filtro = new ArrayList<SubActividadEconomica>();
            for(SubActividadEconomica item: datos){
                if(item.getActividadEconomica() != null && item.getActividadEconomica().getId().equals(actividad)){
                    datos_filtro.add(item);
                }                
            }
            return ExtJSReturnUtil.mapOK(datos_filtro);
        } catch (Exception e) {
            log.error("ERROR LISTANDO SUB-ACTIVIDAD ECONOMICA", e);
            return ExtJSReturnUtil.mapError("error listando sub-actividad economica");
        }
    }

}