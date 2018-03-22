/**
 * UsuarioRepositorio.java
 *
 * Creada el 23/09/2017, 01:21:23 PM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 23/09/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.repositorio;

import co.edu.uniautonoma.sioat.datos.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 23/09/2017
 */
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

    @Query(value = "SELECT user.* FROM Usuario user JOIN Login l ON l.id=user.id_login WHERE l.username = :username AND l.password = :password", nativeQuery = true)
    public List<Usuario> login(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT user.* FROM Usuario user JOIN Login l ON l.id=user.id_login WHERE l.username = :username AND user.habilitado = TRUE", nativeQuery = true)
    public Usuario findUsername(@Param("username") String username);

}
