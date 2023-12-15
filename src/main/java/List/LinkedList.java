package List;

public class LinkedList {
    Link first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int nn){
        Link newLink = new Link(nn);

        newLink.next = first;

        first = newLink;
    }


    public Link deleteFirst(){
        if (isEmpty()) return null;

        Link temp = first;

        first = first.next;

        return temp;
    }

    public Link find(int value){
        Link current = first;

        while (current.anInt != value){
            if (current.next == null){
                return null;
            }
            else
                current = current.next;

        }
        return current;

    }

    public Link delete(int value){
        Link current = first;
        Link previous = first;

        while (current.anInt != value){
            if (current.next == null)
                // not found
                return null;
            else {
                // go to next link
                previous = current;
                current = current.next;
            }
        }
        // its found
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;

        return  current;
    }

    public void displayList(){
        Link current = first;


        System.out.print("{");


        while (current != null){

            current.displayList();
            current = current.next;
        }

        System.out.print("}");


    }
}
