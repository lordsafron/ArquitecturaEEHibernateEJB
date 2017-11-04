
package com.hm.service;


import com.hm.dto.EstadoDTO;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

@Remote
public interface EstadoService {
    
    public EstadoDTO findById(int ciEstado);
    
}
