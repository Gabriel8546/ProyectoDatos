package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    public static final String url = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5404947";
    public static final String user = "sql5404947";
    public static final String password = "qm9seFq74L";
    Connection ccn = null;
    Statement st = null;

    public Conexion(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            ccn = (Connection)DriverManager.getConnection(url,user,password);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
            

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Conexion Erronea "+ e);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return ccn;
    }
    
    public void Desconexion(){
        try 
            {
                ccn.close();            
                System.exit(0);
            } catch (SQLException ex) 
                {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}