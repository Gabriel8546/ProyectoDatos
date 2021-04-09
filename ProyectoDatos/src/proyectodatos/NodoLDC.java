
package proyectodatos;


public class NodoLDC {
    
    private Corredor datosCorredor;
    private NodoLDC next;
    private NodoLDC back;

    public NodoLDC(Corredor datosCorredor) {
        this.datosCorredor = datosCorredor;
        this.next = null;

    }

    public Corredor getDatosCorredor() {
        return datosCorredor;
    }

    public void setDatosCorredor(Corredor datosCorredor) {
        this.datosCorredor = datosCorredor;
    }

    public NodoLDC getBack() {
        return back;
    }

    public void setBack(NodoLDC back) {
        this.back = back;
    }

    public NodoLDC getNext() {
        return next;
    }

    public void setNext(NodoLDC next) {
        this.next = next;
    }
    
}
