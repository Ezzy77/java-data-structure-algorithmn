import ADT.MyStack;
import List.Link;
import List.LinkedList;
import examples.Reverser;

public class Main {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(9);

        list.displayList();

        list.deleteFirst();
        list.deleteFirst();

        list.displayList();



    }
}
