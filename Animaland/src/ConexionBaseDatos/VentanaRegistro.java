package ConexionBaseDatos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class VentanaRegistro extends javax.swing.JFrame {

    private JPasswordField con;
    private JPanel panel;
    private JLabel texto;
    private String co;
    private int contador;
    IngresarDatos insert;
    
    public VentanaRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonRegistrar.setBackground(new Color(241, 241, 241));
        con=new JPasswordField(10);
        panel=new JPanel();
        texto=new JLabel("Confirmar contraseña: ");
        texto.setFont(new Font("Segoe UI", 1, 12));
        contador=0;
    }
    
    public void ConfirmarPass(){
        panel.add(texto);
        panel.add(con);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(this, panel, "Acceder al registro", JOptionPane.NO_OPTION, 
                JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        if(option==0){
            co=con.getText();
            System.out.println(co+"\n"+cajaPass.getText());
            if(co.equals(cajaPass.getText())){
                int min_val = 10;
                int max_val = 10000;
                int ID = (int)(Math.random() * ( max_val - min_val ));
                insert=new IngresarDatos();
                insert.Ingresar(ID, cajaNombre.getText(), cajaAPat.getText(), cajaAMat.getText(), 
                cajaUser.getText(), cajaCorreo.getText(), cajaPass.getText());
            }else{
                System.out.println(co+"\n"+cajaPass.getText());
                JOptionPane.showMessageDialog(this, "Asegúrate de escribir correctamente la contraseña", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        cajaAPat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaPass = new javax.swing.JPasswordField();
        botonRegistrar = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaAMat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 3));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGUILA2.png"))); // NOI18N
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 110, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("Contraseña");
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Panel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 40, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("REGISTRO DE USUARIOS");
        Panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));
        Panel1.add(cajaAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Apellido Paterno");
        Panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        cajaPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel1.add(cajaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 140, -1));

        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistrar.setText("REGISTRAR USUARIO");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        Panel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));
        Panel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 51));
        jLabel6.setText("Nombre(s)");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));
        Panel1.add(cajaAMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 51));
        jLabel7.setText("Apellido Materno");
        Panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        Panel1.add(cajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 51));
        jLabel8.setText("Username");
        Panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));
        Panel1.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 51));
        jLabel9.setText("Correo electrónico");
        Panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        ConfirmarPass();
        contador++;
        if(contador>0){
            con.setText("");
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaAMat;
    private javax.swing.JTextField cajaAPat;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JPasswordField cajaPass;
    private javax.swing.JTextField cajaUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
