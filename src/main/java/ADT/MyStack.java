package ADT;

public class MyStack<T> {
    private T[] s;
    private int maxSize;
    private int top;

    public MyStack(int maxSize){
        this.maxSize = maxSize;
        s = (T[]) new Object[maxSize];
        top = -1;

    }

    // push() method insert a value at the top of the stack
    public void push(T value){

        s[top+1] = value;
        top++;

        // s[++top] = value;
        // increment top, then insert item

    }

    // pop() method removed the last
    // inserted item and return the item
    public T pop(){

        T res = s[top];
        top--;

        // return s[--top]
        return res;
    }

    // return top item or last inserted
    // item without removing it
    public T peek(){
        return s[top];
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }

        return  false;
    }

    public boolean isFull(){
        if (maxSize - 1 == top)
            return true;

        return false;
    }

}
