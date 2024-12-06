package miarbolbinario;

public class MiArbolBinario {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(35);

        Boolean iniciar = false;

        while (!iniciar) {

            System.out.println(" 1: Pre-Orden || 2: InOrden || 3: PostOrden ");

        }

    }
}
