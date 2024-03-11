package Trees.exercise02;



import Trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementa un algoritmo que devuelva una lista enlazada con los nodos
 * de cada nivel. Si el árbol tiene N niveles debes devovler N listas enlazadas
 * Ejemplo
 *  Input
 *         4
 *      2     7
 *    1  2  6  9
 *
 *    Output:
 *    4
 *    2 -> 7
 *    1 -> 3 -> 6 -> 9
 *
 */
public class ListOfDepths {

    public List<LinkedList<Node>> listOfDepths(Node root){
        List<LinkedList<Node>> result = new ArrayList<>();
        LinkedList<Node> current = new LinkedList<>();
        current.add(root);
        while( !current.isEmpty() ){
            result.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();
            for(Node node : parents){
                if( node.left != null ){
                    current.add(node.left);
                }

                if( node.right != null ){
                    current.add(node.right);
                }

            }
        }
        return result;
    }



}
