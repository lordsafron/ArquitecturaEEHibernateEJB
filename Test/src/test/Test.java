/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.hm.dto.EstadoDTO;
import com.hm.service.EstadoService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author HugoM
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            EstadoService estadoService = (EstadoService)ctx.lookup("com.hm.service.EstadoService");
            EstadoDTO estadoDTO = estadoService.findById(1);
            System.out.println("estadoDTO: " + estadoDTO.getNombreEstado());
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
    
}
