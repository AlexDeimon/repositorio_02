/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Final.BDMuseo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author DIEGO
 */
@Entity
@Table(name = "obra")
public class Obra {
    
    @Id
    @Column(name="obr_id")
    private Long obrId;
    
    @Column(name="obr_nombre")
    private String obrNombre;
    
    @Column(name="obr_tipo")
    private String obrTipo;
    
    @Column(name="obr_costo")
    private Long obrCosto;
    

    @Column(name="exp_id")
    Long expId;

    public Long getObrId() {
        return obrId;
    }

    public void setObrId(Long obrId) {
        this.obrId = obrId;
    }

    public String getObrNombre() {
        return obrNombre;
    }

    public void setObrNombre(String obrNombre) {
        this.obrNombre = obrNombre;
    }

    public String getObrTipo() {
        return obrTipo;
    }

    public void setObrTipo(String obrTipo) {
        this.obrTipo = obrTipo;
    }

    public Long getObrCosto() {
        return obrCosto;
    }

    public void setObrCosto(Long obrCosto) {
        this.obrCosto = obrCosto;
    }

    public Long getExpId() {
        return expId;
    }

    public void setExpId(Long expId) {
        this.expId = expId;
    }

    @Override
    public String toString() {
        return "Obra{" + "obrId=" + obrId + ", obrNombre=" + obrNombre + ", obrTipo=" + obrTipo + ", obrCosto=" + obrCosto + ", expId=" + expId + "}";
    }




       
    
    
}
