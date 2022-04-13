/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cl.mundopc;
/**
 *
 * @author Fernando Davila
 */
public class Orden {
    private  final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden (){
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    
    
    public void agregarComputadora(Computadora comp){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = comp;
        }else {
            System.out.println("se ha superado el limite maximo de computadoras");
            System.out.println("limite = "+Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden : #"+this.idOrden);
        
        for (int i = 0; i < this.contadorComputadoras ; i++) { 
            //se intentó usar "computadoras.lenght; " 
            //sin embargo recorria el array completo, dando valores nulos a los espacios no asignados
            System.out.println("Monitor marca: "+this.computadoras[i].getMonitor().getMarca() + " " + this.computadoras[i].getMonitor().getTamanio() + " pulgadas");
            System.out.println("Mouse marca "+ this.computadoras[i].getMouse().getMarca() + " Entrada tipo "+this.computadoras[i].getMouse().getTipoEntrada());
            System.out.println("Teclado marca "+ this.computadoras[i].getTeclado().getMarca() + " Entrada tipo "+this.computadoras[i].getTeclado().getTipoEntrada());
            
        }
    }
}
