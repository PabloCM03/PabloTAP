package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket c = new Socket("127.0.0.1",1024);
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
        BufferedReader internal_read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(c.getOutputStream());

        //Protocolo de comunicacion
        String answer="";
        do{
            System.out.println("Escriba su mensaja a enviar");
            String line = internal_read.readLine();
            out.println(line);
            out.flush();
            answer = in.readLine();
            System.out.println("Ya me contestaron: " + answer);
        }while(!answer.equals("bye"));
        c.close();
    }
}