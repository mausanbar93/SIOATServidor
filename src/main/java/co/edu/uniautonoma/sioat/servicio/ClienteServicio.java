/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.servicio;

import co.edu.uniautonoma.sioat.datos.Cliente;
import co.edu.uniautonoma.sioat.datos.CodigoAdministracion;
import co.edu.uniautonoma.sioat.datos.SubActividadEconomica;
import co.edu.uniautonoma.sioat.datos.TipoContribuyente;
import co.edu.uniautonoma.sioat.datos.TipoResponsabilidad;
import co.edu.uniautonoma.sioat.datos.dto.ClienteDTO;
import co.edu.uniautonoma.sioat.repositorio.ClienteRepositorio;
import co.edu.uniautonoma.sioat.repositorio.CodigoAdministracionRepositorio;
import co.edu.uniautonoma.sioat.repositorio.SubActividadRepositorio;
import co.edu.uniautonoma.sioat.repositorio.TipoContribuyenteRepositorio;
import co.edu.uniautonoma.sioat.repositorio.TipoResponsabilidadRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienterepositorio;
    @Autowired
    private TipoResponsabilidadRepositorio tiporesponsabilidadrepositorio;
    @Autowired
    private TipoContribuyenteRepositorio tipocontribuyenterepositorio;
    @Autowired
    private CodigoAdministracionRepositorio codigoadministracionrepositorio;
    @Autowired
    private SubActividadRepositorio subactividadrepositorio;

    public List<ClienteDTO> listar() {
        try {
            List<Cliente> lista = (List<Cliente>) clienterepositorio.findAll();
            List<ClienteDTO> respuesta = new ArrayList<>();
            ClienteDTO cliente;
            if (lista.size() > 0) {
                for (Cliente client : lista) {
                    if (client.isHabilitado()) {
                        cliente = new ClienteDTO(client);
                        respuesta.add(cliente);
                    }
                }
                return respuesta;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<ClienteDTO> crear(List<ClienteDTO> lista) {
        try {
            List<ClienteDTO> clientes_respuesta = new ArrayList<>();
            Cliente cliente;
            ClienteDTO cliente_respuesta;
            for (ClienteDTO client : lista) {
                Cliente client_busqueda = clienterepositorio.findNit(client.getNit());
                if (client_busqueda == null) {
                    cliente = new Cliente();
                    cliente.setNit(client.getNit());
                    cliente.setNombre(client.getNombre());
                    cliente.setApellido(client.getApellido());
                    cliente.setCodigoCorrecion(client.getCodigoCorrecion());
                    cliente.setFormularioAnterior(client.getFormularioAnterior());
                    cliente.setDigitoVerificacion(client.getDigitoVerificacion());
                    cliente.setTcp(client.getTcp());
                    cliente.setRazonSocial(client.getRazonSocial());
                    cliente.setNitFirmantel(client.getNitFirmantel());
                    cliente.setNumeroTarjetaRevisor(client.getNumeroTarjetaRevisor());
                    cliente.setCodDireccionSeccional(client.getCodDireccionSeccional());
                    cliente.setDigitoVerificacionFirmante(client.getDigitoVerificacionFirmante());
                    TipoResponsabilidad tipoResponsabilidad = tiporesponsabilidadrepositorio.findOne(client.getIdTipoResponsabilidad());
                    TipoContribuyente tipoContribuyente = tipocontribuyenterepositorio.findOne(client.getIdTipoContribuyente());
                    CodigoAdministracion codigoAdministracion = codigoadministracionrepositorio.findOne(client.getIdCodigoAdministracion());
                    SubActividadEconomica subActividad = subactividadrepositorio.findOne(client.getIdActividadEconomica());
                    cliente.setCodigoAdministracion(codigoAdministracion);
                    cliente.setTipoResponsabilidad(tipoResponsabilidad);
                    cliente.setTipoContribuyente(tipoContribuyente);
                    cliente.setSubActividadEconomica(subActividad != null ? subActividad : null);
                    cliente.setHabilitado(Boolean.TRUE);
                    cliente_respuesta = new ClienteDTO(clienterepositorio.save(cliente));
                    clientes_respuesta.add(cliente_respuesta);
                } else {
                    return null;
                }
            }
            return clientes_respuesta;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<ClienteDTO> actualizar(List<ClienteDTO> lista) {
        try {
            List<ClienteDTO> clientes_respuesta = new ArrayList<>();
            Cliente cliente;
            ClienteDTO cliente_respuesta;
            for (ClienteDTO client : lista) {
                cliente = clienterepositorio.findOne(client.getId());
                if (cliente.getNit() == client.getNit()) { //  usuario.getLogin().getUsername().equals(user.getLoginUsername())) {
                    cliente.setNit(client.getNit());
                    cliente.setNombre(client.getNombre());
                    cliente.setApellido(client.getApellido());
                    cliente.setCodigoCorrecion(client.getCodigoCorrecion());
                    cliente.setFormularioAnterior(client.getFormularioAnterior());
                    cliente.setDigitoVerificacion(client.getDigitoVerificacion());
                    cliente.setTcp(client.getTcp());
                    cliente.setRazonSocial(client.getRazonSocial());
                    cliente.setNitFirmantel(client.getNitFirmantel());
                    cliente.setNumeroTarjetaRevisor(client.getNumeroTarjetaRevisor());
                    cliente.setCodDireccionSeccional(client.getCodDireccionSeccional());
                    cliente.setDigitoVerificacionFirmante(client.getDigitoVerificacionFirmante());
                    TipoResponsabilidad tipoResponsabilidad = tiporesponsabilidadrepositorio.findOne(client.getIdTipoResponsabilidad());
                    TipoContribuyente tipoContribuyente = tipocontribuyenterepositorio.findOne(client.getIdTipoContribuyente());
                    CodigoAdministracion codigoAdministracion = codigoadministracionrepositorio.findOne(client.getIdCodigoAdministracion());
                    SubActividadEconomica subActividad = subactividadrepositorio.findOne(client.getIdActividadEconomica());
                    cliente.setCodigoAdministracion(codigoAdministracion);
                    cliente.setTipoResponsabilidad(tipoResponsabilidad);
                    cliente.setTipoContribuyente(tipoContribuyente);
                    cliente.setSubActividadEconomica(subActividad != null ? subActividad : null);
                    cliente.setHabilitado(Boolean.TRUE);
                    cliente_respuesta = new ClienteDTO(clienterepositorio.save(cliente));
                    clientes_respuesta.add(cliente_respuesta);
                } else {
                    Cliente client_busqueda = clienterepositorio.findNit(client.getNit());
                    if (client_busqueda == null) {
                        cliente = new Cliente();
                        cliente.setNit(client.getNit());
                        cliente.setNombre(client.getNombre());
                        cliente.setApellido(client.getApellido());
                        cliente.setCodigoCorrecion(client.getCodigoCorrecion());
                        cliente.setFormularioAnterior(client.getFormularioAnterior());
                        cliente.setDigitoVerificacion(client.getDigitoVerificacion());
                        cliente.setTcp(client.getTcp());
                        cliente.setRazonSocial(client.getRazonSocial());
                        cliente.setNitFirmantel(client.getNitFirmantel());
                        cliente.setNumeroTarjetaRevisor(client.getNumeroTarjetaRevisor());
                        cliente.setCodDireccionSeccional(client.getCodDireccionSeccional());
                        cliente.setDigitoVerificacionFirmante(client.getDigitoVerificacionFirmante());
                        TipoResponsabilidad tipoResponsabilidad = tiporesponsabilidadrepositorio.findOne(client.getIdTipoResponsabilidad());
                        TipoContribuyente tipoContribuyente = tipocontribuyenterepositorio.findOne(client.getIdTipoContribuyente());
                        CodigoAdministracion codigoAdministracion = codigoadministracionrepositorio.findOne(client.getIdCodigoAdministracion());
                        SubActividadEconomica subActividad = subactividadrepositorio.findOne(client.getIdActividadEconomica());
                        cliente.setCodigoAdministracion(codigoAdministracion);
                        cliente.setTipoResponsabilidad(tipoResponsabilidad);
                        cliente.setTipoContribuyente(tipoContribuyente);
                        cliente.setSubActividadEconomica(subActividad != null ? subActividad : null);
                        cliente.setHabilitado(Boolean.TRUE);
                        cliente_respuesta = new ClienteDTO(clienterepositorio.save(cliente));
                        clientes_respuesta.add(cliente_respuesta);
                    } else {
                        return null;
                    }
                }
            }
            return clientes_respuesta;
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar(List<ClienteDTO> lista) {
        try {
            Cliente cliente;
            for (ClienteDTO client : lista) {
                cliente = clienterepositorio.findOne(client.getId());
                cliente.setHabilitado(Boolean.FALSE);
                clienterepositorio.save(cliente);
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
