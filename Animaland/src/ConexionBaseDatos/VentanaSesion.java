package ConexionBaseDatos;

import animaland.VentanaPrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class VentanaSesion extends javax.swing.JFrame {

    VentanaRegistro v;
    BuscarUsuarios b;
    VentanaPrincipal vv;
    private int conteo;
    
    public VentanaSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonIniciar.setBackground(new Color(225, 225, 225));
        botonRegistrar.setBackground(new Color(225, 225, 225));
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

        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaPass = new javax.swing.JPasswordField();
        botonIniciar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 3));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGUILA2.png"))); // NOI18N
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("Contraseña:");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Panel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, 30));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        Panel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 50, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("INICIO SESIÓN");
        Panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        cajaUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel1.add(cajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Username / Correo:");
        Panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        cajaPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel1.add(cajaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 180, -1));

        botonIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIniciar.setText("INICIAR SESIÓN");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        Panel1.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistrar.setText("REGISTRAR USUARIO");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        Panel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(VentanaSesion.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        int opc=JOptionPane.showConfirmDialog(this, "Se cerrará el programa.\n¿Estás seguro de hacerlo?","ATENCIÓN",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(opc==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        v=new VentanaRegistro();
        v.setVisible(true);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if(cajaUser.getText().length()==0||cajaPass.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Hay campos vacíos.\nPara ingresar, todos los campos deben de ser"
            +" llenados", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            b=new BuscarUsuarios();
            b.Buscar(cajaUser.getText(), cajaPass.getText());
            if(cajaUser.getText().equals(BuscarUsuarios.user)&&cajaPass.getText().equals(BuscarUsuarios.passw)){
                vv=new VentanaPrincipal();
                this.setVisible(false);
                vv.setVisible(true);
            }else{
                conteo++;
                JOptionPane.showMessageDialog(this, "<html><b>Usuario inválido</b></html>", "Error", 
                        JOptionPane.WARNING_MESSAGE);
                if(conteo==3){
                    JOptionPane.showMessageDialog(this, "<html><b>Error al entrar a AnimaLand</b></html>", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPasswordField cajaPass;
    private javax.swing.JTextField cajaUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
