import Array.MyArray;
import Stack.MyStack;

public class Main {


    public static void main(String[] args) {

        MyStack newStack = new MyStack(10);

        newStack.push(5);
        newStack.push(7);
        newStack.push(9);
        newStack.push(2);
        newStack.push(3);

        int poppedVal = newStack.pop();

        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);
        poppedVal = newStack.pop();
        System.out.println(poppedVal);






    }
}
