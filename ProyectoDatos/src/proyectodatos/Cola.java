
package proyectodatos;


public class Cola {
    
    private NodoC frente;
    private NodoC ultimo;

    public NodoC getFrente() {
        return frente;
    }
    
    
    public void encola(NodoC d){
        if(frente == null){
            frente = d;
            ultimo = d;
        }else{
            ultimo.setAtras(d);
            ultimo = d;
        }
    }
    
    public NodoC atiende(){
        NodoC aux = frente;
        if (frente!=null){
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    public void imprimeCola(NodoC nombreCorredor){
        if(nombreCorredor.getAtras()==null){
            System.out.println("El nombre del corredor es " + nombreCorredor.getNombre());
        }else{
            System.out.println("El nombre del corredor es " + nombreCorredor.getNombre());
            imprimeCola(nombreCorredor.getAtras());
        }
    }
    
}
