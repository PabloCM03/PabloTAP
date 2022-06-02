/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enemigo;

import java.util.Random;

/**
 *
 * @author Pablo Che
 */
public class EleccionEnemigo extends Thread{
    
    Random rand2 = new Random();
    
    public int eleccionEnemigo(int tamaño)
        {
            int aleatorio = rand2.nextInt(tamaño);
            int eleccion=0;

                if(!(aleatorio < 1))
                {
                    eleccion = aleatorio;
                }
                else
                {
                    aleatorio = rand2.nextInt(tamaño);
                }
            return eleccion;
        }
    
    
    public void run(int s){
        eleccionEnemigo(s);
    }
    
}
