/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.persistencia.dao;


import com.hm.dominio.model.Ciudad;
import com.hm.persistencia.commons.CRUDOperations;
import javax.ejb.Remote;

/**
 *
 * @author HugoM
 */
@Remote
public interface CiudadDAO extends CRUDOperations<Ciudad> {
    
    public Ciudad findById(Long ciIdCiudad);
    
    
}
