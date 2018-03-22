/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.datos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

/**
 *
 * @author Administrador
 */
@JsonRootName("Usuario")
public class UsuarioSesion {

    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String username;
    private String password;
    private Integer idUserCreacion;
    private Integer idUserModificacion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Boolean enabled;
    private String rol;
    private Integer empresa;
    private Integer idRol;
    private String serialCaducidadCorreo;
    private String fechaCaducidadCorreo;
    private Boolean estadoInvitacion;
    private String dominioEmpresa;
    private Boolean estadoConfirmacionRegistro;
    private Integer idAplicacion;
    private Integer idVersionAplicacion;
    private String authCookie;
    private Long tiempoSesionUsuario;
    private Boolean datosCompartidos = Boolean.FALSE;

    public UsuarioSesion() {
    }

    public UsuarioSesion(Integer id, String nombres, String apellidos, String telefono, String correo, String username, String password, Integer idUserCreacion, Integer idUserModificacion, Date fechaCreacion, Date fechaModificacion, Boolean enabled, String rol, Integer empresa, Integer idRol, String serialCaducidadCorreo, String fechaCaducidadCorreo, Boolean estadoInvitacion, String dominioEmpresa, Boolean estadoConfirmacionRegistro, Integer idAplicacion, Integer idVersionAplicacion, String authCookie, Long tiempoSesionUsuario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.idUserCreacion = idUserCreacion;
        this.idUserModificacion = idUserModificacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.enabled = enabled;
        this.rol = rol;
        this.empresa = empresa;
        this.idRol = idRol;
        this.serialCaducidadCorreo = serialCaducidadCorreo;
        this.fechaCaducidadCorreo = fechaCaducidadCorreo;
        this.estadoInvitacion = estadoInvitacion;
        this.dominioEmpresa = dominioEmpresa;
        this.estadoConfirmacionRegistro = estadoConfirmacionRegistro;
        this.idAplicacion = idAplicacion;
        this.idVersionAplicacion = idVersionAplicacion;
        this.authCookie = authCookie;
        this.tiempoSesionUsuario = tiempoSesionUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdUserCreacion() {
        return idUserCreacion;
    }

    public void setIdUserCreacion(Integer idUserCreacion) {
        this.idUserCreacion = idUserCreacion;
    }

    public Integer getIdUserModificacion() {
        return idUserModificacion;
    }

    public void setIdUserModificacion(Integer idUserModificacion) {
        this.idUserModificacion = idUserModificacion;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = JsonFormat.DEFAULT_TIMEZONE)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = JsonFormat.DEFAULT_TIMEZONE)
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getSerialCaducidadCorreo() {
        return serialCaducidadCorreo;
    }

    public void setSerialCaducidadCorreo(String serialCaducidadCorreo) {
        this.serialCaducidadCorreo = serialCaducidadCorreo;
    }

    public String getFechaCaducidadCorreo() {
        return fechaCaducidadCorreo;
    }

    public void setFechaCaducidadCorreo(String fechaCaducidadCorreo) {
        this.fechaCaducidadCorreo = fechaCaducidadCorreo;
    }

    public Boolean getEstadoInvitacion() {
        return estadoInvitacion;
    }

    public void setEstadoInvitacion(Boolean estadoInvitacion) {
        this.estadoInvitacion = estadoInvitacion;
    }

    public String getDominioEmpresa() {
        return dominioEmpresa;
    }

    public void setDominioEmpresa(String dominioEmpresa) {
        this.dominioEmpresa = dominioEmpresa;
    }

    public Boolean getEstadoConfirmacionRegistro() {
        return estadoConfirmacionRegistro;
    }

    public void setEstadoConfirmacionRegistro(Boolean estadoConfirmacionRegistro) {
        this.estadoConfirmacionRegistro = estadoConfirmacionRegistro;
    }

    public Integer getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public Integer getIdVersionAplicacion() {
        return idVersionAplicacion;
    }

    public void setIdVersionAplicacion(Integer idVersionAplicacion) {
        this.idVersionAplicacion = idVersionAplicacion;
    }

    public String getAuthCookie() {
        return authCookie;
    }

    public void setAuthCookie(String authCookie) {
        this.authCookie = authCookie;
    }

    public Long getTiempoSesionUsuario() {
        return tiempoSesionUsuario;
    }

    public void setTiempoSesionUsuario(Long tiempoSesionUsuario) {
        this.tiempoSesionUsuario = tiempoSesionUsuario;
    }

    public Boolean getDatosCompartidos() {
        return datosCompartidos;
    }

    public void setDatosCompartidos(Boolean datosCompartidos) {
        this.datosCompartidos = datosCompartidos;
    }

    
}
