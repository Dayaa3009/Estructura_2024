package miarbolbinario;

import javax.accessibility.AccessibleRole;
import java.util.Scanner;

public class MiArbolBinario {

    public static void main(String[] args) {
        ArbolBionario arbol = new ArbolBionario();
        Scanner teclado = new Scanner(System.in);

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(35);

        Boolean iniciar = false;

        while (iniciar) {
            displayMenu();

            try {
                System.out.println("Ingrese una opción");
                int usuario = teclado.nextInt();
                
                switch (usuario) {
                    case 1:
                        System.out.println("Iniciando PreOrden");
                        arbol.preOrden();
                        break;
                        
               
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            } catch (Exception e) {
            }

        }

    }

    public static void displayMenu() {
        System.out.println(" 1: Pre-Orden || 2: InOrden || 3: PostOrden");
        System.out.println(" 4: Insertar || 5: Eliminar || 6: Hojas del arbol");
        System.out.println(" 7: Nodos con hijo || 0: Salir");
    }
}
