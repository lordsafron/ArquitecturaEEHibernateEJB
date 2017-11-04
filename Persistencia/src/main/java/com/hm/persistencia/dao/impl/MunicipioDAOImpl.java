/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.persistencia.dao.impl;


import com.hm.dominio.model.Municipio;
import com.hm.persistencia.commons.AbstractDAO;
import com.hm.persistencia.dao.MunicipioDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class MunicipioDAOImpl extends AbstractDAO<Municipio> implements MunicipioDAO, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public MunicipioDAOImpl(){
        super(Municipio.class);
    }

    @Override
    public Municipio findById(Long idMunicipio) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        Municipio municipio = new Municipio();
        try {
            parameter.put("idMunicipio", idMunicipio);
            
            municipio = super.findOneResult(Municipio.FIND_BY_ID, parameter);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return municipio;
    }

    @Override
    public List<Municipio> findByCiudad(String ciEstado) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        List<Municipio> lMunicipio = new ArrayList<Municipio>();
        try {
            parameter.put("ciEstado", ciEstado);
            lMunicipio = super.findBy(Municipio.FIND_BY_CITY, parameter);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lMunicipio;
    }
    
    
    
}
