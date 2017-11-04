/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.persistencia.dao;


import com.hm.dominio.model.Municipio;
import com.hm.persistencia.commons.CRUDOperations;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author HugoM
 */
@Remote
public interface MunicipioDAO extends CRUDOperations<Municipio> {
    
    public Municipio findById(Long idMunicipio);
    
    public List<Municipio> findByCiudad(String ciEstado);
    
}
