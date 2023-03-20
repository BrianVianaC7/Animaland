package animaland;
import ConexionBaseDatos.VentanaSesion;
import java.awt.Image;
import java.awt.Toolkit;
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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/AGUILA2.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonJuego = new javax.swing.JButton();
        BotonAnimales = new javax.swing.JButton();
        LogOut = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        BotonCreditos = new javax.swing.JButton();
        Minimizar = new javax.swing.JLabel();
        lbFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
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

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log_out.png"))); // NOI18N
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 30));

        BotonCreditos.setBackground(new java.awt.Color(153, 255, 153));
        BotonCreditos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCreditos.setText("Créditos");
        BotonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreditosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 50, 50));
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
        +"Daniela M. Jiménez Aguilar.\n\nANIMALAND\nEs un proyecto enfocado en la educación\n"+
                "preescolar para la estimulación del lenguaje por\nmedio de onomatopeyas que emiten los animales.\n\n"+
                "INSTITUCIÓN\nUniversidad del Valle de México Campus Coyoacán\n                                 UVM");
    }//GEN-LAST:event_BotonCreditosActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        int opc=JOptionPane.showConfirmDialog(this, "\"Cerrar Sesión.\""
                + "\n¿Estás seguro de hacerlo?","ATENCIÓN",
            JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(opc==0){
        VentanaSesion vs=new VentanaSesion();
        this.setVisible(false);
        vs.setVisible(true);
        }
    }//GEN-LAST:event_LogOutMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        int opc=JOptionPane.showConfirmDialog(this, "\"Se cerrará el programa junto con la sesión.\""
                + "\n¿Estás seguro de hacerlo?","ATENCIÓN",
            JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(opc==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizarMouseClicked

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
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFondo1;
    // End of variables declaration//GEN-END:variables
}
