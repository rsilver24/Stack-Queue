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
    }

    public E dequeue(){

    }

    public boolean isEmpty(){

    }

    public int size(){

    }

    public E peek(){

    }
}
