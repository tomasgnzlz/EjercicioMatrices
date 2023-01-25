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
public class Ticket {

    //Se creán los atributos que tendrá el ticket para su posterior entrega. 
    private Cinta cinta;
    private Productos productos;
    private LocalDate fechaExpedicionTicket;
    private LocalTime horaExpedicionTicket;
    private LocalTime minutosExpedicionTicket;

    //Constructor predeterminado. 
    public Ticket(Cinta cinta) {
        this.cinta = cinta;
        this.fechaExpedicionTicket = LocalDate.now();
        this.horaExpedicionTicket = LocalTime.now();
        this.minutosExpedicionTicket = LocalTime.now();
    }

    /*
    ToString que mostrará por consola el diseño del ticket que será expedido 
    al comprar en el SuperMercado. 
     */
    @Override
    public String toString() {
        return "------------------------------------------------------------------\n"
                + "                         El Supermercado de DAW1                            \n"
                + "Fecha: " + fechaExpedicionTicket + "                                      " + "Hora: " + horaExpedicionTicket.getHour() + ":" + minutosExpedicionTicket.getMinute() + "\n"
                + "------------------------------------------------------------------\n"
                + "Producto         Precio        Cantidad      IVA     Precio sin IVA \n"
                + "------------------------------------------------------------------" + "\n"
                + "" + cinta + "\n" //Lista de productos contenidos en el main
                + "------------------------------------------------------------------\n"
                + "Nº prod.iva 4%: " + cinta.cantidadProductosIvaCuatro() + "   Precio sin IVA: " + cinta.precioSinIVACuatro() + "  Precio con IVA: " + cinta.precioConIVACuatro(productos) + "\n"
                + "Nº prod.iva 10%: " + cinta.cantidadProductosIvaDiez() + "    Precio sin IVA: " + cinta.precioSinIVADiez() + "    Precio con IVA: " + cinta.precioConIVAdiez(productos) + "\n"
                + "Nº prod.iva 21%: " + cinta.cantidadProductosIvaVeintiuno() + "   Precio sin IVA: " + cinta.precioSinIVAVeintiuno() + "   Precio con IVA: " + cinta.precioConIVAVeintiuno(productos) + "\n"
                + "------------------------------------------------------------------\n"
                + "Total a pagar: " + cinta.PrecioTotalConIVA() + " -- Gracias por su visita.  \n";
    }

}
