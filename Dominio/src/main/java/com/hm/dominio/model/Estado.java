package com.hm.dominio.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ESTADO")
@NamedQueries({
    @NamedQuery(name = "Estado.findById",
            query = "SELECT e FROM Estado e WHERE e.idEstado = :ciEstado")
})
public class Estado implements Serializable {
    
    private static long serialVersionUID = 1L;
    
    public static String FIND_BY_ID = "Estado.findById";

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    
    @Id
    @Column(name = "id_estado")
    private int idEstado;
    
    @Column(name = "nombre_estado")
    private String nombreEstado;
    
    @Column(name = "descripcion_estado")
    private String descripcionEstado;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fundado")
    private Date fechaDeFundado;
    
    public Estado(){
        
    }

    public Estado(int idEstado, String nombreEstado, String descripcionEstado, Date fechaDeFundado) {
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
    
    
}
