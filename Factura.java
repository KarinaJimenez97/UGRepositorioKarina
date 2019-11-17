package com.mycompany.hibernate_karina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
   @Id
   @Column(name = "idFactura")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;
    
   @Column(name="fecFactura")
   private String fecFactura;
    @Column(name="Cliente")
   private int Cliente;
     @Column(name="Mesero")
   private int Mesero;
      @Column(name="Platillo")
   private int Platillo;
       @Column(name="Bebida")
   private int Bebida;
        @Column(name="Mesa")
   private int Mesa;

    public Factura() {
    }

    public Factura(int idFactura, String fecFactura, int Cliente, int Mesero, int Platillo, int Bebida, int Mesa) {
        this.idFactura = idFactura;
        this.fecFactura = fecFactura;
        this.Cliente = Cliente;
        this.Mesero = Mesero;
        this.Platillo = Platillo;
        this.Bebida = Bebida;
        this.Mesa = Mesa;
    }

    public void imprimir() {
		System.out.println(fecFactura);
	}
    
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecFactura() {
        return fecFactura;
    }

    public void setFecFactura(String fecFactura) {
        this.fecFactura = fecFactura;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public int getMesero() {
        return Mesero;
    }

    public void setMesero(int Mesero) {
        this.Mesero = Mesero;
    }

    public int getPlatillo() {
        return Platillo;
    }

    public void setPlatillo(int Platillo) {
        this.Platillo = Platillo;
    }

    public int getBebida() {
        return Bebida;
    }

    public void setBebida(int Bebida) {
        this.Bebida = Bebida;
    }

    public int getMesa() {
        return Mesa;
    }

    public void setMesa(int Mesa) {
        this.Mesa = Mesa;
    }
    
        
}
