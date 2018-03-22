/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.servicio;

import co.edu.uniautonoma.sioat.datos.Cargo;
import co.edu.uniautonoma.sioat.datos.Login;
import co.edu.uniautonoma.sioat.datos.Usuario;
import co.edu.uniautonoma.sioat.datos.dto.UsuarioDTO;
import co.edu.uniautonoma.sioat.repositorio.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuariorepositorio;

    public List<UsuarioDTO> login(String username, String password) {
        try {
            List<Usuario> lista = usuariorepositorio.login(username, password);
            List<UsuarioDTO> respuesta = new ArrayList<>();
            UsuarioDTO usuario;
            if (lista.size() > 0) {
                for (Usuario user : lista) {
                    usuario = new UsuarioDTO(user);
                    respuesta.add(usuario);
                }
                return respuesta;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<UsuarioDTO> listar() {
        try {
            List<Usuario> lista = (List<Usuario>) usuariorepositorio.findAll();
            List<UsuarioDTO> respuesta = new ArrayList<>();
            UsuarioDTO usuario;
            if (lista.size() > 0) {
                for (Usuario user : lista) {
                    if (user.isHabilitado()) {
                        usuario = new UsuarioDTO(user);
                        respuesta.add(usuario);
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

    public List<UsuarioDTO> crear(List<UsuarioDTO> lista) {
        try {
            List<UsuarioDTO> usuarios_respuesta = new ArrayList<>();
            Usuario usuario;
            UsuarioDTO usuario_respuesta;
            for (UsuarioDTO user : lista) {
                Usuario user_busqueda = usuariorepositorio.findUsername(user.getLoginUsername());
                if (user_busqueda == null) {
                    usuario = new Usuario();
                    usuario.setNombre(user.getNombres());
                    usuario.setApellido(user.getApellidos());
                    Login login = new Login();
                    login.setUsername(user.getLoginUsername());
                    login.setPassword(user.getLoginPassword());
                    usuario.setLogin(login);
                    Cargo cargo = new Cargo();
                    cargo.setId(user.getIdCargo());
                    usuario.setCargo(cargo);
                    usuario.setCedula(user.getIdentificacion());
                    usuario.setCorreo(user.getCorreo());
                    usuario.setDireccion(user.getDireccion());
                    usuario.setFechaNacimiento(user.getFechaNacimiento());
                    usuario.setNumeroCelular(user.getTelefono());
                    usuario.setHabilitado(Boolean.TRUE);
                    usuario_respuesta = new UsuarioDTO(usuariorepositorio.save(usuario));
                    usuarios_respuesta.add(usuario_respuesta);
                } else {
                    return null;
                }
            }
            return usuarios_respuesta;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<UsuarioDTO> actualizar(List<UsuarioDTO> lista) {
        try {
            List<UsuarioDTO> usuarios_respuesta = new ArrayList<>();
            Usuario usuario;
            UsuarioDTO usuario_respuesta;
            for (UsuarioDTO user : lista) {
                usuario = usuariorepositorio.findOne(user.getId());
                if (usuario.getLogin().getUsername().equals(user.getLoginUsername())) {
                    usuario.setNombre(user.getNombres());
                    usuario.setApellido(user.getApellidos());
                    Login login = new Login();
                    login.setUsername(user.getLoginUsername());
                    login.setPassword(user.getLoginPassword());
                    usuario.setLogin(login);
                    Cargo cargo = new Cargo();
                    cargo.setId(user.getIdCargo());
                    usuario.setCargo(cargo);
                    usuario.setCedula(user.getIdentificacion());
                    usuario.setCorreo(user.getCorreo());
                    usuario.setDireccion(user.getDireccion());
                    usuario.setFechaNacimiento(user.getFechaNacimiento());
                    usuario.setNumeroCelular(user.getTelefono());
                    usuario.setHabilitado(Boolean.TRUE);
                    usuario_respuesta = new UsuarioDTO(usuariorepositorio.save(usuario));
                    usuarios_respuesta.add(usuario_respuesta);
                } else {
                    Usuario user_busqueda = usuariorepositorio.findUsername(user.getLoginUsername());
                    if (user_busqueda == null) {
                        usuario.setNombre(user.getNombres());
                        usuario.setApellido(user.getApellidos());
                        Login login = new Login();
                        login.setUsername(user.getLoginUsername());
                        login.setPassword(user.getLoginPassword());
                        usuario.setLogin(login);
                        Cargo cargo = new Cargo();
                        cargo.setId(user.getIdCargo());
                        usuario.setCargo(cargo);
                        usuario.setCedula(user.getIdentificacion());
                        usuario.setCorreo(user.getCorreo());
                        usuario.setDireccion(user.getDireccion());
                        usuario.setFechaNacimiento(user.getFechaNacimiento());
                        usuario.setNumeroCelular(user.getTelefono());
                        usuario.setHabilitado(Boolean.TRUE);
                        usuario_respuesta = new UsuarioDTO(usuariorepositorio.save(usuario));
                        usuarios_respuesta.add(usuario_respuesta);
                    } else {
                        return null;
                    }
                }
            }
            return usuarios_respuesta;
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar(List<UsuarioDTO> lista) {
        try {
            Usuario usuario;
            for (UsuarioDTO user : lista) {
                usuario = usuariorepositorio.findOne(user.getId());
                usuario.setHabilitado(Boolean.FALSE);
                usuariorepositorio.save(usuario);
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
