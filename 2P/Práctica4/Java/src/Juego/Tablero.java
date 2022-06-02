package Juego;

import Enemigo.EleccionEnemigo;
import Enemigo.LogicaEnemigo;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.imageio.spi.ImageTranscoderSpi;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Che
 */
public class Tablero extends javax.swing.JFrame {
    
    //Lista para almancenar
    List<JButton> botonesPosicionJugador;
    List<JButton> botonesPosicionEnemigo;
    List<Integer> RandomPosicionBarcos = new ArrayList<Integer>();
    Scanner sc  = new Scanner (System.in);

    //Usar paquete de la logica del enemigo
    LogicaEnemigo logicEnem = new LogicaEnemigo();

    //Valores que se usaran dentro de la ejecuacion
    int totalBarcos = 5;
    int rondas = 10;
    int puntosDeJugador;
    int puntoDeEnemigo;
    
    public Tablero() {
        initComponents();
        ReiniciarJuego();
    }

    
     private void ReiniciarJuego() {
         
        botonesPosicionJugador = new ArrayList<JButton>(Arrays.asList(A1,A2,A3,A4,A5,B1,B2,B3,B4,B5,C1,C2,
        C3,C4,C5,D1,D2,D3,D4,D5,E1,E2,E3,E4,E5)); 

        botonesPosicionEnemigo = new ArrayList<JButton>(Arrays.asList(F6,F7,F8,F9,F10,G6,G7,G8,G9,G10,H6,
        H7,H8,H9,H10,I6,I7,I8,I9,I10,J6,J7,J8,J9,J10));


        posicionesEnemigoComboBox.removeAllItems();
            
            for (int i = 0; i < botonesPosicionEnemigo.size(); i++)
            {
                botonesPosicionEnemigo.get(i).setEnabled(true);
                botonesPosicionEnemigo.get(i).setToolTipText(null);
                
                posicionesEnemigoComboBox.addItem(botonesPosicionEnemigo.get(i).getText()); 
            } 
            
            for (int i = 0; i < botonesPosicionJugador.size(); i++)
            {
                botonesPosicionJugador.get(i).setEnabled(true);
                botonesPosicionJugador.get(i).setToolTipText(null);

            }
            
            puntosDeJugador = 0;
            puntoDeEnemigo = 0;
            rondas = 10;
            totalBarcos = 5;

            txtpuntosJugador.setText(String.valueOf(puntosDeJugador));
            txtpuntosEnemigos.setText(String.valueOf(puntoDeEnemigo));
            txtMovEnemigo.setText("");

            btnAtacar.setEnabled(false);
            
            
            RandomPosicionBarcos = logicEnem.posicionBarcosEnemigo(botonesPosicionEnemigo.size());

            for (int i = 0; i < 5; i++)
            {

                int r = RandomPosicionBarcos.get(i);
                botonesPosicionEnemigo.get(r).setToolTipText("barcoEnemigo");
                System.out.println("Barcos enemigo: " + botonesPosicionEnemigo.get(r).getText());
            }      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtpuntosEnemigos = new javax.swing.JLabel();
        txtRondas1 = new javax.swing.JLabel();
        txtpuntosJugador = new javax.swing.JLabel();
        txtMovEnemigo = new javax.swing.JLabel();
        btnAtacar = new java.awt.Button();
        posicionesEnemigoComboBox = new javax.swing.JComboBox<>();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        G9 = new javax.swing.JButton();
        G10 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        H9 = new javax.swing.JButton();
        H10 = new javax.swing.JButton();
        I6 = new javax.swing.JButton();
        I7 = new javax.swing.JButton();
        I8 = new javax.swing.JButton();
        I9 = new javax.swing.JButton();
        I10 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J9 = new javax.swing.JButton();
        J10 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BattleShip");
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpuntosEnemigos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtpuntosEnemigos.setForeground(new java.awt.Color(255, 255, 255));
        txtpuntosEnemigos.setText("00");
        jPanel1.add(txtpuntosEnemigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 190, -1, -1));

        txtRondas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtRondas1.setForeground(new java.awt.Color(255, 255, 255));
        txtRondas1.setText("Ronda: 10");
        jPanel1.add(txtRondas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        txtpuntosJugador.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtpuntosJugador.setForeground(new java.awt.Color(255, 255, 255));
        txtpuntosJugador.setText("00");
        jPanel1.add(txtpuntosJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtMovEnemigo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtMovEnemigo.setForeground(new java.awt.Color(255, 255, 255));
        txtMovEnemigo.setText("A2");
        jPanel1.add(txtMovEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, -1, -1));

        btnAtacar.setActionCommand("btn");
        btnAtacar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtacar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAtacar.setLabel("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 90, 70));

        posicionesEnemigoComboBox.setBackground(new java.awt.Color(51, 255, 51));
        posicionesEnemigoComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        posicionesEnemigoComboBox.setForeground(new java.awt.Color(0, 0, 0));
        posicionesEnemigoComboBox.setMaximumRowCount(25);
        posicionesEnemigoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(posicionesEnemigoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 100, 40));

        A1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 50, 70));

        A2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 50, 70));

        A3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 50, 70));

        A4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 50, 70));

        A5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 50, 70));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 50, 70));

        B2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 50, 70));

        B3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 50, 70));

        B4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 50, 70));

        B5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 50, 70));

        C1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 50, 70));

        C2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 50, 70));

        C3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 50, 70));

        C4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 50, 70));

        C5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        C5.setText("C5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 50, 70));

        D1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 50, 70));

        D2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 50, 70));

        D3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 50, 70));

        D4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 50, 70));

        D5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 50, 70));

        E1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E1.setText("E1");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 670, 50, 70));

        E2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E2.setText("E2");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 50, 70));

        E3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E3.setText("E3");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 50, 70));

        E4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E4.setText("E4");
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 50, 70));

        E5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        E5.setText("E5");
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionBarcosJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 50, 70));

        F6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F6.setText("F6");
        jPanel1.add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 50, 70));

        F7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F7.setText("F7");
        jPanel1.add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 50, 70));

        F8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F8.setText("F8");
        jPanel1.add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 50, 70));

        F9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F9.setText("F9");
        jPanel1.add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, 50, 70));

        F10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        F10.setText("F10");
        jPanel1.add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, 60, 70));

        G6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G6.setText("G6");
        jPanel1.add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 50, 70));

        G7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G7.setText("G7");
        jPanel1.add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 50, 70));

        G8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G8.setText("G8");
        jPanel1.add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 50, 70));

        G9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G9.setText("G9");
        jPanel1.add(G9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 400, 50, 70));

        G10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        G10.setText("G10");
        jPanel1.add(G10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 60, 70));

        H6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H6.setText("H6");
        jPanel1.add(H6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 50, 70));

        H7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H7.setText("H7");
        jPanel1.add(H7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 50, 70));

        H8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H8.setText("H8");
        jPanel1.add(H8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 50, 70));

        H9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H9.setText("H9");
        jPanel1.add(H9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 50, 70));

        H10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H10.setText("H10");
        jPanel1.add(H10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, 60, 70));

        I6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        I6.setText("I6");
        jPanel1.add(I6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 50, 70));

        I7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        I7.setText("I7");
        jPanel1.add(I7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 50, 70));

        I8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        I8.setText("I8");
        jPanel1.add(I8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 50, 70));

        I9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        I9.setText("I9");
        jPanel1.add(I9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 50, 70));

        I10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        I10.setText("I10");
        jPanel1.add(I10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 60, 70));

        J6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        J6.setText("J6");
        jPanel1.add(J6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 670, 50, 70));

        J7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        J7.setText("J7");
        jPanel1.add(J7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 670, 50, 70));

        J8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        J8.setText("J8");
        jPanel1.add(J8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 50, 70));

        J9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        J9.setText("J9");
        jPanel1.add(J9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 50, 70));

        J10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        J10.setText("J10");
        jPanel1.add(J10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 60, 70));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tableroUnix.png"))); // NOI18N
        imagen.setPreferredSize(new java.awt.Dimension(1200, 830));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 802));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PosicionBarcosJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosicionBarcosJugadorActionPerformed
        
         if (totalBarcos > 0)
            {      
                for(int i=0; i<botonesPosicionJugador.size();i++)
                {
                                          
                    if((botonesPosicionJugador.get(i).getText() == evt.getActionCommand()) 
                            && botonesPosicionJugador.get(i).getToolTipText() != "barcoJugador" ){
                            
                        botonesPosicionJugador.get(i).setToolTipText("barcoJugador");
                        botonesPosicionJugador.get(i).setBackground(Color.ORANGE);  
                        totalBarcos -= 1;    
                    }
                }   
            }
            if (totalBarcos == 0)
            {
                btnAtacar.setEnabled(true);
                btnAtacar.setBackground(Color.red);
            }
        
        
    }//GEN-LAST:event_PosicionBarcosJugadorActionPerformed

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        
            if (posicionesEnemigoComboBox.getSelectedItem() != "")
            {
                
                int posicionAtaque = posicionesEnemigoComboBox.getSelectedIndex();
                
                    rondas -= 1;
                    txtRondas1.setText("Ronda: " + String.valueOf(rondas));
                    
                    
                    if (botonesPosicionEnemigo.get(posicionAtaque).getToolTipText() == "barcoEnemigo")
                    {

                        botonesPosicionEnemigo.get(posicionAtaque).setBackground(Color.red);
                        puntosDeJugador += 1;
                        txtpuntosJugador.setText(String.valueOf(puntosDeJugador));
                        JuegoEnemigo();
                    }
                    else
                    {
                        botonesPosicionEnemigo.get(posicionAtaque).setBackground(Color.BLUE);
                        JuegoEnemigo();
                    }   
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Seleciona una posicióna a atacar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }    
    }//GEN-LAST:event_btnAtacarActionPerformed

     private void JuegoEnemigo() {
         
         
         if (botonesPosicionJugador.size() > 0 && rondas > 0)
            {
                rondas -= 1;

                txtRondas1.setText("Ronda: "+ String.valueOf(rondas));

                int elecciAtacar;
                elecciAtacar = logicEnem.eleccionEnemigo(botonesPosicionJugador.size());

                if (botonesPosicionJugador.get(elecciAtacar).getToolTipText() == "barcoJugador")
                {
 
                    txtMovEnemigo.setText(botonesPosicionJugador.get(elecciAtacar).getText());
                    botonesPosicionJugador.get(elecciAtacar).setBackground(Color.red);
                    puntoDeEnemigo += 1;
                    txtpuntosEnemigos.setText(String.valueOf(puntoDeEnemigo));  
                }
                else
                {
                  
                    txtMovEnemigo.setText(botonesPosicionJugador.get(elecciAtacar).getText());
                    botonesPosicionJugador.get(elecciAtacar).setBackground(Color.BLUE);
                    
                }
            }

            if (rondas < 1 || puntoDeEnemigo > 2 || puntosDeJugador > 2)
            {

                if (puntosDeJugador > puntoDeEnemigo)
                {
                    JOptionPane.showMessageDialog(null, "Felicidades ganaste la partida");
                    System.exit(0);
                }
                else if (puntoDeEnemigo > puntosDeJugador)
                {
                    JOptionPane.showMessageDialog(null, "JAJAJAJA, perdiste. Sigue practicando!!");
                    System.exit(0);
                }
                else if (puntoDeEnemigo == puntosDeJugador)
                {
                    JOptionPane.showMessageDialog(null, "Empate!!! repitan el juego");
                    System.exit(0);
                }
            }
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton F10;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton G10;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton G9;
    private javax.swing.JButton H10;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JButton H9;
    private javax.swing.JButton I10;
    private javax.swing.JButton I6;
    private javax.swing.JButton I7;
    private javax.swing.JButton I8;
    private javax.swing.JButton I9;
    private javax.swing.JButton J10;
    private javax.swing.JButton J6;
    private javax.swing.JButton J7;
    private javax.swing.JButton J8;
    private javax.swing.JButton J9;
    private java.awt.Button btnAtacar;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> posicionesEnemigoComboBox;
    private javax.swing.JLabel txtMovEnemigo;
    private javax.swing.JLabel txtRondas1;
    private javax.swing.JLabel txtpuntosEnemigos;
    private javax.swing.JLabel txtpuntosJugador;
    // End of variables declaration//GEN-END:variables

}
