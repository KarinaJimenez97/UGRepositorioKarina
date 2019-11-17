
package com.mycompany.hibernate_karina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesa")
public class Mesa {
    @Id
   @Column(name = "idMesa")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMesa;
    
   @Column(name="NumComensales")
   private int NumComensales ;
   @Column(name="Ubicacion")
   private String Ubicacion;
   @Column(name="EsActivo")
   private boolean EsActivo;

    public Mesa() {
    }

    public Mesa(int idMesa, int NumComensales, String Ubicacion, boolean EsActivo) {
        this.idMesa = idMesa;
        this.NumComensales = NumComensales;
        this.Ubicacion = Ubicacion;
        this.EsActivo = EsActivo;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumComensales() {
        return NumComensales;
    }

    public void setNumComensales(int NumComensales) {
        this.NumComensales = NumComensales;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
  
}
