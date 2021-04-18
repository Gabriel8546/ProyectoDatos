package proyectodatos;


public class NodoC {
    
    private String nombreCorredor;
    private int ID;
    private NodoC atras;

    public NodoC(String nombre) {
        this.nombreCorredor = nombre;
        this.atras = null;
    }

    public String getNombre() {
        return nombreCorredor;
    }

    public void setNombre(String nombre) {
        this.nombreCorredor = nombre;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }
 
}
