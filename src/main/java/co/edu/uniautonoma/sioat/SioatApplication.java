/**
 * SioatApplication.java
 *
 * Creada el 16/09/2017, 12:19:35 PM
 *
 * Clase Java desarrollada por Brayan Steven Perafan Ordonez para la institución Corporacion Universitaria Autonoma del Cauca el día 16/09/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la institución Corporacion Universitaria Autonoma del Cauca.
 * Prohibido su uso sin autorización explícita de personal autorizado de la institución Corporacion Universitaria Autonoma del Cauca.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a
 * <Expression correoEmpresa is undefined on line 12, column 25 in Templates/Classes/Class.java.>
 * o a <brayan.po@uniautonoma.edu.co>.
 */
package co.edu.uniautonoma.sioat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author Ing. Sistemas Brayan Steven Perafan Ordonez
 * <brayan.po@uniautonoma.edu.co>
 * @version 1.0
 * @date 16/09/2017
 */
@EnableAutoConfiguration
@SpringBootApplication
public class SioatApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SioatApplication.class, args);
    }

    /*
    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
        return hemf.getSessionFactory();
    }
     */
}
