
package proyectodatos;

import javax.swing.JOptionPane;

public class ProyectoDatos {

    public static void main(String[] args) {
         int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog  (
                    
                            "**********NOMBRE**********\n"
                            + "1.Agregar corredor\n"
                            + "2.\n"
                            + "3.\n"
                            + "4.Salir \n"
                            + "Digite la opcion que desea ejecutar\n"
                            + "*************************************"
            )
                    
            );
            
            switch (opcion) {

                case 1:
                    String nombre = JOptionPane.showInputDialog("Dgite el nombre del competidor ");
                    int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite el "));
                    String patrocinador = JOptionPane.showInputDialog("Ingrese patrocinador"); 
                    int tiempoVuelta1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del primer  dia de rally del corredor"));
                    int tiempoVuelta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del segundo dia de rally del corredor"));
                    int tiempoVuelta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del trecer dia de rally del corredor"));
                    
                    break;
                case 2:
                         
                    break;
                case 3:
                       
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Hasta pronto!!!");
                    break;
                 default:
                      JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                    break;
            }
        } while (opcion !=4);
    }
    
}
