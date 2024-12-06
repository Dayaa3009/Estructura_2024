package miarbolbinario;

public class ArbolBionario {

    Nodo raiz;

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo actual = raiz;
            while (true) {
                if (valor < actual.valor) {
                    if (actual.izquierdo == null) {
                        actual.izquierdo = nuevoNodo;
                        break;
                    } else {
                        actual = actual.izquierdo;
                    }
                } else {
                    if (actual.derecho == null) {
                        actual.derecho = nuevoNodo;
                        break;
                    } else {
                        actual = actual.derecho;
                    }
                }
            }
        }
    }

    public void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.println(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    public void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.println(nodo.valor + " ");

        }
    }

    public int contarNodosHoja(Nodo nodo) {
        if (nodo == null) {
            return 0;

        } else if (nodo.izquierdo == null && nodo.derecho == null) {
            return 1;
        } else {
            return contarNodosHoja(nodo.izquierdo) + contarNodosHoja(nodo.derecho);
        }
    }

    public void encontrarNodosConUnHijo(Nodo nodo) {
        if (nodo != null) {
            if ((nodo.izquierdo != null && nodo.derecho == null)
                    || (nodo.izquierdo == null && nodo.derecho != null)) {
                System.out.println(nodo.valor + " ");
            }
            encontrarNodosConUnHijo(nodo.izquierdo);
            encontrarNodosConUnHijo(nodo.derecho);

        }
    }

}
}

    
    
    
    
    }
