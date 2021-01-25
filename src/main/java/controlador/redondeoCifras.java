/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author SergioCaballeroSáez
 */
public class redondeoCifras {
  public static void main(String[] args) {
	double numero = 15.1;
	System.out.println("Originalmente el número es: " + numero);
	
	System.out.println("Con round: " + Math.round(numero));
	
	System.out.println("Con floor: " + Math.floor(numero));
	
	System.out.println("Con ceil: " + Math.ceil(numero));
  }
}
