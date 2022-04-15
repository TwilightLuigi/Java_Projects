
package CS1181pa7;

/**
 * The RequestGenerator class runs in a separate thread of execution.
 * The code that the thread executes must be inside the run method.
 * The purpose of this class is to place strings onto a RequestQueue
 * at random times.
 */

public class RequestGenerator implements Runnable
{
    private RequestQueue output;
    private int numRequests;
    
/*
 * Create a constructor that accepts a RequestQueue object
 * and a number of requests as parameters
 */
    public RequestGenerator(RequestQueue output, int numRequestes){
        this.output = output;
        this.numRequests = numRequestes;
    }
    

    @Override
    public void run() 
    {
        Delay d = new Delay(1000);
     
        
        for(int i=1; i<=numRequests; i++){
           
            
            d.randomDelay(200, 300);
            String requests = "Request # " + i;
           output.enqueue(requests);
         
         
        }
/*
 *  Create a Delay object with a large integer seed value (dont use the same seed elsewhere).
 *  You will need a loop that does the following 
 *       Use the delay object to wait for a random delay between 200 and 500 milliseconds - that is min of 200 + range of 300
 *       Place a string onto the request queue. The string should look like "Request # n" 
 *          where n is the request number.... first request is # 1, second request is # 2, etc
 *  The loop should stop when the specified number of requests have been enqueued.
 */
    }
}
