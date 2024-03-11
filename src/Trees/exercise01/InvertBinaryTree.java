package Trees.exercise01;

import Trees.Node;

/*

Dada la raiz de un arbol binario , devuelve el arbol binario invertido

Ejm:
Input :
        4
     2     7
   1  3   6  9

Output
        4
     7     2
   9  6   3  1


 */
public class InvertBinaryTree {

    public Node invertTree( Node root ){
        if(root == null) return null;

        Node tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);


        return root;
    }

}
