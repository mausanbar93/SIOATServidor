/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniautonoma.sioat.repositorio;

import co.edu.uniautonoma.sioat.datos.ActividadEconomica;
import co.edu.uniautonoma.sioat.datos.CodigoAdministracion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Brayan Steven Perafan Ordonez
 */
public interface CodigoAdministracionRepositorio extends CrudRepository<CodigoAdministracion, Integer> {
    
}
