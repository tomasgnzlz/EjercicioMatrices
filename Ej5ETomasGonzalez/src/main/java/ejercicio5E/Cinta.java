/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5E;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Cinta {

    //Se crea la lista que contendrá aquellos productos que vayan a ser comprados. 
    ArrayList<Productos> cinta;

    //Constructor que crea cintas. 
    //Las mismas que contendrán los productos que vayamos a comprar. 
    public Cinta() {
        this.cinta = new ArrayList();
    }

    //Método para añadir productos a la lista de la compra. 
    public void añadirProd(Productos producto) {
        this.cinta.add(producto);
    }

    //Método para borrar productos a la lista de la compra. 
    public void borrarProd(Productos producto) {
        this.cinta.remove(producto);

    }

    //Método que nos dice si la lista está vacía o no. 
    public boolean verListaVacia(Productos producto) {
        //Creo variable boolean. 
        boolean vacia;
        if (this.cinta.size() == 0) {
            //Si la cinta tiene 0 productos devolverá true.
            vacia = true;
        } else {
            //De lo contrario devolverá false. 
            vacia = false;
        }
        return vacia;
    }

    //ToString
    /*Modifico el ToString para que me coincida con el diseño que tendrá el 
    ticket que se mostrará por pantalla. 
     */
    @Override
    public String toString() {
        String resultado = "";
        //Bucle que me recorre toda la cinta
        for (Productos productos : cinta) {
            resultado += productos.nombre() + "     " + productos.precio() + "               " + productos.cantidad() + "           " + productos.IVA() + "     " + productos.precioTotalSinIVA() + "\n";
        }
        return resultado;
    }

    
    
    
    //Métodos que devolverá en numero de productos que tengan un IVA determinado. 
    public int cantidadProductosIvaCuatro() {
        int contador_4 = 0;
        //Bucle que recorra todo el array de la cinta.
        for (Productos productos : cinta) {
            if (productos.IVA() == 4) {
                //Si el IVA es igual a 4 el contador devuelve el nº de veces que se haya encontrado el nº en la posición indicada. 
                contador_4 = contador_4 + productos.cantidad();
            }
        }
        return contador_4;
    }

    public int cantidadProductosIvaDiez() {
        int contador_10 = 0;
        for (Productos productos : cinta) {
            if (productos.IVA() == 10) {
                contador_10 = contador_10 + productos.cantidad();
            }
        }
        return contador_10;
    }

    public int cantidadProductosIvaVeintiuno() {
        int contador_21 = 0;
        for (Productos productos : cinta) {
            if (productos.IVA() == 21) {
                contador_21 = contador_21 + productos.cantidad();
            }
        }
        return contador_21;
    }

    
    
    
    
    
    //Método que devuelve el precio de una cantidad de productos en concreto sin IVA incluido. 
    public double precioSinIVACuatro() {
        double total_4 = 0;

        for (Productos productos : cinta) {
            if (productos.IVA() == 4) {

                total_4 = (productos.cantidad() * productos.precio());
            }
        }
        return total_4;
    }

    public double precioSinIVADiez() {
        double total_10 = 0;
        for (Productos productos : cinta) {

            if (productos.IVA() == 10) {
                total_10 += (productos.cantidad() * productos.precio()); //LE METO EL + PARA QUE SUME EL PRECIO CADA VEZ QUE RECORRE EL ARRAY.
            }
        }
        return total_10;
    }

    public double precioSinIVAVeintiuno() {
        double total_21 = 0;
        for (Productos productos : cinta) {
            if (productos.IVA() == 21) {
                total_21 += (productos.cantidad() * productos.precio());
            }
        }
        return total_21;
    }

    
    
    
    
    //Método que devuelve el precio total de los productos que tengan un IVA en concreto
    public double precioConIVACuatro(Productos p) {
        double total_1 = 0;
        double noTotal = 0;
        for (Productos productos : cinta) {
            if (productos.IVA() == 4) {
                noTotal = (productos.cantidad() * productos.precio() * 4 / 100);
                total_1 = (noTotal + (productos.cantidad() * productos.precio()));
            }
        }
        return total_1;
    }

    public double precioConIVAdiez(Productos p) {
        double total_2 = 0;
        double precionottoal = 0;
        for (Productos productos : cinta) {
            if (productos.IVA() == 10) {
                //Calculo el precio que se sumaria por el IVA. 
                precionottoal = (productos.cantidad() * productos.precio() * 10 / 100); //LE METO EL + PARA QUE CADA VEZ QUE RECORRA EL ARRAY SE MUESTRE EL MENSAJE EN CUESTION
                //Calculo el precio de los productos y le sumo el IVA. 
                total_2 += (precionottoal + (productos.cantidad() * productos.precio()));
            }
        }
        return total_2;
    }

    public double precioConIVAVeintiuno(Productos p) {
        double total_3 = 0;
        double precioooooo = 0;
        double precioSinIVA = precioSinIVAVeintiuno();
        for (Productos productos : cinta) {
            if (productos.IVA() == 21) {
                //Calculo el precio que se sumaria por el IVA. 
                precioooooo += (productos.cantidad() * productos.precio() * 21 / 100);
                //Calculo el precio que tendrían los productos y le sumo el IVA. 
                //total_3 = (precioooooo + (productos.cantidad() * productos.precio()));
                total_3 = (precioSinIVA + precioooooo);
            }
        }
        return total_3;
    }

    
    
    
    
    
    
    
//Método que devuelve el precio de todos los productos con IVA incluido. 
    public double PrecioTotalConIVA() {
        double precio_Cuatro_IVA, precio_Diez_IVA, precio_Veintiuno_IVA;
        double totalGeneral = 0;

        for (Productos productos : cinta) {
            //Llamo a los métodos creados previamente para obtener la cantidad el precio de cada producto
            precio_Cuatro_IVA = precioConIVACuatro(productos);
            precio_Diez_IVA = precioConIVAdiez(productos);
            precio_Veintiuno_IVA = precioConIVAVeintiuno(productos);
            //Sumo todos los precios de los productos según el IVA y devuelvo el total de la compra. 
            totalGeneral = (precio_Cuatro_IVA + precio_Diez_IVA + precio_Veintiuno_IVA);
        }
        return totalGeneral;
    }

}
