/**
 * ClienteRepositorio.java
 *
 * Creada el 18/11/2017, 10:00:04 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 18/11/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.repositorio;

import co.edu.uniautonoma.sioat.datos.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 18/11/2017
 */
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

    @Query(value = "SELECT c FROM Cliente c WHERE (c.nit = :nit)")
    public Cliente findNit(@Param("nit") Integer nit);

}
