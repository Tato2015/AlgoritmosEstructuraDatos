import LinkedLists.SingleLinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.appendToTotal(2);
        list.appendToTotal(4);
        list.appendToTotal(1);
        list.appendToTotal(8);
        list.appendToTotal(26);
        list.print();
        list.deleteNode(8);
        list.print();
        list.deleteNode(4);
        list.print();
        list.deleteNode(26);



    }
}