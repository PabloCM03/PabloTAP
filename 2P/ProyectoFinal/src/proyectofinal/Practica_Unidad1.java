package proyectofinal;

public class Practica_Unidad1 extends javax.swing.JFrame {

    public Practica_Unidad1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta1 = new javax.swing.ButtonGroup();
        pregunta2 = new javax.swing.ButtonGroup();
        pregunta3 = new javax.swing.ButtonGroup();
        pregunta4 = new javax.swing.ButtonGroup();
        pregunta5 = new javax.swing.ButtonGroup();
        pregunta6 = new javax.swing.ButtonGroup();
        pregunta7 = new javax.swing.ButtonGroup();
        pregunta8 = new javax.swing.ButtonGroup();
        pregunta9 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        revisar_practica1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        op_verdadero1 = new javax.swing.JRadioButton();
        falso1 = new javax.swing.JRadioButton();
        falso2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        op_verdadero2 = new javax.swing.JRadioButton();
        op_falso3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        op_verdadero3 = new javax.swing.JRadioButton();
        op_falso4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        op_verdadero4 = new javax.swing.JRadioButton();
        op_falso5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        op_verdadero5 = new javax.swing.JRadioButton();
        op_falso6 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        op_verdadero6 = new javax.swing.JRadioButton();
        op_falso7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        op_verdadero7 = new javax.swing.JRadioButton();
        op_verdadero8 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        op_falso1_8 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        op_falso91 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        op_verdadero9 = new javax.swing.JRadioButton();
        op_falso93 = new javax.swing.JRadioButton();
        op_falso92 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Dubai Light", 1, 36)); // NOI18N
        label1.setText("Práctica Unidad 1");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        revisar_practica1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        revisar_practica1.setText("Revisar");
        revisar_practica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisar_practica1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contesta verdadero o falso, según corresponda:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1. El espacio de dos dimensiones es llamado también espacio \"bidimensional\".");

        pregunta1.add(op_verdadero1);
        op_verdadero1.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero1.setText("Verdadero");
        op_verdadero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero1ActionPerformed(evt);
            }
        });

        pregunta1.add(falso1);
        falso1.setForeground(new java.awt.Color(0, 0, 0));
        falso1.setText("Falso");
        falso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falso1ActionPerformed(evt);
            }
        });

        pregunta2.add(falso2);
        falso2.setForeground(new java.awt.Color(0, 0, 0));
        falso2.setText("Falso");
        falso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falso2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("2. El espacio de tres dimensiones es llamado también espacio \"tridimensional\".");

        pregunta2.add(op_verdadero2);
        op_verdadero2.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero2.setText("Verdadero");
        op_verdadero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero2ActionPerformed(evt);
            }
        });

        pregunta3.add(op_falso3);
        op_falso3.setForeground(new java.awt.Color(0, 0, 0));
        op_falso3.setText("Falso");
        op_falso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("3. En dos dimensiones encontramos: largo y ancho y altura.");

        pregunta3.add(op_verdadero3);
        op_verdadero3.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero3.setText("Verdadero");
        op_verdadero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero3ActionPerformed(evt);
            }
        });

        pregunta4.add(op_falso4);
        op_falso4.setForeground(new java.awt.Color(0, 0, 0));
        op_falso4.setText("Falso");
        op_falso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("4. En tres dimensiones encontramos: largo, ancho y altura.");

        pregunta4.add(op_verdadero4);
        op_verdadero4.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero4.setText("Verdadero");
        op_verdadero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero4ActionPerformed(evt);
            }
        });

        pregunta5.add(op_falso5);
        op_falso5.setForeground(new java.awt.Color(0, 0, 0));
        op_falso5.setText("Falso");
        op_falso5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("5. El triángulo no es un polígono.");

        pregunta5.add(op_verdadero5);
        op_verdadero5.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero5.setText("Verdadero");
        op_verdadero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero5ActionPerformed(evt);
            }
        });

        pregunta6.add(op_falso6);
        op_falso6.setForeground(new java.awt.Color(0, 0, 0));
        op_falso6.setText("Falso");
        op_falso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("6. La suma de los ángulos interiores de un triángulo suman 360º.");

        pregunta6.add(op_verdadero6);
        op_verdadero6.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero6.setText("Verdadero");
        op_verdadero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero6ActionPerformed(evt);
            }
        });

        pregunta7.add(op_falso7);
        op_falso7.setForeground(new java.awt.Color(0, 0, 0));
        op_falso7.setText("Falso");
        op_falso7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("7. El triángulo isósceles tiene 3 lados iguales.");

        pregunta7.add(op_verdadero7);
        op_verdadero7.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero7.setText("Verdadero");
        op_verdadero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero7ActionPerformed(evt);
            }
        });

        pregunta8.add(op_verdadero8);
        op_verdadero8.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero8.setText("No es un objeto físico y no tiene dimensiones.");
        op_verdadero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero8ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("8. ¿Qué es el punto?");

        pregunta8.add(op_falso1_8);
        op_falso1_8.setForeground(new java.awt.Color(0, 0, 0));
        op_falso1_8.setText("Son curvas que cortan.");
        op_falso1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso1_8ActionPerformed(evt);
            }
        });

        pregunta8.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Una línea con dos curvas continuas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        pregunta9.add(op_falso91);
        op_falso91.setForeground(new java.awt.Color(0, 0, 0));
        op_falso91.setText("Cuadrado");
        op_falso91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso91ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("9. ¿Qué figura es la de la imagen?");

        pregunta9.add(op_verdadero9);
        op_verdadero9.setForeground(new java.awt.Color(0, 0, 0));
        op_verdadero9.setText("Rectángulo");
        op_verdadero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_verdadero9ActionPerformed(evt);
            }
        });

        pregunta9.add(op_falso93);
        op_falso93.setForeground(new java.awt.Color(0, 0, 0));
        op_falso93.setText("Trapecio");
        op_falso93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso93ActionPerformed(evt);
            }
        });

        pregunta9.add(op_falso92);
        op_falso92.setForeground(new java.awt.Color(0, 0, 0));
        op_falso92.setText("Triángulo");
        op_falso92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_falso92ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rectangulo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(op_verdadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(falso1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(falso2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(op_falso3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(op_falso4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(op_falso5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(op_falso6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(op_verdadero7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(op_falso7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op_falso1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(op_verdadero8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(op_verdadero9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(op_falso91, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op_falso92, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(op_falso93, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero1)
                    .addComponent(falso1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero2)
                    .addComponent(falso2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero3)
                    .addComponent(op_falso3))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero4)
                    .addComponent(op_falso4))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero5)
                    .addComponent(op_falso5))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero6)
                    .addComponent(op_falso6))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero7)
                    .addComponent(op_falso7))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op_falso1_8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op_verdadero8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_verdadero9)
                    .addComponent(op_falso91)
                    .addComponent(op_falso92)
                    .addComponent(op_falso93))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(154, 154, 154)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(revisar_practica1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(revisar_practica1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        Unidad_1 u1 = new Unidad_1();
        u1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private int calificacion = 0;
    
    private void revisar_practica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisar_practica1ActionPerformed

        if(op_verdadero1.isSelected()){
            
            calificacion=+1;
        }
        if(op_verdadero2.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_falso3.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_verdadero4.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_falso5.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_falso6.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_falso7.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_verdadero8.isSelected()){
            
              calificacion=calificacion+1;  
        }
        if(op_verdadero9.isSelected()){
            
              calificacion=calificacion+1;  
        }
        
        ResultadoPractica resultadoPractica = new ResultadoPractica();
        ResultadoPractica.result_prac.setText("Puntos obtenidos: "+(Integer.toString(calificacion))+"/9");
        ResultadoPractica.unidad = 1;
        resultadoPractica.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_revisar_practica1ActionPerformed

    private void op_verdadero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero1ActionPerformed

    private void falso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_falso1ActionPerformed

    private void falso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_falso2ActionPerformed

    private void op_verdadero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero2ActionPerformed

    private void op_falso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso3ActionPerformed

    private void op_verdadero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero3ActionPerformed

    private void op_falso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso4ActionPerformed

    private void op_verdadero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero4ActionPerformed

    private void op_falso5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso5ActionPerformed

    private void op_verdadero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero5ActionPerformed

    private void op_falso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso6ActionPerformed

    private void op_verdadero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero6ActionPerformed

    private void op_falso7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso7ActionPerformed

    private void op_verdadero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero7ActionPerformed

    private void op_verdadero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero8ActionPerformed

    private void op_falso1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso1_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso1_8ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void op_falso91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso91ActionPerformed

    private void op_verdadero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_verdadero9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_verdadero9ActionPerformed

    private void op_falso93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso93ActionPerformed

    private void op_falso92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_falso92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_falso92ActionPerformed

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
            java.util.logging.Logger.getLogger(Practica_Unidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica_Unidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica_Unidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica_Unidad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica_Unidad1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton falso1;
    private javax.swing.JRadioButton falso2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JRadioButton op_falso1_8;
    private javax.swing.JRadioButton op_falso3;
    private javax.swing.JRadioButton op_falso4;
    private javax.swing.JRadioButton op_falso5;
    private javax.swing.JRadioButton op_falso6;
    private javax.swing.JRadioButton op_falso7;
    private javax.swing.JRadioButton op_falso91;
    private javax.swing.JRadioButton op_falso92;
    private javax.swing.JRadioButton op_falso93;
    private javax.swing.JRadioButton op_verdadero1;
    private javax.swing.JRadioButton op_verdadero2;
    private javax.swing.JRadioButton op_verdadero3;
    private javax.swing.JRadioButton op_verdadero4;
    private javax.swing.JRadioButton op_verdadero5;
    private javax.swing.JRadioButton op_verdadero6;
    private javax.swing.JRadioButton op_verdadero7;
    private javax.swing.JRadioButton op_verdadero8;
    private javax.swing.JRadioButton op_verdadero9;
    private javax.swing.ButtonGroup pregunta1;
    private javax.swing.ButtonGroup pregunta2;
    private javax.swing.ButtonGroup pregunta3;
    private javax.swing.ButtonGroup pregunta4;
    private javax.swing.ButtonGroup pregunta5;
    private javax.swing.ButtonGroup pregunta6;
    private javax.swing.ButtonGroup pregunta7;
    private javax.swing.ButtonGroup pregunta8;
    private javax.swing.ButtonGroup pregunta9;
    private javax.swing.JButton revisar_practica1;
    // End of variables declaration//GEN-END:variables
}
