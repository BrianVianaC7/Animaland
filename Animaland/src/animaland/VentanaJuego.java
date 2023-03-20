package animaland;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VentanaJuego extends javax.swing.JFrame {

    private int seleccion1;
    private int seleccion2;
    private int numpar,partotal,gana;
    private int num[];
    private boolean[] verdadero;
    private int ing, gan;
    private int cod[];
    private int voltear;
    private int[] auxiliar;
    private Timer tiempo;
    private int centecimas,segundos,minutos,horas;
    private String Nivel;
    private Usuario u;
    JFileChooser objFc;
    private File archivo;
    
    public VentanaJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         CargaFondo();
         ocultar();
         seleccion1 = 0; 
         seleccion2 = 0;
         numpar=10;
         partotal=20;
         gana=9;
         num = new int[numpar];
         verdadero = new boolean[partotal];
         cod = new int[20];
         auxiliar = new int[2];
         centecimas=0;
         segundos=0;
         minutos=0;
         horas=0;
         tiempo=new Timer(10,medir);
         objFc=new JFileChooser();
    }
    
 private void CargaFondo(){
        ImageIcon imagen; 
        imagen = new ImageIcon("./src/Imagenes/FondoB.jpg") ;
        Image imescala = imagen.getImage();
        imescala = imescala.getScaledInstance(lbFondo2.getWidth() , lbFondo2.getHeight(), Image.SCALE_DEFAULT);
        imagen = new ImageIcon(imescala);
        lbFondo2.setIcon(imagen);
    }
 public void iniciar() {
        jBIniciar.setVisible(false);
        for (int i = 0; i < numpar; i++) {
            num[i] =0;

        }
        for (int i = 0; i < partotal; i++) {
            verdadero[i] = true;
        }
        aleatorio();
         voltear = 0;
         gan = 0;
    }
 
 public void actualizarTiempo(){
        String texto=(horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+
                (segundos<=9?"0":"")+segundos+":"+(centecimas<=9?"0":"")+centecimas;
        Tiempo.setText(texto);
    }
 
 private ActionListener medir=new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            centecimas++;
       if(centecimas==100){
           segundos++;
           centecimas=0;
       }
       if(segundos==60){
           minutos++;
           segundos=0;
       }
       if(minutos==60){
           horas++;
           minutos=0;
       }
       if(horas==24){
           horas=0;
       }
       actualizarTiempo();
    }
 };
 
 public void comprobacion() {
        if (cod[auxiliar[0] - 1] == cod[auxiliar[1] - 1]) {
            verdadero[auxiliar[0] - 1] = false;
            verdadero[auxiliar[1] - 1] = false;
            voltear = 0;
            gan++;
        } else {
            voltear = 0;
            voltear(auxiliar[0]);
            voltear(auxiliar[1]);
        }
    }
 
 public void aleatorio() {
        Random r = new Random();

        for (int i = 0; i < partotal; i++) {
            ing = r.nextInt(numpar);
            if (num[ing] < 2) {
                num[ing]++;
                cod[i] = ing + 1;
            } else {
                i--;
            }
        }
    }
 
 public void voltear(int z) {
        switch (z) {
            case 1:
                lb1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 2:
                lb2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 3:
                lb3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 4:
                lb4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 5:
                lb5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 6:
                lb6.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 7:
                lb7.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 8:
                lb8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 9:
                lb9.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 10:
                lb10.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 11:
                lb11.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 12:
                lb12.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 13:
                lb13.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 14:
                lb14.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 15:
                lb15.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 16:
                lb16.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 17:
                lb17.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 18:
                lb18.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 19:
                lb19.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
            case 20:
                lb20.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
                break;
        }
    }
 
 private void ganar() {
     String name;
        if ((voltear == 2) && (gan == gana)) {
            tiempo.stop();
            jBIniciar.setVisible(true);
            JOptionPane.showMessageDialog(this,"¡FELICIDADES! Has ganado. Tiempo empleado: "+Tiempo.getText());
            name=JOptionPane.showInputDialog(this,"Escribe tu nombre para guardar tu usuario");
            while(!name.matches("[a-zA-Z]{3,}")){
                name=JOptionPane.showInputDialog(this,"Nombre inválido\nEscribe tu nombre para guardar tu usuario");
            }
            int res=objFc.showSaveDialog(this);
            try{
                 if(res==JFileChooser.APPROVE_OPTION){
                     archivo=objFc.getSelectedFile();
                     u=new Usuario(name,Nivel,Tiempo.getText());
                     FileOutputStream flujo=new FileOutputStream(archivo);
              ObjectOutputStream oos=new ObjectOutputStream(flujo);
              oos.writeObject(u);
              oos.close();
              JOptionPane.showMessageDialog(this, "Usuario guardado exitosamente");
              int nuevo=JOptionPane.showConfirmDialog(this, "¿Quieres comenzar de nuevo?", "Desición", JOptionPane.YES_NO_OPTION);
              if(nuevo==JOptionPane.YES_OPTION){
                  this.setVisible(false);
                  VentanaJuego v=new VentanaJuego();
                  v.setVisible(true);
              }else{
                  VentanaPrincipal v=new VentanaPrincipal();
                  this.setVisible(false);
                  v.setVisible(true);
                  
              }
                 }else{
                     JOptionPane.showMessageDialog(this, "Acción cancelada");
                 }
            }
            catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, "No se puede guardar el objeto porque la ubicación\n"+
                    "para guardar no existe, seleccione otra");
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(this, "Error del sistema al almacenar el objeto. "+e.getMessage());//
        }
        }
    }

  public void limpiar() {
        lb1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb6.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb7.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb9.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb10.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb11.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb12.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb13.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb14.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb15.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb16.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb17.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb18.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb19.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        lb20.setIcon(new ImageIcon(getClass().getResource("/Imagenes/D5.png")));
        //txt.setText("");
    }
   public void ocultar() {
     lb1.setVisible(false);  lb11.setVisible(false);        
     lb2.setVisible(false);  lb12.setVisible(false);           
     lb3.setVisible(false);  lb13.setVisible(false);           
     lb4.setVisible(false);  lb14.setVisible(false);
     lb5.setVisible(false);  lb15.setVisible(false);        
     lb6.setVisible(false);  lb16.setVisible(false);           
     lb7.setVisible(false);  lb17.setVisible(false);           
     lb8.setVisible(false);  lb18.setVisible(false);          
     lb9.setVisible(false);  lb19.setVisible(false);       
     lb10.setVisible(false);  lb20.setVisible(false);       
    }
   public void niveles(String ocu)
{
if(ocu=="Nivel Facil"){
      Nivel="Nivel Fácil";
      lb1.setVisible(true); lb7.setVisible(true);        
      lb2.setVisible(true); lb8.setVisible(true);           
      lb3.setVisible(true); lb9.setVisible(true);           
      lb4.setVisible(true); lb10.setVisible(true);
      lb5.setVisible(true); lb11.setVisible(true);         
      lb6.setVisible(true);lb12.setVisible(true);
     numpar=6;
     partotal=12;
     gana=5;
}
     if(ocu=="Nivel Dificil"){
      Nivel="Nivel Difícil";
      lb1.setVisible(true); lb11.setVisible(true);        
      lb2.setVisible(true); lb12.setVisible(true);           
      lb3.setVisible(true); lb13.setVisible(true);           
      lb4.setVisible(true); lb14.setVisible(true);
      lb5.setVisible(true); lb15.setVisible(true);        
      lb6.setVisible(true); lb16.setVisible(true);           
      lb7.setVisible(true); lb17.setVisible(true);           
      lb8.setVisible(true); lb18.setVisible(true);
      lb9.setVisible(true); lb19.setVisible(true);       
      lb10.setVisible(true); lb20.setVisible(true);       
     numpar=10;
     partotal=20;
     gana=9;     
     }
     
     
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonRegresar2 = new javax.swing.JButton();
        jBIniciar = new javax.swing.JButton();
        nivel = new javax.swing.JComboBox<>();
        lb17 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb18 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb19 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        Instrucciones = new javax.swing.JButton();
        TituloTiempo = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        Guardados = new javax.swing.JButton();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        lbFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 390, 90));

        BotonRegresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha2.png"))); // NOI18N
        BotonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar2ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        jBIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBIniciar.setText("INICIAR ");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jBIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 120, 30));

        nivel.setBackground(new java.awt.Color(153, 153, 153));
        nivel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel Facil", "Nivel Dificil" }));
        nivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelActionPerformed(evt);
            }
        });
        jPanel1.add(nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        lb17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb17MouseClicked(evt);
            }
        });
        jPanel1.add(lb17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 80));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 110, 80));

        lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, 80));

        lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });
        jPanel1.add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 110, 80));

        lb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb13MouseClicked(evt);
            }
        });
        jPanel1.add(lb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 110, 80));

        lb18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb18MouseClicked(evt);
            }
        });
        jPanel1.add(lb18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 110, 80));

        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 110, 80));

        lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });
        jPanel1.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 110, 80));

        lb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb10MouseClicked(evt);
            }
        });
        jPanel1.add(lb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 110, 80));

        lb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb14MouseClicked(evt);
            }
        });
        jPanel1.add(lb14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 110, 80));

        lb19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb19MouseClicked(evt);
            }
        });
        jPanel1.add(lb19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 110, 80));

        lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 110, 80));

        lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });
        jPanel1.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 110, 80));

        lb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb11MouseClicked(evt);
            }
        });
        jPanel1.add(lb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 110, 80));

        lb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb15MouseClicked(evt);
            }
        });
        jPanel1.add(lb15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 110, 80));

        lb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb20MouseClicked(evt);
            }
        });
        jPanel1.add(lb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 110, 80));

        lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 110, 80));

        lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb8MouseClicked(evt);
            }
        });
        jPanel1.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 110, 80));

        lb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb12MouseClicked(evt);
            }
        });
        jPanel1.add(lb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 110, 80));

        lb16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D5.png"))); // NOI18N
        lb16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb16MouseClicked(evt);
            }
        });
        jPanel1.add(lb16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 110, 80));

        Instrucciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Instrucciones.setText("Instrucciones");
        Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstruccionesActionPerformed(evt);
            }
        });
        jPanel1.add(Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        TituloTiempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TituloTiempo.setText("TIEMPO:");
        jPanel1.add(TituloTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 30));

        Tiempo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tiempo.setText("00:00:00:00");
        jPanel1.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 160, -1));

        Guardados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Guardados.setText("Usuarios guardados");
        Guardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardadosActionPerformed(evt);
            }
        });
        jPanel1.add(Guardados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 50, 50));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 40, 30));

        lbFondo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1390, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    @Override
    public void setResizable(boolean resizable) {
      super.setResizable(resizable);
        
    }
    
    private void BotonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar2ActionPerformed
        VentanaPrincipal v1=new VentanaPrincipal();
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_BotonRegresar2ActionPerformed

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
       ocultar();
       niveles(nivel.getSelectedItem().toString());
       limpiar();
       iniciar();
       tiempo.start();
       nivel.setEnabled(false);
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelActionPerformed

    private void lb17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb17MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 17;

        lb17.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[16] + ".png")));
        ganar();
    }//GEN-LAST:event_lb17MouseClicked

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 1;

        lb1.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[0] + ".png")));
        ganar();
    }//GEN-LAST:event_lb1MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =5;

        lb5.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[4] + ".png")));
        ganar();
    }//GEN-LAST:event_lb5MouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
       if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =9;

        lb9.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[8] + ".png")));
        ganar();
    }//GEN-LAST:event_lb9MouseClicked

    private void lb13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb13MouseClicked
       if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =13;

        lb13.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[12] + ".png")));
        ganar();
    }//GEN-LAST:event_lb13MouseClicked

    private void lb18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb18MouseClicked
       if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =18;

        lb18.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[17] + ".png")));
        ganar();
    }//GEN-LAST:event_lb18MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =2;

        lb2.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[1] + ".png")));
        ganar();
    }//GEN-LAST:event_lb2MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =6;

        lb6.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[5] + ".png")));
        ganar();
    }//GEN-LAST:event_lb6MouseClicked

    private void lb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb10MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =10;

        lb10.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[9] + ".png")));
        ganar();
    }//GEN-LAST:event_lb10MouseClicked

    private void lb14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb14MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =14;

        lb14.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[13] + ".png")));
        ganar();
    }//GEN-LAST:event_lb14MouseClicked

    private void lb19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb19MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =19;

        lb19.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[18] + ".png")));
        ganar();
    }//GEN-LAST:event_lb19MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =3;

        lb3.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[2] + ".png")));
        ganar();
    }//GEN-LAST:event_lb3MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
       if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =7;

        lb7.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[6] + ".png")));
        ganar();
    }//GEN-LAST:event_lb7MouseClicked

    private void lb11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb11MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =11;

        lb11.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[10] + ".png")));
        ganar();
    }//GEN-LAST:event_lb11MouseClicked

    private void lb15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb15MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =15;

        lb15.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[14] + ".png")));
        ganar();
    }//GEN-LAST:event_lb15MouseClicked

    private void lb20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb20MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =20;

        lb20.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[19] + ".png")));
        ganar();
    }//GEN-LAST:event_lb20MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =4;

        lb4.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[3] + ".png")));
        ganar();
    }//GEN-LAST:event_lb4MouseClicked

    private void lb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb8MouseClicked
       if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =8;

        lb8.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[7] + ".png")));
        ganar();
    }//GEN-LAST:event_lb8MouseClicked

    private void lb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb12MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =12;

        lb12.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[11] + ".png")));
        ganar();
    }//GEN-LAST:event_lb12MouseClicked

    private void lb16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb16MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] =16;

        lb16.setIcon(new ImageIcon(getClass().getResource("/Memorama/" + cod[15] + ".png")));
        ganar();
    }//GEN-LAST:event_lb16MouseClicked

    private void GuardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardadosActionPerformed
        int res=objFc.showOpenDialog(this);
        try{
            if(res==JFileChooser.APPROVE_OPTION){
                archivo=objFc.getSelectedFile();
              FileInputStream flujo=new FileInputStream(archivo);
              ObjectInputStream oos=new ObjectInputStream(flujo);
              Usuario a=(Usuario)oos.readObject();
              JOptionPane.showMessageDialog(this,"Nombre: "+a.getNombre()+"\nNivel jugado: "+a.getNivel()+"\nTiempo: "
                      +a.getTiempo());
            }else{
              JOptionPane.showMessageDialog(this, "Acción cancelada");
          }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, "No se ha inscrito el alumno que quiere buscar");
        }
        catch(IOException | ClassNotFoundException e){
            String detalle="";
            if(e.getMessage().contains("invalid stream header")){
                detalle="Formato de archivo no compatible";
            }
            JOptionPane.showMessageDialog(this, "Error del sistema al leer el objeto.\n"+detalle);
        }
    }//GEN-LAST:event_GuardadosActionPerformed

    private void InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstruccionesActionPerformed
        JOptionPane.showMessageDialog(this,"                                                                               \"INSTRUCCIONES\"\n\n"
              + "- Botón Iniciar: Una vez presionado se iniciará el juego con el nivel predeterminado (Nivel Fácil), "
              + "para cambiar\n   de nivel ir al seleccionador de nivel. Una vez iniciado el juego empezara cronometro para medir su tiempo.\n   Dependiendo del nivel se le mostraran cartas"
              + " volteadas con el logotipo de ANIMALAND, para voltearlas\n   tendrá que darle un click a la tarjeta de su elección, al voltearse la tarjeta le mostrará la imagen de los\n"
              + "   animales vistos en la pestaña \"Animales.\" Al voltear dos cartas del mismo animal estas se mantendrán\n   fijas. Para ganar necesita juntar los pares de animales necesario."
              + " Una vez que haya ganado le saltara\n   un mensaje de  \"FELICIDADES\" tendrá que guardar su partida con el nombre de su agrado, de lo contrario\n   "
                + "todo su progreso no se guardara.\n\n"
              + "                                                                                 \"IMPORTANTE\"\n"
               + "                                Tendrá que crear o elegir un archivo donde lo dejara guardar su partida.\n\n"
              + "- Seleccionador de niveles: Tiene dos opciones de niveles, tiene el nivel predeterminado (Nivel Fácil) y el Nivel Difícil.\n"
              + "   \'Nivel Fácil\': Para acceder a este nivel tiene que seleccionarlo y presionar el botón Iniciar.\n   una vez iniciado le aparecerán 12 cartas con el logotipo de ANIMALAND.\n"
              + "   \'Nivel Difícil\': Para acceder a este nivel tiene que seleccionarlo y presionar el botón Iniciar.\n   una vez iniciado le aparecerán 20 cartas con el logotipo de ANIMALAND.\n");


        
    }//GEN-LAST:event_InstruccionesActionPerformed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(VentanaJuego.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        int opc=JOptionPane.showConfirmDialog(this, "\"Se cerrará el programa junto con la sesión.\""
            + "\n¿Estás seguro de hacerlo?","ATENCIÓN",
            JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(opc==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/AGUILA2.png"));
        return retValue;
    }
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar2;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton Guardados;
    private javax.swing.JButton Instrucciones;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloTiempo;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb18;
    private javax.swing.JLabel lb19;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbFondo2;
    private javax.swing.JComboBox<String> nivel;
    // End of variables declaration//GEN-END:variables
}
