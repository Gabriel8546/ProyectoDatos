package proyectoaaron;

import javax.swing.JOptionPane;

public class ProyectoAaron {

    static ListaCorredor lista = new ListaCorredor();
    static PilaApuesta pila = new PilaApuesta();

    public static void main(String[] args) {

        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione su usuario", "USUARIOS", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Seleccione", "Administrador", "Apostador"}, "Seleccione");

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

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
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
                    String nombre = JOptionPane.showInputDialog("Dgite el nombre del competidor ");
                    // ya no se usa porque lo hace automatico conforme se ingresan pero lo ordena por el tiempo total int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite el "));
                    String patrocinador = JOptionPane.showInputDialog("Ingrese patrocinador");
                    double tiempoVuelta1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del primer  dia de rally del corredor"));
                    double tiempoVuelta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del segundo dia de rally del corredor"));
                    double tiempoVuelta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo del trecer dia de rally del corredor"));
                    double total = tiempoVuelta1 + tiempoVuelta2 + tiempoVuelta3;
                    lista.Insertar(new Corredor(nombre, idCorredor, patrocinador, tiempoVuelta1, tiempoVuelta2, tiempoVuelta3, total));
                    idCorredor = idCorredor + 1;

                    break;
                case 2:

                    break;
                case 3:

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

    public static void menuApostador() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "**********APUESTAS**********\n"
                    + "1.Ver lista Corredores\n"
                    + "2. Apostar\n"
                    + "3. Salir\n\n"
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
                    JOptionPane.showMessageDialog(null, "Hasta pronto!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                    break;
            }
        } while (opcion != 3);

    }
}
