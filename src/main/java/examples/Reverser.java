package examples;

import ADT.MyStack;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in){
        input = in;
    }

    public String doRev(){
        int stackSize = input.length();
        //MyStack stack = new MyStack(stackSize);
        MyStack<String> stack = new MyStack<>(stackSize);

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            stack.push(String.valueOf(ch));

        }
        output = " ";

        while (!stack.isEmpty()){

           String popped = stack.pop();

           output+= popped;

        }

        return output;
    }
}
