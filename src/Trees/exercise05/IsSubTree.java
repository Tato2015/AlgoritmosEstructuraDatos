package Trees.exercise05;

import Trees.Node;

/*

Determina si el arbol second es subarbol del arbol first
Ejemplo1 :
Input :
    first:
            4
        5       7
     1    3
   8

   second :
            4
        2        7
    1      3   5
 */
public class IsSubTree {

    public boolean isSubTree( Node first , Node second ){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        preOrder(first,sb1);
        preOrder(second,sb2);

        return  sb1.toString().contains(sb2.toString());
    }

    private void preOrder( Node node, StringBuilder sb ){
        if( node == null ){
            sb.append("X");
            return;
        }
        sb.append(node.value);
        preOrder( node.left , sb);
        preOrder( node.right , sb);
    }

}
