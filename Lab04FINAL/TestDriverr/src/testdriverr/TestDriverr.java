/**
 * Lab 04 for CS 1181
 * This program demonstrates the use of the NetBeans IDE
 * This program will create create a linked list data structure and implement methods that will be used for the removal, insertion,
 * and basic functions of the list getters and setters will also be used to obtain data for testing.
 * This class is the main class and will be used for testing.
 */
package testdriverr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Sierra Sprungl CS1181L-C01 Instructor: R. Volkers TA's: William Hess
 * and Chris Stropes
 */
public class TestDriverr {

    /**
     * Tests the methods, constructors, getters, exceptions, and output
     * statements of the OrderedEventList and LocalDateTime Classes. Uses hard
     * coded values throughout, there is no user input. Precondition: The main
     * function expects an array of Strings. Postcondition: The program would
     * have entered an array of Strings.
     *
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Set up for testing starts
        // Creates the String varible types
        String type = "Year, Mouth, Day, Hour, Minute";

        // Creates the String varible events 
        String event1 = " Was the first thing added to the list";
        String event = " Was added to the list";
        String event2 = " Was the first things added to the list";
        // Creates the LocalDateTime varible, which holds the time in the form of year, mouth, day, hour, and mintue. 
        // This is the data that will go into the list
        LocalDateTime etime = LocalDateTime.of(1910, 6, 21, 10, 30);
        // Creates an OrderedEventList object, this is the list that will be made and used for inputing data, removing data, and other 
        // list like functions. It is also the lsit object that will be used for testing.
        OrderedEventList l1 = new OrderedEventList();
        // Set up for testing ends. The testing of the methods when the list is empty starts

        //Testing to see if the empty method returns true when the list is empty
        System.out.println("Is the list empty? " + l1.empty() + ": " + " This returned true becuase the list is empty");

        //Testing to see if the getFrist method throws an excpetion when the list is empty 
        try {
            l1.getFirst();
            System.out.println("Exception failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the getLast method throws an excpetion when the list is empty
        try {
            l1.getLast();
            System.out.println("Exception failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the remove method throws an excetpion when the list is empty
        try {
            l1.remove(etime);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the listCount method counts the number of node correctly in a empty list
        System.out.println("There are " + l1.listCount() + " nodes in the list");

        // Testing to see if the getEvent method throws an exception on an empty list. This is because there will be no event to find, 
        // becasue in this case an event will not exist.
        try {
            l1.getEvent(etime);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the toString method outputs the correct output when the list is empty
        l1.toString();

        // The testing of methods on an empty list ends. Testing of the methods on a list with nodes/data in it starts
        // Testing to see when a node is added to the front of the list, that it is added corectly and that the list is outputted correctly and
        // Testing to see if the listCount method outputs the number of nodes in the list. When there is only one node.
        l1.insert(type, event1, etime);
        System.out.println("There are " + l1.listCount() + " nodes in the list.");
        l1.toString();

        //Testing to see if the empty method returns false when there is a node in the list.
        System.out.println("Is the list empty? " + l1.empty() + ": " + " This returned false because the list is not empty.");

        // Testing to see if the getEvent method correctly locates the requested time and outputs the requested time along with the type and event information 
        // correctly when there is only one node in the list and when it's the first thing in the list.
        System.out.println("This is the time that was found: " + l1.getEvent(etime));

        // Testing to see when a node is added to the back of the list, it is added correctly and that the list is outputted correctly and
        // Testing to see if the listCount method outputs the correct number of nodes in the list. When there are only two nodes
        LocalDateTime etime2 = LocalDateTime.of(1998, 11, 23, 12, 40);
        l1.insert(type, event, etime2);
        System.out.println("There are " + l1.listCount() + " nodes in the list.");
        l1.toString();

        // Testing to see if the empty method returns false when there a mulitple nodes in the list
        System.out.println("Is the list empty? " + l1.empty() + ": " + " This returned false because the list is not empty.");

        // Testing to see if the getFirst method removes the first node from the list and outputs the correct node with the event and type 
        System.out.println("This was the frist node in the list: " + l1.getFirst());

        // Testing to see if the getLast method removes the last node from the list and ouputs the correct node with the event and type
        System.out.println("This was the last node in the list: " + l1.getLast());
        // Testing to see if the getEvent method gets the requested time when it is at the end of the list
        System.out.println("This is the time that was found from getEvent, it was at the end of the list " + l1.getEvent(etime2));
        // Testing to see if the gerEvent method gets the requested time when at the start of the list
        System.out.println("This is the time that was found getEvent, it was at the start of the list: " + l1.getEvent(etime));

        // Testing to see if the remove method removes the last time in the list
        l1.remove(etime2);
        System.out.println("The last time was removed from the list. And now this is the new list:");
        l1.toString();
        // Testing to see if the remove method removes the first time in the list
        LocalDateTime etime4 = LocalDateTime.of(1998, 11, 23, 12, 40);
        l1.insert(type, event, etime4);
        l1.remove(etime);
        System.out.println("The first time was removed from the list. And now this is the new list: ");
        l1.toString();

        // Testing to see when an item is added to the middle of the list that it is added correctly and the list is outputted correctly and
        // Testing to see if the listCount method outputs thre correct number of nodes in the list. When there are only three nodes
        LocalDateTime etime5 = LocalDateTime.of(1910, 6, 21, 10, 12);
        LocalDateTime etime3 = LocalDateTime.of(1999, 2, 07, 5, 45);
        l1.insert(type, event, etime3);
        l1.insert(type, event, etime5);
        System.out.println("There are " + l1.listCount() + " nodes in the list.");
        l1.toString();

        // Testing to see if the empty method returns false when there a mulitple nodes in the list
        System.out.println("Is the list empty? " + l1.empty() + ": " + " This returned false because the list is not empty.");

        // Testing to see if the getFirst method removes the first node from the list and outputs the correct node with the event and type 
        System.out.println("This was the first node in the list" + l1.getFirst());

        // Testing to see if the getLast method removes the last node from the list and ouputs the correct node with the event and type
        System.out.println("This was the last node in the list: " + l1.getLast());

        // Testing to see if the getEvent method gets the requested time when its in the middle of the list
        System.out.println("This is the time that was found getEvent, it was in the middle of the list: " + l1.getEvent(etime5));

        // Testing that an exception is thrown when the requested time can't be found in the getEvent method
        try {
            l1.getEvent(etime);
            System.out.println("Exception failed");
        } catch (Exception e) {
            System.out.println("This is the time that was found by getEvent: " + e.getMessage());

        }
        // Testing to see if the remove method removes the middle time in the list
        l1.remove(etime5);
        System.out.println("The middle time was removed from the list. And now this is the new list: ");
        l1.toString();
        
        
        // Testing to see if the remove method throws an exception when the time to be deleted is not found
        try{
            l1.remove(etime5);
            System.out.println("Exception Failed");
        }catch( Exception e){
            System.out.println( "This is the time that was removed: "+e.getMessage());
    }
}
}
