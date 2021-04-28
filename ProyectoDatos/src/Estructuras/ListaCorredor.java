
package Estructuras;

import javax.swing.JOptionPane;

public class ListaCorredor {
     NodoCorredor cabeza;
    
    public void Insertar(Corredor c){
        if(cabeza==null){
            cabeza = new NodoCorredor(c);
        }else if(c.getTiempoTotal() < cabeza.getDatosCorredor().getTiempoTotal()){
            NodoCorredor aux = new NodoCorredor(c);
            aux.setNext(cabeza);
            cabeza = aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new NodoCorredor(c));
        }else{
            NodoCorredor aux = cabeza;
            while(aux.getNext()!=null && aux.getNext().getDatosCorredor().getTiempoTotal()< c.getTiempoTotal() ){
                aux = aux.getNext();
            }
            NodoCorredor temp = new NodoCorredor(c);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }
    
    public void Eliminar(double Tiempo){
        
        if(cabeza != null){
            if(cabeza != null){
                while(cabeza.getDatosCorredor().getTiempoTotal() >= Tiempo){
                    
                if(cabeza.getDatosCorredor().getTiempoTotal() >= Tiempo){
                    cabeza = cabeza.getNext();
                }else{
                    NodoCorredor aux = cabeza;
 
                    while(aux.getNext() != null && aux.getNext().getDatosCorredor().getTiempoTotal() >= Tiempo){
                        aux = aux.getNext();
                    }
                    if(aux.getNext() != null && aux.getNext().getDatosCorredor().getTiempoTotal() >= Tiempo){
                        aux.setNext(aux.getNext().getNext());
                    }
                    
                }
                }
            }
        }
    }
    
    
    public void Ganador(){
        String ganador;
        Double tiempo;
     if(cabeza==null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia ");  
     }else{
     NodoCorredor aux = cabeza;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            
           ganador = aux.getDatosCorredor().getNombre();
           tiempo = aux.getDatosCorredor().getTiempoTotal();
           JOptionPane.showMessageDialog(null, "El ganador es "+ganador+" con un tiempo de total de "+tiempo);
                   
     }
     
    
    
    }
    
    
    @Override
    public String toString() {
        NodoCorredor aux = cabeza;
        String s = "\n" ;
        while(aux != null){
                s += aux + " " + "\n";
                aux = aux.getNext();
        }
        return s;
    }
    
    
    
}
