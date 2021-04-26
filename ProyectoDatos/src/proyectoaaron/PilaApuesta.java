
package proyectoaaron;


public class PilaApuesta {
    
     private DatoApuesta top;

    public DatoApuesta getTop() {
        return top;
    }
    
    
    public void push(DatoApuesta objetoNuevo){
        objetoNuevo.setAbajo(top);
        top = objetoNuevo;
    }
    
    public DatoApuesta pop(){
        DatoApuesta auxiliar = null;
        if(PilaVacia()){
            System.out.println("La pila está vacia!");
        }else{
            auxiliar = top;
            top = top.getAbajo();
            auxiliar.setAbajo(null);
        }
        return auxiliar;
    }
    
    public boolean PilaVacia(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimePila(DatoApuesta nodo){
        if(nodo.getAbajo()== null){
            System.out.println("Apuesta: " + nodo.getMontoApostado() + " al corredor "+ nodo.getNombreCorredor());
        }else {
          System.out.println("Apuesta: " + nodo.getMontoApostado() + " al corredor "+ nodo.getNombreCorredor());
            imprimePila(nodo.getAbajo());
        }
    }
    
    @Override
    public String toString() {
        return "Pila{" + "top=" + top + '}';
    }
    
}
