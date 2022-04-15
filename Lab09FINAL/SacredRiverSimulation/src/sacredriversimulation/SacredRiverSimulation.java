/**
 * Lab 09 for CS 1181
 * This program demonstrates the use of the NetBeans IDE.
 * This program/class will be used to control and test the simulation. It creates a TheSacredRiver object, along with elf and dwarf thread objects.
 */
package sacredriversimulation;

/**
 * @author Sierra Sprungl CS1181L-06 Instructor: R. Volkers TA: William Hess and
 * Chris Stoples
 */
public class SacredRiverSimulation {

    /**
     * The main method for this class, it is in charge of testing and running
     * the simulation. Precondition: A String args was made by the IDE
     * Postcondition: A String args was passed in
     *
     * @param args - the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Creating objects of type boolean that will be used to determine the current state of the river. We also create Elf and Dwarf thread objects that will be used as place holders for the 
        // ElfThread and Dwarf thread objects in the river. Lastly we create int objects that will be used for keeping track of what thread is in the river and which is waiting
        // to access the river. All of these objects will be passed into the, TheScaredRiver object. 
        boolean empty = true;
        int elfOccupants = 0;
        int dwarfOccupants = 0;
        int elfWaiting=0;
        int dwarfWaiting =0;
//        boolean isElf = false;
//        boolean isDwarf = false;
//        

        // Creating the, TheSacredRiver object. This object will control how the simulation runs and how the threads will execute. 
        TheSacredRiver sr = new TheSacredRiver(empty, elfOccupants, dwarfOccupants, elfWaiting, dwarfWaiting);

        // Creating the ElfThread objects that will be used to control the elfs. There are a total of five
        ElfThread et1 = new ElfThread(sr);
        ElfThread et2 = new ElfThread(sr);
        ElfThread et3 = new ElfThread(sr);
        ElfThread et4 = new ElfThread(sr);
        ElfThread et5 = new ElfThread(sr);

        //Creating the DwarfThread objects that will be used to control the dwarfs. There are a total of five.
        DwarfThread dt1 = new DwarfThread(sr);
        DwarfThread dt2 = new DwarfThread(sr);
        DwarfThread dt3 = new DwarfThread(sr);
        DwarfThread dt4 = new DwarfThread(sr);
        DwarfThread dt5 = new DwarfThread(sr);

        // Here we are starting all the ElfThreads, the starting of the threads invokes their run method allowing the threads to do their job. 
        et1.start();
//        
       et2.start();
//        
       et3.start();
//       
        et4.start();
        
        et5.start();
        
//        et1.join();
//        et2.join();
//        et3.join();
//        et4.join();
//        et5.join();
        // Here we are starting all the DwarfThreads, the starting of the threads invokes their run method allowing the threads to do their job.
        dt1.start();
        
        dt2.start();
//        
        dt3.start();
        
        dt4.start();
        
        dt5.start();
//        
//        dt1.join();
//        dt2.join();
//        dt3.join();
//        dt4.join();
//        dt5.join();

    }

}
