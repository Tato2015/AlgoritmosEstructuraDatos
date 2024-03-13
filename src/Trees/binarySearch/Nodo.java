package Trees.binarySearch;

public class Nodo {

    private int valor;
    private Nodo nodoIzq;
    private Nodo nodoDerecho;

    public Nodo(int valor){
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void insertar(int valor){
        if( valor < this.valor ){
            if( this.nodoIzq == null ){
                this.nodoIzq = new Nodo(valor);
            }else{
                this.nodoIzq.insertar(valor);
            }
        }else{
            if( this.nodoDerecho == null ){
                this.nodoDerecho = new Nodo(valor);
            }else{
                this.nodoDerecho.insertar(valor);
            }
        }
    }






}
