package Trees.binarySearch;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese cantidad de valores a ingresar : ");
            int totalNodos = sc.nextInt();
            Arbol arbol = new Arbol();

            for( int i = 0 ; i < totalNodos ; i++ ){
                System.out.println("Ingrese valor " + ( i + 1 ) + " : " );
                arbol.insertar(sc.nextInt());
            }

            System.out.println("¿ Cual es el nodo que desea buscar ?");
            int nodoABuscar = sc.nextInt();

            imprimirOrden(arbol);

            Nodo nodoEncontrado = arbol.buscarNodo(arbol.inicial,nodoABuscar);
            imprimirNodo(nodoEncontrado);

        }catch (Exception e){
            System.out.println("Ocurrio un error en el proceso ");
            e.printStackTrace();
        }


    }

    public static void imprimirNodo(Nodo nodo){
        StringBuilder sb = new StringBuilder();

        if(nodo == null){
            sb.append("\nEl nodo no existe");
        }else{
            sb.append("\nEl nodo tiene el valor : ").append(nodo.getValor());

            if( nodo.getNodoIzq() == null ){
                sb.append("\nEl nodo izquierdo no existe ");
            }else{
                sb.append("\nEl nodo izquierdo tiene el valor : ").append(nodo.getNodoIzq().getValor());
            }

            if( nodo.getNodoDerecho() == null ){
                sb.append("\nEl nodo derecho no existe ");
            }else{
                sb.append("\nEl nodo derecho tiene el valor : ").append(nodo.getNodoDerecho().getValor());
            }
        }

        System.out.println(sb.toString());

    }

    public static void imprimirOrden(Arbol arbol){
        System.out.println("\n");
        System.out.println("INORDER :");
        arbol.dispararInOrder();
        System.out.println(" ");
        System.out.println("POSTORDER :");
        arbol.dispararPostOrder();
        System.out.println(" ");
        System.out.println("PREORDER :");
        arbol.dispararPreOrder();
        System.out.println("\n");
    }

}