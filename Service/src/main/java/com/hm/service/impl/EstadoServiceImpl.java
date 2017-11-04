/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.service.impl;


import com.hm.dto.EstadoDTO;
import com.hm.persistencia.dao.EstadoDAO;
import com.hm.service.EstadoService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author HugoM
 */
@Stateless
public class EstadoServiceImpl implements EstadoService, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @EJB(lookup = "com.hm.persistencia.dao.EstadoDAO")
    private EstadoDAO estadoDAO;
    
    public EstadoServiceImpl(){}

    @Override
    public EstadoDTO findById(int ciEstado) {
        EstadoDTO estado = new EstadoDTO();
        //EstadoDTO estadoDTO = null;
        try {
            estado = estadoDAO.findById(ciEstado);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return estado;
    }
    
}
