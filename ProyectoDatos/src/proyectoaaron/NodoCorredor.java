
package proyectoaaron;


public class NodoCorredor {
    
        private Corredor datosCorredor;
    private NodoCorredor next;
    private NodoCorredor back;

    public NodoCorredor(Corredor datosCorredor) {
        this.datosCorredor = datosCorredor;
        this.next = null;
        this.back = null;
    }

    public Corredor getDatosCorredor() {
        return datosCorredor;
    }

    public void setDatosCorredor(Corredor datosCorredor) {
        this.datosCorredor = datosCorredor;
    }

    public NodoCorredor getNext() {
        return next;
    }

    public void setNext(NodoCorredor next) {
        this.next = next;
    }

    public NodoCorredor getBack() {
        return back;
    }

    public void setBack(NodoCorredor back) {
        this.back = back;
    }
    
    
    
    @Override
    public String toString() {
        return "Corredor{" + datosCorredor + '}';
    }
    
    
}
