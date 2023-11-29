public class StackQueueDriver {
    public static void main(String[] args) {
        StackQueue SQ = new StackQueue();

        //Test to see if isEmpty method works
        System.out.print("Method isEmpty check (should print true, as nothing is added): ");
        System.out.println(SQ.isEmpty());

        System.out.println();

        // Test to see if the size() method works
        System.out.print("Method size check (should print 0, as nothing is added): ");
        System.out.println(SQ.size());

        System.out.println();

        // Test to see if the enqueue and peek methods works
        System.out.println("Method enqueue + peek check (should be — Value = 1, Size = 3): ");
        SQ.enqueue(1);
        SQ.enqueue(2);
        SQ.enqueue(3);
        System.out.println("Value = " + SQ.peek() + "   Size = " + SQ.size());

        System.out.println();

        // "top" check of size and isEmpty methods
        System.out.print("Method isEmpty + size method checks (should print: false, 3): ");
        System.out.println(SQ.isEmpty() + ", " + SQ.size());

        System.out.println();

        //Test to see if the dequeue method works
        System.out.print("Method dequeue check (should be returning: 1, 2, 3): ");
        System.out.println("Values: " + SQ.dequeue() + ", " + SQ.dequeue() + ", " + SQ.dequeue());

        System.out.println();

        //Final isEmpty check
        System.out.print("Final isEmpty check (should print true), and size check (should print 0): ");
        System.out.println(SQ.isEmpty() + ", " + SQ.size());
    }
}
