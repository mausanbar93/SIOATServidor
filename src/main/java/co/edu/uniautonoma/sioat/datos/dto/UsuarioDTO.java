/**
 * UsuarioDTO.java
 *
 * Creada el 7/10/2017, 01:04:15 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 7/10/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.datos.dto;

import co.edu.uniautonoma.sioat.datos.Cargo;
import co.edu.uniautonoma.sioat.datos.Login;
import co.edu.uniautonoma.sioat.datos.Usuario;
import java.util.Date;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 7/10/2017
 */
public class UsuarioDTO {

    private Integer id;
    private Integer idCargo;
    private String nombreCargo;
    private String loginUsername;
    private String loginPassword;
    private String nombres;
    private String apellidos;
    private String correo;
    private Long telefono;
    private String direccion;
    private Long identificacion;
    private Date fechaNacimiento;
    private Boolean habilitado;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        Cargo c = usuario.getCargo();
        this.idCargo = (c != null) ? c.getId() : null;
        this.nombreCargo = (c != null) ? c.getNombre() : null;
        Login l = usuario.getLogin();
        this.loginUsername = (l != null) ? l.getUsername() : null;
        this.loginPassword = (l != null) ? l.getPassword() : null;
        this.nombres = usuario.getNombre();
        this.apellidos = usuario.getApellido();
        this.correo = usuario.getCorreo();
        this.telefono = usuario.getNumeroCelular();
        this.direccion = usuario.getDireccion();
        this.identificacion = usuario.getCedula();
        this.fechaNacimiento = usuario.getFechaNacimiento();
        this.habilitado = usuario.isHabilitado();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    

}
