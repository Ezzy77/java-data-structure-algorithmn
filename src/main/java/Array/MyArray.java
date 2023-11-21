package Array;

public class MyArray {

    private int[] a;
    private int nElements;

    public MyArray(int size){
        a = new int[size];
        nElements = 0;
    }

   public void insert(int element){

        a[nElements] = element;
        nElements++;

    }

    public boolean find(int element){
        int i;

        for (i = 0; i < a.length-1; i++) {
            if (a[i]==element){
                break;
            }
        }
        if (element == a[i]){
            return true;
        }
        return false;
    }

    public long getElement(int index){

        return a[index];

    }

    public int getSize(){
        return nElements;
    }

    public boolean delete(long element){

        int i = 0;
        for ( i = 0; i < a.length-1; i++) {

            if (a[i] == element){
                break;
            }

        }

        if (i == nElements){
            return false;
        }else {
            for (int j = 0; j < nElements; j++) {
                a[j] = a[j+1];

                nElements --;
                return  true;
            }
        }

        if (a[i] == element){
            return true;
        }



        return false;
    }

    public int binarySearch(int element){
        int lowerBound = 0;
        int upperBound = nElements -1;

        while (true){
            int curIndex = (lowerBound + upperBound) /2;
            if (a[curIndex] == element){
                return curIndex;
            }

            if (lowerBound > upperBound){
                return nElements; // can not find it
            }

            if (a[curIndex] < element){
                lowerBound = curIndex + 1;

            }
            if (a[curIndex] > element){
                upperBound = curIndex -1;
            }
        }

    }

    public void bubbleSort(){
        int inLoop;
        int outLoop;

        for ( outLoop = nElements -1; outLoop >1; outLoop--) { // outer loop, loops backwards
            for ( inLoop = 0; inLoop < outLoop; inLoop++) { // inner loop, loops forward
                if (a[inLoop] > a[inLoop+1]){
                    int tempValue = a[inLoop];

                    //a[inLoop] = a[inLoop]

                }
            }

        }
    }


}
