/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SergioCaballeroSáez
 */
public class Billete {
    private String FechaVuelo;
    private int cantidad;
    private double precio;
    private int mes;
    
    
    public Billete() {
    }

    public Billete(String FechaVuelo, int cantidad) {
        this.FechaVuelo = FechaVuelo;
        this.cantidad = cantidad;
    }
    
    public double getImporte(){
        double precio;
        int mes;
        mes = Integer.parseInt(this.FechaVuelo.substring(5,7));
        if(mes>=5 && mes<=9){ //TEMPORADA ALTA
            precio=150.0;
        }else{precio=90.0;}
        double precioSinIva = precio*this.cantidad;
        return precioSinIva*1.21;
        }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    }
