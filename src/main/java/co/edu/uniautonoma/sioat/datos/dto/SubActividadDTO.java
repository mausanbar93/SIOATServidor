/**
 * SubActividadDTO.java
 * 
 * Creada el 28/10/2017, 12:30:41 PM
 * 
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 28/10/2017.
 * 
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras 
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */

package co.edu.uniautonoma.sioat.datos.dto;

/**
 * 
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 28/10/2017
 */
public class SubActividadDTO {
    private Integer id;
    private String nombre;
    private String codigo;

    public SubActividadDTO() {
    }

    public SubActividadDTO(Integer id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

}