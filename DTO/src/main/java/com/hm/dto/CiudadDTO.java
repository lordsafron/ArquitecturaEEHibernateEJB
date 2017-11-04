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
public class CiudadDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private MunicipioDTO municipio;
    
    private int idCiudad;
    
    private String descripcionCiudad;

    private String nombreCiudad;
    
    private Date fechaFundada;
    
    public CiudadDTO(){
        
    }

    public CiudadDTO(MunicipioDTO municipio, int idCiudad, String descripcionCiudad, String nombreCiudad, Date fechaFundada) {
        this.municipio = municipio;
        this.idCiudad = idCiudad;
        this.descripcionCiudad = descripcionCiudad;
        this.nombreCiudad = nombreCiudad;
        this.fechaFundada = fechaFundada;
    }

    

    
    /**
     * @return the estado
     */
    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }
    

    /**
     * @return the idCiudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the descripcionCiudad
     */
    public String getDescripcionCiudad() {
        return descripcionCiudad;
    }

    /**
     * @param descripcionCiudad the descripcionCiudad to set
     */
    public void setDescripcionCiudad(String descripcionCiudad) {
        this.descripcionCiudad = descripcionCiudad;
    }
    
    /**
     * @return the nombreCiudad
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * @param nombreCiudad the nombreCiudad to set
     */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    /**
     * @return the fechaFundada
     */
    public Date getFechaFundada() {
        return fechaFundada;
    }

    /**
     * @param fechaFundada the fechaFundada to set
     */
    public void setFechaFundada(Date fechaFundada) {
        this.fechaFundada = fechaFundada;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "municipio=" + municipio + ", idCiudad=" + idCiudad + ", descripcionCiudad=" + descripcionCiudad + ", nombreCiudad=" + nombreCiudad + ", fechaFundada=" + fechaFundada + '}';
    }

       
    
    
}
