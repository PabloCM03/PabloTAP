/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author Pablo Che
 */
public class pruebaPi extends javax.swing.JPanel {

   public BufferedImage image;
    public Graphics2D g2d;
 
    public pruebaPi() {
        initComponents();
        init();
    }
    
    private void init() {

        this.setBackground(Color.black);
        

        image = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        g2d = image.createGraphics();
        g2d.setColor(Color.CYAN);
        g2d.setStroke(new BasicStroke(2));
        

        MouseInputAdapter mouseHandler = new MouseInputAdapter() {
            
            private Point curPoint = new Point();

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                
                curPoint.setLocation(e.getPoint());            
            }

            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                
                g2d.drawLine(curPoint.x,curPoint.y, e.getX(), e.getY());
                curPoint.setLocation(e.getPoint());
                repaint();

            }
        };
        
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
        

    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);

    }
    
    public void correr() {

            SwingUtilities.invokeLater(() ->{

            JFrame frame = new JFrame("Pizarron");
            frame.setMinimumSize(new Dimension(640,480));
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(new pruebaPi());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
