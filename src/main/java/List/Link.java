package List;

public class Link {
    int anInt;
    Link next;

    public Link(int in){
        anInt = in;
        next = null;

    }

    public void displayList(){
        System.out.print(" " + anInt + ",");

    }

}
