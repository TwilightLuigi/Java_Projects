/*
 * This queue class must be implemented using your own 
 * methods for linking nodes together in a linked data structure.
 * You need to define a Node class inside of this class.
 * You need to specify the member variables needed to
 * maintain your queue and implement all the methods of the
 * RequestQueue interface.
 */
/**
 * Lab 07 for CS1181
 * This program demonstrates the use of the NetBeans IDE.
 * This program/class will be used to create a node a object and queue that will be used for all the operations of this program.
 * It also creates and overrides enqueue and dequeue methods that will be used for added an removing values from the queue. It also creates
 * It also creates and overrides the toString method and creates a method that will be used to show the length that the queue reached.
 * Lastly, it implements the RequestQueue interface.
 */
package CS1181pa7;

public class MyRequestQueue implements RequestQueue {

    private class Node {

        public String input;
        public Node next;

        /**
         * A constructor that creates a node object that takes in String input
         * and a Node to use as a reference that will be used to add and delete
         * things from the queue. Precondition: the values for the input and
         * node are of the correct the type. Postcondition: the values were
         * valid
         *
         * @param input - it is of type String and it is the information being
         * put into the node.
         * @param temp - it is of type node and is used as the reference and
         * position in which to insert the node in the queue.
         */
        public Node(String input, Node temp) {
            this.input = input;
            this.next = temp;
        }

    }
    private Node first;
    private Node last;
    private int max;
    /**
     * Overrides the enqueue method in the RequestQueue interface, is used to
     * add values to the queue from the back of it Precondition: the value for
     * the input was of type String and valid Postcondition: a value for input
     * was passed in
     *
     * @param input - the value being added to the queue.
     */
    @Override
    public void enqueue(String input) {
        Node temp = new Node(input, null);
        int count = 0;
        if (first == null) {
            first = temp;
            count++;
            
        } else {
            last.next = temp;
            count++;
            max++;
        }
        last = temp;
       count++;
       if(max<count){
         max++;
       }
    }

    /**
     * Overrides the dequeue method in the RequestQueue interface, it is used to
     * remove the first item in the queue and display it. Precondition: the
     * values in the queue are valid. Postcondition: the queue has values in it
     * with can be removed and printed
     *
     * @return - the value being removed from the queue
     * @throws Exception - when an attempt is made to remove a value from an
     * empty queue.
     */
    @Override
    public String dequeue() throws Exception {
        if (first == null) {
            throw new Exception("The queue is empty, can't dequeue from an empty queue.");
        } else {

            String input = first.input;
            first = first.next;
            return input;

        }

    }

    /**
     * Overrides the getMaxLength method in the RequestQueue interface, it is
     * used to track how big the queue got when all the desired values have been
     * added to it. It then prints out how big the queue is, in other words, how
     * many values are in it. Precondition: there are values in the queue
     * Postcondition: the values in the queue are valid
     *
     * @return - how big the queue got/ how many values are in the queue.
     */
    @Override
    public int getMaxLength() {
        return max;
    }

    /**
     * Overrides the toString method, is used to print out the queue
     * Precondition: a queue object was made Postcondition: there are values in
     * the queue
     *
     * @return - the queue will all the values that are in it.
     */
    @Override
    public String toString() {
        Node temp = this.first;
        if (temp == null) {
            System.out.println("This is an empty queue.");
        } else {
            while (temp != null) {
                System.out.println(temp.input);
                temp = temp.next;
            }
        }

        return "";
    }
}
