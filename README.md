The StackQueue class is a class meant to process data in a form not all to different from an ArrayList or a Stack.
What makes a Queue class unique is that it uses a "first in first out" structure, in which only the FIRST value can be accessed and deleted.
However, this is not JUST a Queue class, but rather a StackQueue class, an iteration of Queue that functions identically, but through a different method.
Rather than directly using Nodes to process information, StackQueue uses a 2 Stack methods to iterate and process order of information.
The first Stack is used to hold the data, while the second Stack is used to iterate through it, peek, and dequeue specific values, then process them backing into the first Stack.
The Stack class itself uses a StackNode to process information, which is just an augmented version of the Node class.

The StackQueue class has three main operations:

enqueue - add a new item to the 'bottom' of the queue, 'top' of Stack 1

dequeue - remove the 'top' item of the queue, 'bottom' of Stack 1, and return it

peek - look at and return the 'top' item of queue, 'bottom' item of Stack 1, without removing it from the queue / Stack

Otherwise, the StackQueueDriver class is run to make sure the StackQueue class works as intended.
