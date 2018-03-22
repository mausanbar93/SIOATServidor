/**
 * ManejoDatosUtil.java
 *
 * Creada el 21/10/2017, 10:51:55 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 21/10/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.datos.util;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 21/10/2017
 */
public class ManejoDatosUtil {

    public String convertir_cargo(String cargo) {
        String ncargo = "";
        if (cargo.equals("Revisor fiscal")) {
            ncargo = "revisor";
        } else {
            ncargo = "secretaria";
        }
        return ncargo;
    }

}
