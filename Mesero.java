/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate_karina;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesero")
public class Mesero {
    @Id
   @Column(name = "idMesero")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMesero;
    
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

    public Mesero() {
    }

    public Mesero(int idMesero, String nombres, String apellido1, String apellido2, String FechaNac, boolean EsActivo, String EstadoCivil) {
        this.idMesero = idMesero;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.FechaNac = FechaNac;
        this.EsActivo = EsActivo;
        this.EstadoCivil = EstadoCivil;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
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
    

}
