package Ejercicio1;

import java.util.Random;

public class Ejercicio1 extends Thread {

    private String mensaje;

    public Ejercicio1(String threadName){
        this.mensaje = "Hola desde el hilo " + threadName;
    }

    public void run()
    {
        Random r = new Random();
        int timeToSleep = r.nextInt(1000);
        try 
        {
            this.sleep(timeToSleep);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println(mensaje);
    }

    public void sleep (int millis) throws InterruptedException{
        Thread.sleep(millis);
    }

    public static void main(String[] args) 
    {
       Ejercicio1 hilo1 = new Ejercicio1("Hilo 10");
       Ejercicio1 hilo2 = new Ejercicio1("Hilo 11");
       Ejercicio1[] hilos = new Ejercicio1[10];

       for(int i=0; i < hilos.length; i++)
       {
           hilos[i] = new Ejercicio1("Hilo " + i);
           hilos[i].start();
       }

       hilo1.start();
        try 
        {
            hilo1.sleep(500);
        } catch (InterruptedException e) 
        {
           e.printStackTrace();
        }

       hilo2.start();
    }
}