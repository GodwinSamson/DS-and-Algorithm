package DS;

public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }


    void push(int item) {

        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;

            top++;
        }


    }
    void pop(){
        int previousTop = top;
        if (isEmpty()){
            System.out.println("Stack is underflow");
        }else {
            top--;

        }



    }
    public void printstack() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--){
            System.out.println(array[i] + "");

        }
        System.out.println();
    }

    public static void main(String[] args) {

    }


}

