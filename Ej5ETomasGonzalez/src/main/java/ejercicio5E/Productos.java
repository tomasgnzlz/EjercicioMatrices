/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5E;

/**
 *
 * @author tomas
 */
//public class Productos {
    /*
    Se crea una clase Record en ves de una covencional ya que estas son las
    unicas caracteristicas que tengan relación con los productos que se vayan 
    a comprar. 
    */
    public record Productos(String nombre,double precio, int cantidad,  double IVA,double precioTotalSinIVA ) {        
}

