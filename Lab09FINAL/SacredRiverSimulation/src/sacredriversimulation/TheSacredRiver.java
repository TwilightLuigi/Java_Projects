/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacredriversimulation;

import java.util.Random;

/**
 *
 * @author Sierra
 */
public class TheSacredRiver {

    private boolean empty;
    private int elfOccupants;
    private int dwarfOccupants;
    private int elfWaiting;
    private int dwarfWaiting;
//   private int occupants;
//   private int waiting;

    public TheSacredRiver(boolean empty, int elfOccupants, int dwarfOccupants, int elfWaiting, int dwarfWaiting) {
        this.empty = empty;
        this.elfOccupants = elfOccupants;
        this.dwarfOccupants = dwarfOccupants;
        this.elfWaiting = elfWaiting;
        this.dwarfWaiting = dwarfWaiting;

    }

    public synchronized String Display() {

        if (elfOccupants > 0) {
            return "The elfs are currently entering the Sacred River, There are " + elfOccupants + " elfs in the river " + " There are " + dwarfWaiting + " dwarfs waiting to access the river.";
        } //       else if(elfOccupants==0  ){
        //           return "The elfs are currenly leaving the Scared River";
        //           
        //       }
        else if (dwarfOccupants > 0) {
            return "The dwarfs are currently entering the Scared River, There are " + dwarfOccupants + " dwarfs in the river " + " There are " + elfWaiting + " elfs waiting to access the river";
        } //       else if(dwarfOccupants==0 ){
        //           return "The dawrfs are currently leaving the Scared River ";
        //       }
        else if (elfOccupants == 0 && dwarfOccupants == 0) {
            return "The SacredRiver is empty.";
        }

        return "";

    }

    public synchronized void elfEnters() throws InterruptedException {
        Random rand = new Random();

        if (empty == true || elfOccupants > 0) {
            elfOccupants++;
            empty = false;
            //elfWaiting--;
            
        } else if (dwarfOccupants > 0) {
            elfWaiting++;
            while (dwarfOccupants > 0) {
                wait();
                
            }
            if (empty == true || elfOccupants > 0) {
                elfWaiting--;
                elfOccupants++;
                empty = false;
                
            }
            //elfWaiting--;
        }
        System.out.println(this.Display());
    }

    public synchronized void dwarfEnters() throws InterruptedException {
        Random rand = new Random();

        if (empty == true || dwarfOccupants > 0) {

            dwarfOccupants++;
             //dwarfWaiting--;
            empty = false;
           
        } else if (elfOccupants > 0) {

           dwarfWaiting++;
            while (elfOccupants > 0) {
                wait();
                
            }
            if (empty == true || dwarfOccupants > 0) {
                dwarfWaiting--;
                dwarfOccupants++;

                empty = false;

               
            }
            

        }
         System.out.println(this.Display());
    }

    public synchronized void elfExits() {

        elfOccupants--;
        if (elfOccupants == 0) {
            empty = true;
            //isElf = false;

            //
            

        }
        System.out.println(this.Display());
        notifyAll();

    }

    public synchronized void dwarfExits() {

        dwarfOccupants--;
        if (dwarfOccupants == 0) {
            empty = true;
            //isDwarf = false;

            //isDwarf = false;
            
        }
        System.out.println(this.Display());
        notifyAll();
    }
}
