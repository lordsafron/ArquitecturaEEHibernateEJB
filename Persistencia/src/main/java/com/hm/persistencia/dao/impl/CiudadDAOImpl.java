/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.persistencia.dao.impl;


import com.hm.dominio.model.Ciudad;
import com.hm.persistencia.commons.AbstractDAO;
import com.hm.persistencia.dao.CiudadDAO;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class CiudadDAOImpl extends AbstractDAO<Ciudad> implements CiudadDAO, Serializable {
    
    private static final long serialVersionUID = 1L;

    public CiudadDAOImpl(){
        super(Ciudad.class);
    }
    
    @Override
    public Ciudad findById(Long ciIdCiudad) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        Ciudad ciudad = new Ciudad();
        try {
            parameter.put("ciIdCiudad", ciIdCiudad);
            
            ciudad = super.findOneResult(Ciudad.FIND_BY_ID, parameter);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ciudad;
    }
    
}
