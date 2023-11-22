import ADT.MyStack;
import examples.Reverser;

public class Main {


    public static void main(String[] args) {

        Reverser reverser = new Reverser("reverse");

        String result =reverser.doRev();


        System.out.println(result);

    }
}
