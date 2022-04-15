/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treadtester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Sierra
 */
public class TreadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Testing for the single threading case starts.
        // Creating an int varible that will be used for setting the size of the array, in this case the size is 1000000
        int size = 1000000;
        int rep = 25;
        long time1;
        long time2;
        long totalTime = 0;

        ArrayList<Double> list = new ArrayList(size);
        ArrayList<Double> list2 = new ArrayList(size);
        ArrayList<Double> list3 = new ArrayList(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {

            list.add(rand.nextDouble());
            list2.add(rand.nextDouble());
            list3.add(rand.nextDouble());
           
        }
        for(int i =0; i<rep; i++){
            ArrayList<Double> listc = (ArrayList) list.clone();
            ArrayList<Double> list2c = (ArrayList) list2.clone();
            ArrayList<Double> list3c = (ArrayList) list3.clone();
            SingleThread st = new SingleThread(listc, list2c, list3c);
            time1 = System.currentTimeMillis();
            st.start();
            st.join();
            time2 = System.currentTimeMillis();
            totalTime += time2 - time1;
        }
        
        long avarageTime = totalTime / rep;
        System.out.println("Single threaded sorting took " + avarageTime + " ms");

     

        
        

        //Testing for multiThreaded case starts
        int size2 = 1000000;
        int rep2 = 25;
        long mttime1;
        long mttime2;
        long totalTime2 = 0;
        
        ArrayList mtlist1 = new ArrayList(size);
        ArrayList mtlist2 = new ArrayList(size);
        ArrayList mtlist3 = new ArrayList(size);
        Random rand2 = new Random();
        
        for(int i=0; i < size2; i++ ){
            mtlist1.add(rand2.nextDouble());
            mtlist2.add(rand2.nextDouble());
            mtlist3.add(rand2.nextDouble());
        }
        for (int i=0; i<rep2; i++){
            ArrayList<Double> mtlist1c = (ArrayList) mtlist1.clone();
            ArrayList<Double> mtlist2c = (ArrayList) mtlist2.clone();
            ArrayList<Double> mtlist3c = (ArrayList) mtlist3.clone();
            MultiThreaded mt = new MultiThreaded(mtlist1c);
            MultiThreaded mt2 = new MultiThreaded(mtlist2c);
            MultiThreaded mt3 = new MultiThreaded(mtlist3c);
            mttime1 = System.currentTimeMillis();
            mt.start();
            mttime1 = System.currentTimeMillis();
            mt2.start();
            mttime1 = System.currentTimeMillis();
            mt3.start();
            mt.join();
            mt2.join();
            mt3.join();
            mttime2 = System.currentTimeMillis();
            totalTime2+= mttime2 - mttime1;
        }
        long avarageTime2 = totalTime2/rep2;
        System.out.println("Multi threaded sorting took " + avarageTime2 + " ms");
        
       
}
}
