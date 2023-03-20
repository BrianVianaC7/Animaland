package ConexionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class IngresarExamen {
    
    private ConexionBD conecta;
    private String IDUnidad,IDTecnica,tecnica;
    private int num;

    public void IngresarParcial(int intento,int ID_Us,String fecha,int puntaje,String tiempo,String ID_Un){
        conecta = new ConexionBD();
        Connection cn=conecta.conectar();
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO tablaexpar(ID_Intento,ID_Usuario,ID_Unidad,"+
                    "Fecha_Intento,Puntaje_P,Tiempo_P) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, intento);
            pst.setInt(2, ID_Us);
            pst.setString(3, ID_Un);
            pst.setString(4, fecha);
            pst.setInt(5, puntaje);
            pst.setString(6, tiempo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Partida con ID "+intento+" guardado");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Partida no guardada\n"+ex.getMessage());
        }
    }
    
    public void IngresarFinal(int ID_Ex,int ID_Us,String fecha,int puntaje,String tiempo,String ID_T){
        conecta = new ConexionBD();
        Connection cn=conecta.conectar();
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO tablaexfin(ID_Examen,ID_Usuario,ID_Tecnica,"+
                    "Puntaje_F,Fecha_F,Tiempo_F) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, ID_Ex);
            pst.setInt(2, ID_Us);
            pst.setString(3, ID_T);
            pst.setInt(4, puntaje);
            pst.setString(5, fecha);
            pst.setString(6, tiempo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Partida con ID "+ID_Ex+" guardado");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Partida no guardada\n"+ex.getMessage());
        }
    }
    
    
    
}
