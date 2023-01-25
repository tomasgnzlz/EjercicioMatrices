/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5E;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/*
                APLICACIÓN PARA GENERAR TICKETS
    Datos productos: nombre, cantidad, precio, tipo de IVA --> este variará entre: 4%, 10% y 21%.    CLASE RECORD.
    Datos Caja: 
        -Nº identificador aleatorio. El cliente coloca los productos en la cinta.
        -Tendrá función de generar ticket que devolverá un OBJETO DE TIPO TICKET en función de los productos que se eneucntren en la caja
        -Datos Tickets: 
            ·Fecha en la que se generá, y la lista de productos que se desea comprar.
            ·Ejemplo de ToString de los tickets. 
    Datos Cinta: nº indeterminado de productos, se puede: añadir, eliminar, y saber el nº de productos que hay en la cinta. 
 */
public class SuperMercado {

    public static void main(String[] args) {
//      A)Se crean los productos que el cliente va a pasar por la cinta para comprar. 
//      Para que todos los productos se vean bien en el Ticket el espacio donde debería de ir el ticket ha de opcupar 
        Productos agua = new Productos("Botella agua", 3  , 3, 4, 9);
        Productos salmon = new Productos("Salmon      ", 0.9, 2, 10, 1.8);
        Productos aceitunas = new Productos("Aceitunas   ", 3.5, 1, 21, 3.5);
        Productos desosorante = new Productos("Desodorante ", 0.75, 2, 21, 1.5);
        Productos pavo = new Productos("pavo        ", 5, 1, 21, 5);
        Productos queso = new Productos("Queso       ", 1.65, 1, 10, 1.65);

//      B)Creo una cinta para poder pasarla a la Caja. 
        Cinta cinta1 = new Cinta();

//      X)Creo una caja, caja que va a tener como Cinta la creada anterioirmente. 
        Caja caja1 = new Caja(cinta1, 1);
//      C)Añado los productos creados en el primer paso. 
        cinta1.añadirProd(agua);
        cinta1.añadirProd(salmon);
        cinta1.añadirProd(aceitunas);
        cinta1.añadirProd(desosorante);
        cinta1.añadirProd(queso);
        cinta1.añadirProd(pavo);

//      D)Genero el ticket que será expedido en la Caja1.
        caja1.generarTicket();
//      E)Imprimo el ticket por pantalla de la compra. 
        System.out.println(caja1.generarTicket());


    }
}
