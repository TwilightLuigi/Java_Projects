package CS1181pa7;

public class QueueTester {

    public static void main(String args[]) {
        // Create an object of your queue class here and add all the test 
        // cases needed to make sure that your queue is working properly!

        // Testing for the MyResquestQueue Begins 
        // Here a MyResquestQueue object is being made, this is the object/queue that will be used for testing. The String values that will be entered into
        // queue are also made has well.
        MyRequestQueue q = new MyRequestQueue();
        String s1 = "Input1";
        String s2 = "Input2";
        String s3 = "Input3";

        // Testing to see that the enqueue method properly adds a String value to the back of the MyRequestQueue queue. 
        q.enqueue(s1);
        q.enqueue(s2);
        q.enqueue(s3);
        System.out.println("This is the queue: ");
        System.out.println(q.toString());
        
        // Testing to see if the getMaxLength method properly outputs the maxium length that the queue reached when there are values in the queue.
        System.out.println("The max length the queue reached:");
        System.out.println(q.getMaxLength());

        // Testing to see that the dequeue method properly removes the first value from the queue and outputs it correctly, when the queue is not empty
        // Also tests to see if the get maxLength method still outputs the correct max length that the queue reached. 
        System.out.println("The result of the dequeue method properly removing and outputting the first value in the queue: ");
        try {
            
            System.out.println(q.dequeue());
        } catch (Exception e) {

        }
        System.out.println("The queue after the first value was removed: ");
        System.out.println(q.toString());
        System.out.println("The max length the queue reached: ");
        System.out.println(q.getMaxLength());
        

        // Testing to see if the dequeue method prints out an error message when an attempt is made to remove and output the first value from an empty queue.
        System.out.println("Test to see if an exception is thrown when an attempt is made to dequeue from an empty queue: ");
        MyRequestQueue q2 = new MyRequestQueue();
        try {
            q2.dequeue();
            System.out.println("Exception failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the getMaxLength method properly ouputs the maxium length has zero when there are not values in the queue
        System.out.println("The max length of the empty queue is: ");
        System.out.println(q2.getMaxLength());

        // Testing to see if the toString method prints out an error when trying tot print out an empty queue. 
        System.out.println("This is the result of the toString being called on an empty queue: ");
        System.out.println(q2.toString());
    }
}
