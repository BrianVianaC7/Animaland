package animaland;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Equipo2
 */
public class VentanaPrincipal extends javax.swing.JFrame {
        
    public VentanaPrincipal() {
         initComponents(); 
         this.setLocationRelativeTo(null);
         //setExtendedState(MAXIMIZED_BOTH);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         CargaFondo();
    }
    private void CargaFondo(){
         ImageIcon imagen; //sabe leer de archivo y se muestra en un label
        imagen = new ImageIcon("./src/Imagenes/FONDO.jpg") ;
        Image imescala = imagen.getImage();
        imescala = imescala.getScaledInstance(lbFondo1.getWidth() , lbFondo1.getHeight(), Image.SCALE_DEFAULT);
        imagen = new ImageIcon(imescala);
        lbFondo1.setIcon(imagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonJuego = new javax.swing.JButton();
        BotonAnimales = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonCreditos = new javax.swing.JButton();
        lbFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("ANIMALAND");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 360, 50));

        BotonJuego.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonJuego.setText("JUEGO");
        BotonJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 140, 60));

        BotonAnimales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonAnimales.setText("ANIMALES");
        BotonAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, 60));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BotonCreditos.setBackground(new java.awt.Color(153, 255, 153));
        BotonCreditos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCreditos.setText("Créditos");
        BotonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreditosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));
        jPanel1.add(lbFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoActionPerformed
        VentanaJuego v3=new VentanaJuego();
        this.setVisible(false);
        v3.setVisible(true);
    }//GEN-LAST:event_BotonJuegoActionPerformed

    private void BotonAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnimalesActionPerformed
        VentanaAnimales v2=new VentanaAnimales();
        this.setVisible(false);
        v2.setVisible(true);
    }//GEN-LAST:event_BotonAnimalesActionPerformed

    private void BotonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreditosActionPerformed
        JOptionPane.showMessageDialog(null,"AUTORES:\nIsrael E. Gutiérrez Rabelo, Brian A. Viana Clavijo,\n"
        +"Daniela M. Jiménez Aguilar, Nadia S. Peña Urbina.\n\nANIMALAND\nEs un proyecto enfocado en la educación\n"+
                "preescolar para la estimulación del lenguaje por\nmedio de onomatopeyas que emiten los animales.\n\n"+
                "INSTITUCIÓN\nUniversidad del Valle de México Campus Coyoacán\n                                 UVM");
    }//GEN-LAST:event_BotonCreditosActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnimales;
    private javax.swing.JButton BotonCreditos;
    private javax.swing.JButton BotonJuego;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFondo1;
    // End of variables declaration//GEN-END:variables
}
