package Trees.exercise04;

import Trees.Node;

/*
Determina si un arbol bianrio es un arbol bianrio de busqueda:
- El subarbol izquierdo de un nodo contiene solamente nodso <= que el
- El subarbol derecho de un nodo contiene solamente nodos > que el
- Ambos subarboles deben ser a su vez arboles binarios de busqueda.

Ejemplo 1:
Input :
              4
          2       7
       1    3  5

    Output: true
 */
public class ValidateBST {

    public boolean isValidBST(Node root){
        return isValidBST(root,null, null);
    }

    public boolean isValidBST( Node root, Integer min ,Integer max ){
        if( root == null ) return true;
        if( min != null && root.value <= min || ( max != null && root.value > max ))
            return false;
        return isValidBST(root.left, min , root.value) && isValidBST(root.right, root.value,max);
    }

}
