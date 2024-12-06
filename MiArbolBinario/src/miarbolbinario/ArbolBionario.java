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

    void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Visita el nodo actual
            preOrden(nodo.izquierda);          // Recorre el subárbol izquierdo
            preOrden(nodo.derecha);            // Recorre el subárbol derecho
        }
    }

    public void preOrden() {
        preOrden(raiz);
    }

    private void inOrden(Nodo nodo) {

        if (nodo != null) {
            inOrden(nodo.izquierda);          // Recorre el subárbol izquierdo
            System.out.print(nodo.valor + " "); // Visita el nodo actual
            inOrden(nodo.derecha);            // Recorre el subárbol derecho
        }
    }

    public void inOrden() {
        inOrden(raiz);  //recursividad
    }

    private void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierda);        // Recorre el subárbol izquierdo
            postOrden(nodo.derecha);          // Recorre el subárbol derecho
            System.out.print(nodo.valor + " "); // Visita el nodo actual
        }
    }

    public void postOrden() {
        postOrden(raiz);
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

    public int contarHojas() {
        return contarHojas(raiz);
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

    public int nodosUnHijo() {
        return nodosUnHijo(raiz);
    }

    // Método para eliminar un nodo
    public Nodo eliminar(Nodo nodo, int valor) {
        if (nodo == null) {
            System.out.println("El nodo no existe en el árbol.");
            return null;
        }
        if (valor < nodo.valor) {
            nodo.izquierda = eliminar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminar(nodo.derecha, valor);
        } else {
            // Caso 1: Nodo sin hijos
            if (nodo.izquierda == null && nodo.derecha == null) {
                return null;
            }
            // Caso 2: Nodo con un solo hijo
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }
            // Caso 3: Nodo con dos hijos
            Nodo sucesor = encontrarMinimo(nodo.derecha);
            nodo.valor = sucesor.valor;
            nodo.derecha = eliminar(nodo.derecha, sucesor.valor);
        }
        return nodo;
    }

    public void eliminar(int valor) {
        raiz = eliminar(raiz, valor);
    }

    // Método auxiliar para encontrar el nodo mínimo en el subárbol derecho
    private Nodo encontrarMinimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }
    

}
