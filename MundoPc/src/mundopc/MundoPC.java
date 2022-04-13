/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.cl.mundopc.*;

/**
 *
 * @author Fernando Davila
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mouse mouse = new Mouse("ps2", "HP" );
        Teclado teclado = new Teclado("USB", "aa");
        Monitor monitor = new Monitor("HP", 22);
        Computadora computadora = new Computadora("computadora 1 ", monitor, teclado, mouse);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora);
        orden1.mostrarOrden();
        
        
    }
    
}
