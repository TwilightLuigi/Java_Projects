/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacredriversimulation;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sierra
 */
public class DwarfThread extends Thread {
    private TheSacredRiver sr;
    
    public DwarfThread(TheSacredRiver sr){
        this.sr =sr;
    }

  
    
    @Override
    public void run(){
        
        Random rand = new Random();
       
           
           for(int i=0; i<10; i++){
//               try {
//               sleep(rand.nextInt((10000+1)-4000)+ 4000);
//           } catch (InterruptedException ex) {
//              
//           }
           try {
               sleep(rand.nextInt((10000+1)-4000)+ 4000);
               sr.dwarfEnters();
               sleep(rand.nextInt((10000+1)-4000)+ 4000);
               sr.dwarfExits();
           } catch (InterruptedException ex) {
//               try {
//                   sleep(rand.nextInt((10000+1)-4000)+ 4000);
//               } catch (InterruptedException ex1) {
//               }
//           }
//           
//           try {
//            sleep(rand.nextInt((10000+1)-4000)+ 4000);
//           } catch (InterruptedException ex) {
//              
//           }
//           try {
//               synchronized(ElfThread.class){
//               ElfThread.class.wait(rand.nextInt((5000+1)-2000)+5000);
//           }} catch (InterruptedException ex) {
//               
//           }
           
       
    }
}
    }}
