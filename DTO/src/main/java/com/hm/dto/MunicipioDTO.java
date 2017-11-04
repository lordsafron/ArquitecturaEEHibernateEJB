/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HugoM
 */
public class MunicipioDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private EstadoDTO estado;

    private int idMunicipio;
    
    private String descripcionMunicipio;
    
    private String nombreMunicipio;
    
    private Date fechaFundacionM;
    
    /**
     * @return the nombreMunicipio
     */
    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    /**
     * @param nombreMunicipio the nombreMunicipio to set
     */
    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    /**
     * @return the fechaFundacionM
     */
    public Date getFechaFundacionM() {
        return fechaFundacionM;
    }

    /**
     * @param fechaFundacionM the fechaFundacionM to set
     */
    public void setFechaFundacionM(Date fechaFundacionM) {
        this.fechaFundacionM = fechaFundacionM;
    }
    
    public MunicipioDTO(){
        
    }

    public MunicipioDTO(EstadoDTO estado, int idMunicipio, String descripcionMunicipio, String nombreMunicipio, Date fechaFundacionM) {
        this.estado = estado;
        this.idMunicipio = idMunicipio;
        this.descripcionMunicipio = descripcionMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.fechaFundacionM = fechaFundacionM;
    }

    

    

    

    /**
     * @return the idCiudad
     */
    public EstadoDTO getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    /**
     * @return the idMunicipio
     */
    public int getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * @param idMunicipio the idMunicipio to set
     */
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * @return the descripcionMunicipio
     */
    public String getDescripcionMunicipio() {
        return descripcionMunicipio;
    }

    /**
     * @param descripcionMunicipio the descripcionMunicipio to set
     */
    public void setDescripcionMunicipio(String descripcionMunicipio) {
        this.descripcionMunicipio = descripcionMunicipio;
    }

    @Override
    public String toString() {
        return "Municipio{" + "estado=" + estado + ", idMunicipio=" + idMunicipio + ", descripcionMunicipio=" + descripcionMunicipio + '}';
    }

    
    
    
    
}
