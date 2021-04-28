package Estructuras;

import javax.swing.JOptionPane;

public class ProyectoAaron {

    static ListaCorredor lista = new ListaCorredor();
    static PilaApuesta pila = new PilaApuesta();

    public static void main(String[] args) {

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione su usuario", "USUARIOS", JOptionPane.QUESTION_MESSAGE, null, 
        new Object[]{"Seleccione", "Administrador", "Apostador"}, "Seleccione");

        
        if (seleccion.toString().equals("Administrador")) {
            menuAdministrador();
        } else {
            System.out.println("Es un apostador");
            menuApostador();

        }
    }

    public static void menuAdministrador() {

        int opcion;
        int idCorredor = 1;
        double record = 5;
        

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "**********RALLY CR**********\n"
                    + "1. Agregar corredor\n"
                    + "2. Mostrar corredores\n"
                    + "3. Mostrar ganador\n"
                    + "4. Mostrar Record\n"
                    + "5. Mostrar menú de apostador\n"       
                    + "6. Mostrar corredores descalificados\n"
                    + "7. Salir\n\n"
                    + "Digite la opcion que desea ejecutar\n"
                    + "*************************************"
            )
            );

            switch (opcion) {

                 case 1:
                     
                     String nombre = JOptionPane.showInputDialog("Digite el nombre del competidor ");
                    // ya no se usa porque lo hace automatico conforme se ingresan pero lo ordena por el tiempo total int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite el "));
                    String patrocinador = JOptionPane.showInputDialog("Ingrese patrocinador");
                    double tiempoVuelta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tiempo del primer  dia de rally del corredor"));
                    double tiempoVuelta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tiempo del segundo dia de rally del corredor"));
                    double tiempoVuelta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tiempo del trecer dia de rally del corredor"));
                    double total = tiempoVuelta1 + tiempoVuelta2 + tiempoVuelta3;
                    lista.Insertar(new Corredor(nombre, idCorredor, patrocinador, tiempoVuelta1, tiempoVuelta2, tiempoVuelta3, total));
                    idCorredor = idCorredor + 1;
  
                    if(total < record){
                        record = total;
                    }
       
                    break;
                case 2:
                     JOptionPane.showMessageDialog(null, "La lista de corredores son: "+ lista); 
                      
                    //Esto era lo que estaba en case 1, se supone que deberia de estar en apostador, creo
                   /* String corredor = JOptionPane.showInputDialog("Inserte el nombre del jugador a elegir: " + lista);
                    double apuesta = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea apostar ?"));
                    pila.push(new DatoApuesta(corredor, apuesta));
                   
                    NodoCorredor c = lista.cabeza;
                    double ganado = apuesta *2; 
                    System.out.println("La cabeza es: "+c);
                    if(c.getDatosCorredor().getNombre().equals(corredor)){
                    JOptionPane.showMessageDialog(null, "Felicidades a ganado $"+ ganado); 
                    }else {
                    JOptionPane.showMessageDialog(null, "Lo sentimos ha perdido todo su dinero"); 
                    }
                   */
                    
                    break;
                case 3:
                     lista.Ganador();
                    break;
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "El record actual es de: "+record+" minutos");

                    break;
                case 5:
                     menuApostador();  
                    break;
                    
                case 6:
                   //JOptionPane.showMessageDialog(null, "Los corredores descalificados son: ");
                   lista.Eliminar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo mayor")));
                    break;
                    
                case 7:
                     JOptionPane.showMessageDialog(null, "Hasta pronto!!!");
                    break;
                    
                    
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                    break;
            }
        } while (opcion != 7);

    }

    public static void menuApostador() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "**********APUESTAS**********\n"
                    + "1.Ver lista Corredores\n"
                    + "2. Apostar\n"
                    + "3. Mostrar menú administrador\n"
                    + "4. Salir\n"
                    + "*************************************"
            )
            );

            switch (opcion) {

                case 1:

                    String corredor = JOptionPane.showInputDialog("Inserte el nombre del jugador a elegir: " + lista);
                    double apuesta = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea apostar ?"));
                    pila.push(new DatoApuesta(corredor, apuesta));
                    break;
                case 2:

                    break;

                case 3:
                    menuAdministrador();
                    break;
                
                case 4:
                     JOptionPane.showMessageDialog(null, "Hasta pronto!!!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                    break;
            }
        } while (opcion != 4);

    }
}
