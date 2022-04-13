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
public class Mouse extends DispositivoEntrada {
    
   private int idMouse;
   private static int contadorMouses;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMouses;      
    }

    
    
    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", contadorMouses=" + contadorMouses+ super.toString() +'}';
    }
   
    
    
}
