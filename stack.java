public class Stack {
    private int[] data; // array to store elements
    private int top; // index of the top element in the stack

    public Stack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == data.length - 1) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        data[top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        int element = data[top];
        top--;
        return element;
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
