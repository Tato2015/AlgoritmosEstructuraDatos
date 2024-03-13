package Trees.binarySearch;

public class Arbol {

    Nodo inicial;

    public Arbol(){
        this.inicial = null;
    }

    public void insertar( int valor){
        if( this.inicial == null ){
            this.inicial = new Nodo(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }

    public Nodo buscarNodo(Nodo nodo, int valor){
        if (nodo == null || nodo.getValor() == valor) {
            return nodo;
        }

        Nodo encontradoIzquierda = buscarNodo(nodo.getNodoIzq(), valor);
        if (encontradoIzquierda != null) {
            return encontradoIzquierda;
        }

        return buscarNodo(nodo.getNodoDerecho(), valor);

    }


    public void dispararPreOrder(){
        this.preOrder(this.inicial);
    }

    public void preOrder( Nodo nodo ){
        if( nodo == null ){
            return;
        }else{
            System.out.print(nodo.getValor()+" , ");
            preOrder(nodo.getNodoIzq());
            preOrder(nodo.getNodoDerecho());
        }
    }

    public void dispararInOrder(){
        this.inOrder(this.inicial);
    }
    public void inOrder( Nodo nodo ){
        if( nodo == null ){
            return;
        }else{
            inOrder(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+" , ");
            inOrder(nodo.getNodoDerecho());
        }
    }

    public void dispararPostOrder(){
        this.postOrder(this.inicial);
    }
    public void postOrder( Nodo nodo ){
        if( nodo == null ){
            return;
        }else{
            postOrder(nodo.getNodoIzq());
            postOrder(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+" , ");
        }
    }


}
