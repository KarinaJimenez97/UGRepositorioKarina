
package com.mycompany.hibernate_karina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente {
   
    @Id
   @Column(name = "idCliente")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    
   @Column(name="nombres")
   private String nombres;
   @Column(name="apellido1")
   private String apellido1;
   @Column(name="apellido2")
   private String apellido2;
   @Column(name="FechaNac")
   private String FechaNac;
   @Column(name="EsActivo")
   private boolean EsActivo;
   @Column(name="EstadoCivil")
   private String EstadoCivil;
   @Column(name="Observaciones")
   private String Observaciones;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombres, String apellido1, String apellido2, String FechaNac, boolean EsActivo, String EstadoCivil, String Observaciones) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.FechaNac = FechaNac;
        this.EsActivo = EsActivo;
        this.EstadoCivil = EstadoCivil;
        this.Observaciones = Observaciones;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
   
   
    
}
