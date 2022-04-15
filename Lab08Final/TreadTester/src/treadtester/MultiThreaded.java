/**
 * Lab 8 for CS 1181.
 * This program demonstrates the use of the NetBeans IDE.
 * The program/class will create a multi threaded thread object through the use of a constudto
 **/
package treadtester;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sierra
 */
public class MultiThreaded extends Thread {

    private ArrayList list;
    

    public MultiThreaded(ArrayList list) {
        this.list = list;
        
    }

    @Override
    public void run() {
        Collections.sort(list);
       {
           
       }
    }

}
