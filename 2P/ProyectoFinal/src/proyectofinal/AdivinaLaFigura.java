/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author Pablo Che
 */
public class AdivinaLaFigura extends javax.swing.JFrame {
    
    int pun = 0;
    int x = 0;
    String[] preguntas;
    String[] respuestas;
    
    public AdivinaLaFigura() {
        initComponents();
        initPreguntas();
        initRespuestas();  
        txtFigura.setText(preguntas[0]);  
    }
    
    private void initPreguntas() {
        
        preguntas = new String[10];
        preguntas[0] = "Tengo 4 lados, dos son cortos y 2 alargados";
        preguntas[1] = "Yo no tengo lados rectos soy redondo como una moneda";
        preguntas[2] = "Tengo 4 lados exactamente iguales";
        preguntas[3] = "Tengo tres lados y tres puntas";
        preguntas[4] = "Tengo 4 lados iguales pero no soy cuadrado";
        preguntas[5] = "Selecciona el rectangulo";
        preguntas[6] = "Selecciona el circulo";
        preguntas[7] = "Selecciona el cuadrado";
        preguntas[8] = "Selecciona el triangulo";
        preguntas[9] = "Selecciona el rombo";

    }

    private void initRespuestas() {
        
        respuestas = new String[10];
        respuestas[0] = "Inciso A";
        respuestas[1] = "Inciso B";
        respuestas[2] = "Inciso C";
        respuestas[3] = "Inciso D";
        respuestas[4] = "Inciso E";
        respuestas[5] = "Inciso A";
        respuestas[6] = "Inciso B";
        respuestas[7] = "Inciso C";
        respuestas[8] = "Inciso D";
        respuestas[9] = "Inciso E";
        
    }
    
    
    public Boolean validar(String pregunta, String respuesta)
        {
            switch (pregunta)
            {
                case "Tengo 4 lados, dos son cortos y 2 alargados":
                    if (respuesta.equals("Inciso A"))
                        return true;
                    break;
                case "Yo no tengo lados rectos soy redondo como una moneda":
                    if (respuesta.equals("Inciso B"))
                        return true;
                    break;
                case "Tengo 4 lados exactamente iguales":
                    if (respuesta.equals("Inciso C"))
                        return true;
                    break;
                case "Tengo tres lados y tres puntas":
                    if (respuesta.equals("Inciso D"))
                        return true;
                    break;
                case "Tengo 4 lados iguales pero no soy cuadrado":
                    if (respuesta.equals("Inciso E"))
                        return true;
                    break;
                case "Selecciona el rectangulo":
                    if (respuesta.equals("Inciso A"))
                        return true;
                    break;
                case "Selecciona el circulo":
                    if (respuesta.equals("Inciso B"))
                        return true;
                    break;
                case "Selecciona el cuadrado":
                    if (respuesta.equals("Inciso C"))
                        return true;
                    break;
                case "Selecciona el triangulo":
                    if (respuesta.equals("Inciso D"))
                        return true;
                    break;
                case "Selecciona el rombo":
                    if (respuesta.equals("Inciso E"))
                        return true;
                    break;
            }
            return false;
        }
    
    
        public void siguientePregunta()
        {
            if (x < preguntas.length - 1)
            {
                x++;
                txtFigura.setText(preguntas[x]);
            }
            else
            {
                ResultadoAdivina resultadoPractica = new ResultadoAdivina();
                ResultadoAdivina.result_prac.setText("Puntos obtenidos: "+(Integer.toString(pun))+"/10");
                resultadoPractica.setVisible(true);
                this.setVisible(false);
            }
        }
        
    public void setPuntaje(String answer)
    {

            if (validar(txtFigura.getText(), answer))
            {
                if (pun < preguntas.length)
                {
                    pun++;

                    siguientePregunta();
                    
                }
            }
            else
            {
                siguientePregunta();
               

            }
    }    
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        dsada = new javax.swing.JPanel();
        txtFigura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIB = new javax.swing.JButton();
        btnIC = new javax.swing.JButton();
        btnIE = new javax.swing.JButton();
        btnIA = new javax.swing.JButton();
        btnID = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel14.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Adivina la Figura");

        dsada.setBackground(new java.awt.Color(255, 255, 255));

        txtFigura.setFont(new java.awt.Font("MS PGothic", 2, 18)); // NOI18N
        txtFigura.setForeground(new java.awt.Color(0, 0, 0));
        txtFigura.setText("Adivina la Figura");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pregunta.png"))); // NOI18N

        javax.swing.GroupLayout dsadaLayout = new javax.swing.GroupLayout(dsada);
        dsada.setLayout(dsadaLayout);
        dsadaLayout.setHorizontalGroup(
            dsadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dsadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFigura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        dsadaLayout.setVerticalGroup(
            dsadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dsadaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(dsadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFigura)
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fcirculo.png"))); // NOI18N
        btnIB.setToolTipText("Inciso B");
        btnIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIBActionPerformed(evt);
            }
        });

        btnIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fcuadrado.png"))); // NOI18N
        btnIC.setToolTipText("Inciso C");
        btnIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICActionPerformed(evt);
            }
        });

        btnIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frombo.png"))); // NOI18N
        btnIE.setToolTipText("Inciso E");
        btnIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIEActionPerformed(evt);
            }
        });

        btnIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frectangulo.png"))); // NOI18N
        btnIA.setToolTipText("Inciso A");
        btnIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIAActionPerformed(evt);
            }
        });

        btnID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ftriangulo.png"))); // NOI18N
        btnID.setToolTipText("Inciso D");
        btnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dsada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnIB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)))
                .addComponent(dsada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIE))
                    .addComponent(btnIA)
                    .addComponent(btnIC))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Unidad_1 c = new Unidad_1();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAActionPerformed
        
       setPuntaje(btnIA.getToolTipText());
    }//GEN-LAST:event_btnIAActionPerformed

    private void btnIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIBActionPerformed
        setPuntaje(btnIB.getToolTipText());
    }//GEN-LAST:event_btnIBActionPerformed

    private void btnICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICActionPerformed
        setPuntaje(btnIC.getToolTipText());
    }//GEN-LAST:event_btnICActionPerformed

    private void btnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDActionPerformed
       setPuntaje(btnID.getToolTipText());
    }//GEN-LAST:event_btnIDActionPerformed

    private void btnIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIEActionPerformed
        setPuntaje(btnIE.getToolTipText());
    }//GEN-LAST:event_btnIEActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdivinaLaFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdivinaLaFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdivinaLaFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdivinaLaFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdivinaLaFigura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnIB;
    private javax.swing.JButton btnIC;
    private javax.swing.JButton btnID;
    private javax.swing.JButton btnIE;
    private javax.swing.JPanel dsada;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtFigura;
    // End of variables declaration//GEN-END:variables

    
}
