
package proyectodatos;

import javax.swing.JOptionPane;

public class ProyectoDatos {

    public static void main(String[] args) {
         int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog  (
                    
                            "**********NOMBRE**********\n"
                            + "1.Agregar corredor\n"
                            + "2. \n"
                            + "3. \n"
                            + "4. Salir\n\n"
                            + "Digite la opcion que desea ejecutar\n"
                            + "*************************************"
            )
                    
            );
            
            switch (opcion) {

                case 1:
                    String nombre = JOptionPane.showInputDialog("");
                    int ID = Integer.parseInt(JOptionPane.showInputDialog(""));
                    String patrocinador = JOptionPane.showInputDialog("Ingrese patrocinador"); 
                    int tiempoVuelta1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de la primera vuelta"));
                    int tiempoVuelta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de la segunda vuelta"));
                    int tiempoVuelta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de la ultima vuelta"));
                    
                    break;
                case 2:
                         
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
            }
        } while (opcion !=4);
    }
    
}
