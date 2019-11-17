/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernate_karina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "platillos")
public class Platillos {
    @Id
   @Column(name = "idPlatillos")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlatillos;
    
   @Column(name="Nombre")
   private String Nombre;
   @Column(name="Valor")
   private int Valor;
   @Column(name="EsActivo")
   private boolean EsActivo;

    public Platillos() {
    }

    public Platillos(int idPlatillos, String Nombre, int Valor, boolean EsActivo) {
        this.idPlatillos = idPlatillos;
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.EsActivo = EsActivo;
    }

    public int getIdPlatillos() {
        return idPlatillos;
    }

    public void setIdPlatillos(int idPlatillos) {
        this.idPlatillos = idPlatillos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
   
}
