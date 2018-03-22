/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.seguridad;

import co.edu.uniautonoma.sioat.datos.dto.UsuarioDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public interface SeguridadServicio {

    Boolean logout(HttpServletRequest request, HttpServletResponse response);
    public void login(UsuarioDTO usuario, Long tiempoSesion);
}
