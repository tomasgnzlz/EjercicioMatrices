/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5E;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author tomas
 */
public class Caja {
    //Se crean aquellos atributos que tendrán las distintas cajas que se creen. 
     private int id;
     private Cinta cinta;

     //Constructor predeterminado. 
    public Caja( Cinta cinta, int id) {
        //No le paso el id
        this.id = id;
        this.cinta = cinta;
    }
    
    //Se crea el método que devolverá el ticket que se imprimirá en la caja. 
    public Ticket generarTicket(){
        //Genero un ticket a partir de la cinta que le paso. 
        Ticket ticket1 = new Ticket(cinta);
        return ticket1;
        
    }
    
    
}
