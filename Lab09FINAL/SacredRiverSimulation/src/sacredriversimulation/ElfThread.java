/*
* Lab 09 for CS 1181 
* This program demonstrates the use of the NetBeans IDE.
* This program/class will create ElfThread objects and simulate their actions of leaving and entering The Sacred River. 
 */
package sacredriversimulation;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Sierra Sprungl
 */
public class ElfThread extends Thread {

    private TheSacredRiver sr;

    /**
     *
     * @param sr
     */
    public ElfThread(TheSacredRiver sr) {
        this.sr = sr;
    }

    @Override
    public void run() {

        Random rand = new Random();

        //               try {
//            sleep(rand.nextInt((10000+1)-4000)+ 4000);
//           } catch (InterruptedException ex) {
//              
//           }
//        while (true) {
//            try {
//                sr.elfEnters();
//                sleep(rand.nextInt((10000 + 1) - 4000) + 4000);
//
//            } catch (InterruptedException ex) {
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(rand.nextInt((10000 + 1) - 4000) + 4000);
                        sr.elfEnters();
                        sleep(rand.nextInt((10000 + 1) - 4000) + 4000);
                        sr.elfExits();
                    } catch (InterruptedException ex1) {
                    }
                    
                }
            }
//            sr.elfExits();
        

//           try {
//            sleep(rand.nextInt((10000+1)-4000)+ 4000);
//           } catch (InterruptedException ex) {
//              
//               try {
//                   synchronized(DwarfThread.class){
//                   DwarfThread.class.wait(rand.nextInt((5000+1)-2000)+5000);
//                   
//                   }  }  catch (InterruptedException ex) {
//                   
//               }
    }


