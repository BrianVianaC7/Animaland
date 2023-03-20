package animaland;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Admin
 */
public class VentanaAnimales extends javax.swing.JFrame {
    
    private VAnimal b1;
    
    public VentanaAnimales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        CargaFondo();
    }
    private void CargaFondo(){
         ImageIcon imagen; //sabe leer de archivo y se muestra en un label
        imagen = new ImageIcon("./src/Imagenes/FondoAnimales.jpg") ;
        Image imescala = imagen.getImage();
        imescala = imescala.getScaledInstance(lbFondo3.getWidth() , lbFondo3.getHeight(), Image.SCALE_DEFAULT);
        imagen = new ImageIcon(imescala);
        lbFondo3.setIcon(imagen);
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
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonRegresar1 = new javax.swing.JButton();
        BotonAguila = new javax.swing.JButton();
        BotonTigre = new javax.swing.JButton();
        BotonLeon = new javax.swing.JButton();
        BotonCerdo = new javax.swing.JButton();
        BotonPerro = new javax.swing.JButton();
        BotonDelfin = new javax.swing.JButton();
        BotonGallo = new javax.swing.JButton();
        BotonGrillo = new javax.swing.JButton();
        BotonCaballo = new javax.swing.JButton();
        BotonLince = new javax.swing.JButton();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        lbFondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(18, 77, 42));

        Titulo.setBackground(new java.awt.Color(51, 153, 0));
        Titulo.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("ANIMALAND");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 390, 90));

        BotonRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha2.png"))); // NOI18N
        BotonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        BotonAguila.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonAguila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGUILA2.png"))); // NOI18N
        BotonAguila.setText("ÁGUILA");
        BotonAguila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAguilaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAguila, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        BotonTigre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonTigre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TIGRE2.png"))); // NOI18N
        BotonTigre.setText("TIGRE");
        BotonTigre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTigreActionPerformed(evt);
            }
        });
        jPanel1.add(BotonTigre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 100));

        BotonLeon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonLeon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LEON2.png"))); // NOI18N
        BotonLeon.setText("LEÓN");
        BotonLeon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLeonMouseClicked(evt);
            }
        });
        BotonLeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLeonActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLeon, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, -1));

        BotonCerdo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCerdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERDO2.png"))); // NOI18N
        BotonCerdo.setText("CERDO");
        BotonCerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerdoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        BotonPerro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRRO2.png"))); // NOI18N
        BotonPerro.setText("PERRO");
        BotonPerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPerroMouseClicked(evt);
            }
        });
        BotonPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPerroActionPerformed(evt);
            }
        });
        jPanel1.add(BotonPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        BotonDelfin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonDelfin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DELFIN.png"))); // NOI18N
        BotonDelfin.setText("DELFÍN");
        BotonDelfin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDelfinMouseClicked(evt);
            }
        });
        BotonDelfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDelfinActionPerformed(evt);
            }
        });
        jPanel1.add(BotonDelfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        BotonGallo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonGallo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GALLO.png"))); // NOI18N
        BotonGallo.setText("GALLO");
        BotonGallo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGalloMouseClicked(evt);
            }
        });
        BotonGallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGalloActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        BotonGrillo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonGrillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRICRI.png"))); // NOI18N
        BotonGrillo.setText("GRILLO");
        BotonGrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGrilloActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        BotonCaballo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCaballo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CABALLOBURRO.png"))); // NOI18N
        BotonCaballo.setText("CABALLO");
        BotonCaballo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCaballoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCaballoMouseEntered(evt);
            }
        });
        BotonCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCaballoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCaballo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        BotonLince.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonLince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LINCE2.png"))); // NOI18N
        BotonLince.setText("\n\n\n\n\n\n\n\n\n\n\nLINCE");
        BotonLince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLinceMouseClicked(evt);
            }
        });
        BotonLince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLinceActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLince, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 50, 50));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 40, 30));

        lbFondo3.setText("jLabel4");
        jPanel1.add(lbFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1300, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar1ActionPerformed
        VentanaPrincipal v1=new VentanaPrincipal();
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_BotonRegresar1ActionPerformed

    private void BotonPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPerroActionPerformed
        b1 = new VAnimal("PerroR.png",9);
        b1.setVisible(true);
    }//GEN-LAST:event_BotonPerroActionPerformed

    private void BotonLinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLinceActionPerformed
         b1 = new VAnimal("LinceR.png",1);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonLinceActionPerformed

    private void BotonLinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLinceMouseClicked

    }//GEN-LAST:event_BotonLinceMouseClicked

    private void BotonCaballoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCaballoMouseEntered

    }//GEN-LAST:event_BotonCaballoMouseEntered

    private void BotonPerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPerroMouseClicked
 
    }//GEN-LAST:event_BotonPerroMouseClicked

    private void BotonCaballoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCaballoMouseClicked
  
    }//GEN-LAST:event_BotonCaballoMouseClicked

    private void BotonLeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLeonMouseClicked
        
    }//GEN-LAST:event_BotonLeonMouseClicked

    private void BotonDelfinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDelfinMouseClicked
       
    }//GEN-LAST:event_BotonDelfinMouseClicked

    private void BotonGalloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGalloMouseClicked
  
    }//GEN-LAST:event_BotonGalloMouseClicked

    private void BotonAguilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAguilaActionPerformed
         b1 = new VAnimal("AguilaR.png",3);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonAguilaActionPerformed

    private void BotonTigreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTigreActionPerformed
         b1 = new VAnimal("TigreR.png",2);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonTigreActionPerformed

    private void BotonLeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLeonActionPerformed
         b1 = new VAnimal("LeonR.jpg",4);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonLeonActionPerformed

    private void BotonCerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerdoActionPerformed
         b1 = new VAnimal("CerdoR.png",10);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonCerdoActionPerformed

    private void BotonGrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGrilloActionPerformed
         b1 = new VAnimal("GrilloR.png",5);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonGrilloActionPerformed

    private void BotonDelfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDelfinActionPerformed
         b1 = new VAnimal("DelfinR.png",7);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonDelfinActionPerformed

    private void BotonCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCaballoActionPerformed
         b1 = new VAnimal("CaballoR.png",8);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonCaballoActionPerformed

    private void BotonGalloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGalloActionPerformed
         b1 = new VAnimal("GalloR.png",6);
         b1.setVisible(true);
    }//GEN-LAST:event_BotonGalloActionPerformed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(VentanaAnimales.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        int opc=JOptionPane.showConfirmDialog(this, "\"Se cerrará el programa junto con la sesión.\""
            + "\n¿Estás seguro de hacerlo?","ATENCIÓN",
            JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(opc==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAguila;
    private javax.swing.JButton BotonCaballo;
    private javax.swing.JButton BotonCerdo;
    private javax.swing.JButton BotonDelfin;
    private javax.swing.JButton BotonGallo;
    private javax.swing.JButton BotonGrillo;
    private javax.swing.JButton BotonLeon;
    private javax.swing.JButton BotonLince;
    private javax.swing.JButton BotonPerro;
    private javax.swing.JButton BotonRegresar1;
    private javax.swing.JButton BotonTigre;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbFondo3;
    // End of variables declaration//GEN-END:variables
}
