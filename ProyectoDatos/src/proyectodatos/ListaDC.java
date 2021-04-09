
package proyectodatos;

public class ListaDC {
    
    NodoLDC cabeza;
    NodoLDC ultimo;

    public void Insertar(Corredor c) {

        if (cabeza == null) {
            cabeza = new NodoLDC(c);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (c.getID() < cabeza.getDatosCorredor().getID()) {
            NodoLDC aux = new NodoLDC(c);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (ultimo.getDatosCorredor().getID() <= c.getID()) {
            ultimo.setNext(new NodoLDC(c));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            NodoLDC aux = cabeza;
            while (aux.getNext().getDatosCorredor().getID() < c.getID()) {
                aux = aux.getNext();
            }
            NodoLDC temp = new NodoLDC(c);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);

        }
        
    }

    public void reporte() {

        if (cabeza == null) {
            System.out.println("No hay datos en la lista");
        } else {
            NodoLDC aux = cabeza;
            do {
                System.out.print("\n");
                aux = aux.getNext();
            } while (aux != cabeza);
        }

    }
    
}
