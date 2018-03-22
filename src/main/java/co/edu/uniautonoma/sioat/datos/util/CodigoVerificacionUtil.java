/**
 * CodigoVerificacionUtil.java
 *
 * Creada el 4/11/2017, 12:39:38 PM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 4/11/2017.
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
 * @date 4/11/2017
 */
public class CodigoVerificacionUtil {

    /*CODIGO JAVA*/
    //digito verificacion de nit colombia 
    //funcion java. retorna -1 si pasa algun error 
    public static int digitoVerificacion(String StrNit) {
        int digito_chequeo = -1;
        int li_peso[] = new int[15];
        li_peso[0] = 71;
        li_peso[1] = 67;
        li_peso[2] = 59;
        li_peso[3] = 53;
        li_peso[4] = 47;
        li_peso[5] = 43;
        li_peso[6] = 41;
        li_peso[7] = 37;
        li_peso[8] = 29;
        li_peso[9] = 23;
        li_peso[10] = 19;
        li_peso[11] = 17;
        li_peso[12] = 13;
        li_peso[13] = 7;
        li_peso[14] = 3;

        Integer li_suma = 0;

        if (StrNit != null && StrNit.trim().length() > 0) {
            while (StrNit.length() < 15) {
                StrNit = "0" + StrNit;
            }
            try {
                for (int i = 0; i < 15; i++) {
                    li_suma = li_suma + (new Integer(StrNit.substring(i, i + 1)) * li_peso[i]);
                }
                digito_chequeo = li_suma % 11;
                if (digito_chequeo >= 2) {
                    digito_chequeo = 11 - digito_chequeo;
                }
                System.out.println("digito verificacion " + digito_chequeo);

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Datos no numericos ");
            }
        } else {
            System.out.println("Nit vacio ");
        }
        return digito_chequeo;
    }

}
