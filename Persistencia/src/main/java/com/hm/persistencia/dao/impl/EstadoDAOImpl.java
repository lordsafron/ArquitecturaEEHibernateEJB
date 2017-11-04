package com.hm.persistencia.dao.impl;


import com.hm.dominio.model.Estado;
import com.hm.dto.EstadoDTO;
import com.hm.persistencia.commons.AbstractDAO;
import com.hm.persistencia.dao.EstadoDAO;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class EstadoDAOImpl extends AbstractDAO<Estado> implements EstadoDAO, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    
    public EstadoDAOImpl(){
        super(Estado.class);
    }

    @Override
    public EstadoDTO findById(int ciEstado) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        Estado estado = new Estado();
        EstadoDTO estadoDTO = new EstadoDTO();
        
        try {
            parameter.put("ciEstado", ciEstado);
            
            estado = super.findOneResult(Estado.FIND_BY_ID, parameter);
            estadoDTO.toConvertEstadoDTO(estado);
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return estadoDTO;
    }
    
    
    
}
