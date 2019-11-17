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
@Table(name = "bebida")
public class Bebida {
   
    @Id
   @Column(name = "idBebida")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebida;
    
   @Column(name="Nombres")
   private String Nombres;
   @Column(name="Valor")
   private int Valor;
   @Column(name="EsActivo")
   private boolean EsActivo;
  

    public Bebida() {
    }

    public Bebida(int idBebida, String Nombres, int Valor, boolean EsActivo) {
        this.idBebida = idBebida;
        this.Nombres = Nombres;
        this.Valor = Valor;
        this.EsActivo = EsActivo;
    }

        public int getIdBebida() {
            return idBebida;
        }

        public void setIdBebida(int idBebida) {
            this.idBebida = idBebida;
        }

        public String getNombres() {
            return Nombres;
        }

        public void setNombres(String Nombres) {
            this.Nombres = Nombres;
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
