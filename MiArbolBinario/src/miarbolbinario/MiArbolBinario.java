package miarbolbinario;

import java.util.Scanner;

public class MiArbolBinario {

    public static void main(String[] args) {
        ArbolBionario arbol = new ArbolBionario();
        Scanner teclado = new Scanner(System.in);

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(35);

        Boolean iniciar = true;

        while (iniciar) {
            displayMenu();

            try {
                System.out.println("Ingrese una opcion");
                int usuario = teclado.nextInt();

                switch (usuario) {

                    case 0:
                        System.out.println("Muchas gracias, vuelva pronto");
                        iniciar = false;
                        break;

                    case 1:
                        System.out.println("Iniciando PreOrden");
                        arbol.preOrden();
                        break;

                    case 2:
                        System.out.println("Iniciando InOrden");
                        arbol.inOrden();
                        break;

                    case 3:
                        System.out.println("Iniciando PostOrden");
                        arbol.postOrden();
                        break;

                    case 4:
                        System.out.println("Insertar en el arbol");
                        int num = teclado.nextInt();
                        arbol.insertar(num);
                        break;

                    case 5:
                        arbol.preOrden();  //Muestra lo elementos del arbol en preOrden
                        System.out.println("Eliminar del arbol"); //completar
                        int numBorrar = teclado.nextInt();
                        arbol.eliminar(numBorrar);
                        break;

                    case 6:
                        System.out.println("Hojas del arbol: " + arbol.contarHojas());
                        break;

                    case 7:
                        System.out.println("Nodos con un hijo: " + arbol.nodosUnHijo());
                        break;

                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error de entrada");
                teclado.nextLine();
            }

        }

    }

    public static void displayMenu() {
        System.out.println("\n 1: Pre-Orden || 2: InOrden || 3: PostOrden");
        System.out.println(" 4: Insertar || 5: Eliminar || 6: Hojas del arbol");
        System.out.println(" 7: Nodos con hijo || 0: Salir");
    }
}
