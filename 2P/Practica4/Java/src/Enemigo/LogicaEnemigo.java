/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enemigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pablo Che
 */
public class LogicaEnemigo extends Thread{
    
    Random rand = new Random();
    Random rand2 = new Random();
    List <Integer> posiciones = new ArrayList<Integer>();
        
        public List<Integer> posicionBarcosEnemigo(int valorTamaño)
        {

            for (int i = 0; i < 5; i++)
            {
                int index = rand.nextInt(valorTamaño);
                
                if (!posiciones.contains(index) || !(index < 1))
                {
                    posiciones.add(index);
                }
                else
                {
                    index = rand.nextInt(valorTamaño);
                }
            }
          
            return posiciones;
        }

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
    
}
