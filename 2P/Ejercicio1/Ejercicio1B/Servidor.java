package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5000);
        Socket c = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
        PrintWriter out = new PrintWriter(c.getOutputStream());

        System.out.println("Servidro en linea");

        //Protocolo comunicacion: primero servidor y luego cliente
        String line = "";
        do{
            line =  in.readLine();
            System.out.println(line);

            if(line.equals("bye")){
                out.println(line);
            }else{
                out.println("Ok desde el servidor: " + line);
            }
            out.flush();
            
            System.out.println("Ok desde el servidor: " + line);
        }while(!line.equals("bye"));
        c.close();
        server.close();
    }
}