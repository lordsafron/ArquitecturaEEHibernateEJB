package com.hm.persistencia.dao;



import com.hm.dominio.model.Estado;
import com.hm.dto.EstadoDTO;
import com.hm.persistencia.commons.CRUDOperations;
import javax.ejb.Remote;

@Remote
public interface EstadoDAO extends CRUDOperations<Estado>{
    
    public EstadoDTO findById(int idEstado);
    
}
