package Trees.exercise06;

import Trees.Node;

/*

Devuelve el primer ancestro comun de dos nodos

Ejemplo:
    Input :
            4
         5     7
      1    3
   8

   firdtCommonAncestor(1,7) = 4
   firdtCommonAncestor(1,4) = null
   firdtCommonAncestor(1,3) = 5
 */
public class FirstCommonAncestor {

    class AmcestorNode{
        boolean nodeFound;
        Node ancestor;
    }

    public Node firstCommonAncestor( Node root , Node firstNode, Node secondNode ){
            return postOrderSearch(root, firstNode, secondNode).ancestor;
    }

    private AmcestorNode postOrderSearch( Node root , Node firstNode, Node secondNode ){
        if( root == null ) {
            return new AmcestorNode();
        }

        AmcestorNode leftResult = postOrderSearch(root.left, firstNode,secondNode);
        if( leftResult.ancestor != null )
            return leftResult;

        AmcestorNode righttResult = postOrderSearch(root.right, firstNode,secondNode);
        if( righttResult.ancestor != null )
            return righttResult;

        AmcestorNode result = new AmcestorNode();
        if( leftResult.nodeFound && righttResult.nodeFound ){
            result.ancestor = root;
            return result;
        }

        result.nodeFound = root == firstNode || root == secondNode || leftResult.nodeFound || righttResult.nodeFound;
        return result;
    }



}
