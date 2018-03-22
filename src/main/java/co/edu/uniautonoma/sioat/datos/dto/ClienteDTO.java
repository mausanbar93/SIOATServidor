/**
 * ClienteDTO.java
 *
 * Creada el 18/11/2017, 11:48:01 AM
 *
 * Clase Java desarrollada por Mauricio Sánchez Barragán para la empresa Seratic Ltda el día 18/11/2017.
 *
 * Esta clase es confidencial y para uso de las aplicaciones de la empresa Seratic Ltda.
 * Prohibido su uso sin autorización explícita de personal autorizado de la empresa Seratic Ltda.
 *
 * Para información sobre el uso de esta clase, así como bugs, actualizaciones o mejoras
 * envíar un email a <seratic@seratic.com> o a <mauricio.sanchez@seratic.com>.
 */
package co.edu.uniautonoma.sioat.datos.dto;

import co.edu.uniautonoma.sioat.datos.Cliente;
import co.edu.uniautonoma.sioat.datos.CodigoAdministracion;
import co.edu.uniautonoma.sioat.datos.SubActividadEconomica;
import co.edu.uniautonoma.sioat.datos.TipoContribuyente;
import co.edu.uniautonoma.sioat.datos.TipoResponsabilidad;

/**
 *
 * @author Ing. Mauricio Sánchez Barragán <mauricio.sanchez@seratic.com>
 * @version 1.0
 * @date 18/11/2017
 */
public class ClienteDTO {

    private Integer id;
    private Integer idActividadEconomica;
    private String nombreActividadEconomica;
    private String codigoActividadEconomica;
    private Integer idCodigoAdministracion;
    private String nombreCodigoAdministracion;
    private String codigoCodigoAdministracion;
    private Integer idTipoContribuyente;
    private String nombreTipoContribuyente;
    private Integer idTipoResponsabilidad;
    private String nombreTipoResponsabilidad;
    private Integer idUsuario;
    private String nombre;
    private Integer nit;
    private String apellido;
    private String codigoCorrecion;
    private String formularioAnterior;
    private Integer digitoVerificacion;
    private Character tcp;
    private String razonSocial;
    private String nitFirmantel;
    private Integer numeroTarjetaRevisor;
    private String codDireccionSeccional;
    private Integer digitoVerificacionFirmante;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        SubActividadEconomica ae = cliente.getSubActividadEconomica();
        this.idActividadEconomica = (ae != null) ? ae.getId() : null;
        this.nombreActividadEconomica = (ae != null) ? ae.getNombre() : null;
        this.codigoActividadEconomica = (ae != null) ? ae.getCodigo() : null;
        CodigoAdministracion ca = cliente.getCodigoAdministracion();
        this.idCodigoAdministracion = (ca != null) ? ca.getId() : null;
        this.nombreCodigoAdministracion = (ca != null) ? ca.getNombre() : null;
        this.codigoCodigoAdministracion = (ca != null) ? ca.getCodigo() : null;
        TipoContribuyente tc = cliente.getTipoContribuyente();
        this.idTipoContribuyente = (tc != null) ? tc.getId() : null;
        this.nombreTipoContribuyente = (tc != null) ? tc.getNombre() : null;
        TipoResponsabilidad tr = cliente.getTipoResponsabilidad();
        this.idTipoResponsabilidad = (tr != null) ? tr.getId() : null;
        this.nombreTipoResponsabilidad = (tr != null) ? tr.getNombre() : null;
        this.idUsuario = (cliente.getUsuario() != null) ? cliente.getUsuario().getId() : null;
        this.nombre = cliente.getNombre();
        this.nit = cliente.getNit();
        this.apellido = cliente.getApellido();
        this.codigoCorrecion = cliente.getCodigoCorrecion();
        this.formularioAnterior = cliente.getFormularioAnterior();
        this.digitoVerificacion = cliente.getDigitoVerificacion();
        this.tcp = cliente.getTcp();
        this.razonSocial = cliente.getRazonSocial();
        this.nitFirmantel = cliente.getNitFirmantel();
        this.numeroTarjetaRevisor = cliente.getNumeroTarjetaRevisor();
        this.codDireccionSeccional = cliente.getCodDireccionSeccional();
        this.digitoVerificacionFirmante = cliente.getDigitoVerificacionFirmante();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdActividadEconomica() {
        return idActividadEconomica;
    }

    public void setIdActividadEconomica(Integer idActividadEconomica) {
        this.idActividadEconomica = idActividadEconomica;
    }

    public String getNombreActividadEconomica() {
        return nombreActividadEconomica;
    }

    public void setNombreActividadEconomica(String nombreActividadEconomica) {
        this.nombreActividadEconomica = nombreActividadEconomica;
    }

    public String getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(String codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    public Integer getIdCodigoAdministracion() {
        return idCodigoAdministracion;
    }

    public void setIdCodigoAdministracion(Integer idCodigoAdministracion) {
        this.idCodigoAdministracion = idCodigoAdministracion;
    }

    public String getNombreCodigoAdministracion() {
        return nombreCodigoAdministracion;
    }

    public void setNombreCodigoAdministracion(String nombreCodigoAdministracion) {
        this.nombreCodigoAdministracion = nombreCodigoAdministracion;
    }

    public String getCodigoCodigoAdministracion() {
        return codigoCodigoAdministracion;
    }

    public void setCodigoCodigoAdministracion(String codigoCodigoAdministracion) {
        this.codigoCodigoAdministracion = codigoCodigoAdministracion;
    }

    public Integer getIdTipoContribuyente() {
        return idTipoContribuyente;
    }

    public void setIdTipoContribuyente(Integer idTipoContribuyente) {
        this.idTipoContribuyente = idTipoContribuyente;
    }

    public String getNombreTipoContribuyente() {
        return nombreTipoContribuyente;
    }

    public void setNombreTipoContribuyente(String nombreTipoContribuyente) {
        this.nombreTipoContribuyente = nombreTipoContribuyente;
    }

    public Integer getIdTipoResponsabilidad() {
        return idTipoResponsabilidad;
    }

    public void setIdTipoResponsabilidad(Integer idTipoResponsabilidad) {
        this.idTipoResponsabilidad = idTipoResponsabilidad;
    }

    public String getNombreTipoResponsabilidad() {
        return nombreTipoResponsabilidad;
    }

    public void setNombreTipoResponsabilidad(String nombreTipoResponsabilidad) {
        this.nombreTipoResponsabilidad = nombreTipoResponsabilidad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoCorrecion() {
        return codigoCorrecion;
    }

    public void setCodigoCorrecion(String codigoCorrecion) {
        this.codigoCorrecion = codigoCorrecion;
    }

    public String getFormularioAnterior() {
        return formularioAnterior;
    }

    public void setFormularioAnterior(String formularioAnterior) {
        this.formularioAnterior = formularioAnterior;
    }

    public Integer getDigitoVerificacion() {
        return digitoVerificacion;
    }

    public void setDigitoVerificacion(Integer digitoVerificacion) {
        this.digitoVerificacion = digitoVerificacion;
    }

    public Character getTcp() {
        return tcp;
    }

    public void setTcp(Character tcp) {
        this.tcp = tcp;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNitFirmantel() {
        return nitFirmantel;
    }

    public void setNitFirmantel(String nitFirmantel) {
        this.nitFirmantel = nitFirmantel;
    }

    public Integer getNumeroTarjetaRevisor() {
        return numeroTarjetaRevisor;
    }

    public void setNumeroTarjetaRevisor(Integer numeroTarjetaRevisor) {
        this.numeroTarjetaRevisor = numeroTarjetaRevisor;
    }

    public String getCodDireccionSeccional() {
        return codDireccionSeccional;
    }

    public void setCodDireccionSeccional(String codDireccionSeccional) {
        this.codDireccionSeccional = codDireccionSeccional;
    }

    public Integer getDigitoVerificacionFirmante() {
        return digitoVerificacionFirmante;
    }

    public void setDigitoVerificacionFirmante(Integer digitoVerificacionFirmante) {
        this.digitoVerificacionFirmante = digitoVerificacionFirmante;
    }

}
