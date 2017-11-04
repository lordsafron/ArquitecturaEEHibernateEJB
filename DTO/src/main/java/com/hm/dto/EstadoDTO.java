package com.hm.dto;

import com.hm.dominio.model.Estado;
import java.io.Serializable;
import java.util.Date;

public class EstadoDTO implements Serializable {
    
    private static long serialVersionUID = 1L;

    private int idEstado;
    
    private String nombreEstado;
    
    private String descripcionEstado;
    
    private Date fechaDeFundado;
    
    public EstadoDTO(){
        
    }

    public EstadoDTO(int idEstado, String nombreEstado, String descripcionEstado, Date fechaDeFundado) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.descripcionEstado = descripcionEstado;
        this.fechaDeFundado = fechaDeFundado;
    }

    /**
     * @return the id_estado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the nombreEstado
     */
    public String getNombreEstado() {
        return nombreEstado;
    }

    /**
     * @param nombreEstado the nombreEstado to set
     */
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    /**
     * @return the descripcionEstado
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * @param descripcionEstado the descripcionEstado to set
     */
    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    /**
     * @return the fechaDeFundado
     */
    public Date getFechaDeFundado() {
        return fechaDeFundado;
    }

    /**
     * @param fechaDeFundado the fechaDeFundado to set
     */
    public void setFechaDeFundado(Date fechaDeFundado) {
        this.fechaDeFundado = fechaDeFundado;
    }

    @Override
    public String toString() {
        return "Estado{" + "idEstado=" + idEstado + ", nombreEstado=" + nombreEstado + ", descripcionEstado=" + descripcionEstado + ", fechaDeFundado=" + fechaDeFundado + '}';
    }
    
    public EstadoDTO toConvertEstadoDTO(Estado estado){
        
        EstadoDTO estadoDTO = new EstadoDTO();
        estadoDTO.setIdEstado(estado.getIdEstado());
        estadoDTO.setNombreEstado(estado.getNombreEstado());
        estadoDTO.setDescripcionEstado(estado.getDescripcionEstado());
        estadoDTO.setFechaDeFundado(estado.getFechaDeFundado());
        
        return estadoDTO;
        
    }
    
}
