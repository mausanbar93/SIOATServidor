/**
 * TipoContribuyenteRepositorio.java
 *
 * Creada el 28/10/2017, 10:45:48 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 28/10/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.repositorio;

import co.edu.uniautonoma.sioat.datos.TipoContribuyente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 28/10/2017
 */
public interface TipoContribuyenteRepositorio extends CrudRepository<TipoContribuyente, Integer> {

}
