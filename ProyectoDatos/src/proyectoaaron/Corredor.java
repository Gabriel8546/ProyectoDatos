
package proyectoaaron;


public class Corredor {
    
    private String nombre;
    private int ID;
    private String patrocinador;
    private double tiempoVuelta1;
    private double tiempoVuelta2;
    private double tiempoVuelta3;
    private double tiempoTotal;

    public Corredor(String nombre, int ID, String patrocinador, double tiempoVuelta1, double tiempoVuelta2, double tiempoVuelta3, double tiempoTotal) {
        this.nombre = nombre;
        this.ID = ID;
        this.patrocinador = patrocinador;
        this.tiempoVuelta1 = tiempoVuelta1;
        this.tiempoVuelta2 = tiempoVuelta2;
        this.tiempoVuelta3 = tiempoVuelta3;
        this.tiempoTotal = tiempoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public double getTiempoVuelta1() {
        return tiempoVuelta1;
    }

    public void setTiempoVuelta1(double tiempoVuelta1) {
        this.tiempoVuelta1 = tiempoVuelta1;
    }

    public double getTiempoVuelta2() {
        return tiempoVuelta2;
    }

    public void setTiempoVuelta2(double tiempoVuelta2) {
        this.tiempoVuelta2 = tiempoVuelta2;
    }

    public double getTiempoVuelta3() {
        return tiempoVuelta3;
    }

    public void setTiempoVuelta3(double tiempoVuelta3) {
        this.tiempoVuelta3 = tiempoVuelta3;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(double tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    
    
    
    
    
     @Override
    public String toString() {
        return "\nCorredor: " + nombre + "\nID: " + ID + "\nTiempo total: "+ tiempoTotal;
    }
    
    
}
