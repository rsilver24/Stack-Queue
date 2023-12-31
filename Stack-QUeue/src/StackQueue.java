// Roan Silver      Created: November 27th 2023        Last Edits: November 29th, 2023
public class StackQueue<E> {

    // Instance Data

    private int size;
    private Stack stack1;
    private Stack stack2;

    // Constructors

    public StackQueue(){
        size = 0;
        stack1 = new Stack();
        stack2 = new Stack();
    }

    // Methods

    public void enqueue(E element){
        stack1.push(element);
        size++;
    }

    public E dequeue(){
        E value;
        if (size == 1){
            value = (E)stack1.pop();
        } else{
            for (int i = 0; i < size(); i++){
                stack2.push(stack1.pop());
            } value = (E)stack2.pop();
            for (int i = 0; i < size()-1; i++){
                stack1.push(stack2.pop());
            }
        } size--;
        return value;
    }

    public boolean isEmpty(){
        if (size == 0)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    public E peek(){
        E value;
        if (size == 1){
            value = (E)stack1.peek();
        } else{
            for (int i = 0; i < size(); i++){
                stack2.push(stack1.pop());
            } value = (E)stack2.peek();
            for (int i = 0; i < size(); i++){
                stack1.push(stack2.pop());
            }
        } return value;
    }
}
