
package CS1181pa7;

/**
 * An object of this class can be run in a separate thread.
 * The purpose of this class is to process requests from the incoming  
 * request queue and then send the processed request to the output queue.
 * All the code that a thread executes will be in the run method.
 */

public class RequestServer implements Runnable
{
    private RequestQueue input;
    private RequestQueue output;
    private int serverID;

/*
 *  Add a constructor that takes two RequestQueue objects and an integer
 *  and initialize the member variables with the provided parameter values.
 *  The input queue is the queue shared between the RequestGenerator object
 *  and objects of this class. The output queue is shared between objects of
 *  this class and the main class which processes the output.
 */
    /**
     * Constructor that creates a RequestServer object, that can be run in a separate thread and is used for processing requests in both
     * the input and output queues. In takes in the input and output RequestQueues has parameter values along with the serverID. 
     * Precondition: RequestQueue object was made and contains valid values. The serverID is of type int. 
     * Postcondition: The RequestQueue objects and serverID were passed in as parameter values
     * @param input - the queue used for adding objects and keeping track of the inputed values in the queue.
     * @param output - the queue used for removing objects and outputting them, it also keeps track of the outputted values.
     * @param serverID - the data being processed in the RequestServer. 
     */
    public RequestServer(RequestQueue input, RequestQueue output, int serverID ){
        this.input = input;
        this.output = output;
        this.serverID = serverID;
    }
    
    @Override
    public void run() 
    {
        final int MAXEXCEPTIONS = 10;
        Delay delayObject = new Delay(294739 * serverID);       
        String data;
        String prefix = "";
        // Keep track of how many time in a row we try to dequeue and get an exception
        // After MAXEXCEPTION times, we assume there are no more requests coming so we exit the loop
        int numExceptionsInARow = 0;
        // Keep track of how many requests we get from the input queue
        int numberOfRequestsServed = 0;
        // Create a string prefix to uniquely identify each instance of this class
        // The prefix will contain serverID number of tabs followed by a colon and a blank
        for(int i = 0; i < serverID; i++)
        {
            prefix += "\t";
        }
        prefix += serverID + ": ";
        // After MAXEXCEPTIONS attempts at dequeueing have failed in a row, we just quit - no more work coming
        while(numExceptionsInARow < MAXEXCEPTIONS)
        {
            // Wait for a while
            delayObject.randomDelay(250, 1000);
            try
            {
                // Try to read a string from the input queue
                data = input.dequeue();
                // If we got one, simulate the processing time by waiting a random amount - 100 msec min to 100 + range 500 msec max
                delayObject.randomDelay(100, 500);
                // Processing is done, so send to the output queue - our unique prefix plus the request string we processed
                output.enqueue(prefix + data);
                // Since we got data, set the number of exceptions in a row counter back to 0
                numExceptionsInARow = 0;
                // Keep track of how many requests we have handled
                numberOfRequestsServed++;
            }
            catch(Exception e)
            {
                // Our attempt to dequeue failed, so increment numExceptions in a row 
                ++numExceptionsInARow;
            }
        }
        // Report statistics for this thread.
        System.out.printf("RequestServer %d served %d requests - terminating!\n", serverID, numberOfRequestsServed);
    }
}
