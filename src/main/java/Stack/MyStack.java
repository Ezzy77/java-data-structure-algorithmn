package Stack;

public class MyStack {
    private int[] s;
    private int maxSize;
    private int top;

    public MyStack(int maxSize){
        this.maxSize = maxSize;
        s = new int[maxSize];
        top = -1;

    }

    public void push(int value){

        s[top+1] = value;
        top++;

    }

    public int pop(){
        int res = s[top];
        top--;
        return res;
    }

}
