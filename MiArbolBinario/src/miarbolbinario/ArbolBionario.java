package miarbolbinario;

public class ArbolBionario {

    Nodo raiz;

    public ArbolBionario() {
        raiz = null;
    }

    // Método recursivo para insertar un nodo
    Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertar(nodo.izquierda, valor); // Inserta en el subárbol izquierdo
        } else if (valor > nodo.valor) {
            nodo.derecha = insertar(nodo.derecha, valor); // Inserta en el subárbol derecho
        }
        return nodo; // Retorna el nodo actualizado
    }

    // Método público para insertar un valor en el árbol
    void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Visita el nodo actual
            preOrden(nodo.izquierda);          // Recorre el subárbol izquierdo
            preOrden(nodo.derecha);            // Recorre el subárbol derecho
        }
    }

    public void inOrden(Nodo nodo) {

        if (nodo != null) {
            inOrden(nodo.izquierda);          // Recorre el subárbol izquierdo
            System.out.print(nodo.valor + " "); // Visita el nodo actual
            inOrden(nodo.derecha);            // Recorre el subárbol derecho
        }

    }

    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierda);        // Recorre el subárbol izquierdo
            postOrden(nodo.derecha);          // Recorre el subárbol derecho
            System.out.print(nodo.valor + " "); // Visita el nodo actual
        }
    }

    int contarHojas(Nodo nodo) {
        if (nodo == null) {
            return 0; // Si el nodo es nulo, no hay hojas
        }
        if (nodo.izquierda == null && nodo.derecha == null) {
            return 1; // Es una hoja
        }
        return contarHojas(nodo.izquierda) + contarHojas(nodo.derecha); // Suma las hojas de los subárboles
    }

    int nodosUnHijo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int count = 0;
        if ((nodo.izquierda == null && nodo.derecha != null)
                || (nodo.izquierda != null && nodo.derecha == null)) {
            count = 1; // Nodo con un solo hijo
        }
        return count + nodosUnHijo(nodo.izquierda) + nodosUnHijo(nodo.derecha);
    }

}
