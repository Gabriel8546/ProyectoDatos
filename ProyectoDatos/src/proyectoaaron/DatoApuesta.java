
package proyectoaaron;


public class DatoApuesta {
    
     private String nombreCorredor;
    private double montoApostado;
    private DatoApuesta abajo;

    public DatoApuesta(String nombreCorredor, double montoApostado) {
        this.nombreCorredor = nombreCorredor;
        this.montoApostado = montoApostado;
        this.abajo = null;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public double getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(double montoApostado) {
        this.montoApostado = montoApostado;
    }

    public DatoApuesta getAbajo() {
        return abajo;
    }

    public void setAbajo(DatoApuesta abajo) {
        this.abajo = abajo;
    }

    

    @Override
    public String toString() {
        return "Corredor: El nombre del corredor es: " + nombreCorredor
                + " El monto apostado es: " + montoApostado + "|\n " + abajo;
    }
    
}
