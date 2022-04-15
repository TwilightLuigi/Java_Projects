/*
* Lab 04 for CS 1181
* This program demonstrates the use of the NetBeans IDE.
* The program will create a linked list data structure, nodes through the use of a constructor, create methods
* that will deteremine of the list is empty, get the first and last values of the list, instert and remove nodes, throw expections and 
* output data. 
 */
package testdriverr;

import java.time.LocalDateTime;

/**
 * @author Sierra Sprungl
 */
public class OrderedEventList {

    private class Node {

        public String event;
        public String type;
        public LocalDateTime etime;
        public Node next;

        /**
         * Constructor that creates a Node object, takes in values of Strings
         * and LocalDateTime and makes sure the values are of those types
         * Precondition: The values must be of type String or LocalDateTime
         * Postcondition: The values are of type String or LocalDateTime
         *
         * @param type - the value for this must be of type String, will be used
         * to state what type of data will be entered into the list.
         * @param event - the value for this must be of type String, will be
         * used to perform events on the type and the node
         * @param time - the value for this must be of type LocalDateTime, will
         * be used to.
         */
        public Node(String type, String event, LocalDateTime time) {
            this.type = type;
            this.event = event;
            etime = time;
        }

    }

    private Node first = null;

    /**
     * Checks to see if the linked list is empty or not. Precondition: the node
     * constructor was passed valid values Postcondition: List is empty or the
     * values were valid
     *
     * @return - true if the list is empty and false if not empty.
     */
    public boolean empty() {
        Node tmp = first;
        if (tmp == null) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Removes the first node in the list and returns it to the user
     * Precondition: a list object was made Postcondition: the values entered
     * into the list were valid
     *
     * @return - the first node in the list
     * @throws Exception - when the list is empty
     */
    public String getFirst() throws Exception {
        Node tmp = first;
        if (tmp == null) {
            throw new Exception("The list is empty, cannot get a first value from an empty list");
        } else {
            tmp = first;
           
        }
        return tmp.type + ": " + tmp.event;
    }

    /**
     * Removes the last node in the list and returns it to the user
     * Precondition: a list object was made Postcondition: the values entered
     * into the list were valid
     *
     * @return - the last node in the list
     * @throws Exception - when the list is empty
     */
    public String getLast() throws Exception {
        Node tmp = first;
        if (tmp == null) {
            throw new Exception("The list is empty, cannot get a last value from an empty list");
        } else {

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
        }
        return tmp.type + ": " + tmp.event;
    }

    /**
     * Creates a new node object and determines where to insert it into the list
     * depending on several factors. If first node in the list is empty, then
     * the node will be inserted into the first position in the linked list. If
     * the first node already has a node in the list then the new node will be
     * inserted in the middle of the list. Also checks to see if the node being
     * added is being added to the end of the list and if so, inserts it to the
     * back of the list. Precondition: valid values for the type, event, and
     * time arguments were entered into the method Postcondition: valid values
     * for the type, event, and time where entered
     *
     * @param type - string value being used to say what the type of the data is
     * that is being entered
     * @param event - string value being used to say what event has occurced
     * within the list
     * @param time - LocalDateTime value being used as the data for the list
     */
    public void insert(String type, String event, LocalDateTime time) {

        Node n1 = new Node(type, event, time);
        
        Node tmp = first;
        if (tmp == null) {
            n1.next = null;
            first = n1;

        } else {
            
            n1.next = tmp.next;
            tmp.next = n1;
           //time.compareTo(time);
          

        }
    }
    /**
     * Removes the node specified by the user, while traversing the list and keeping track
     * of where the predecessor is for each node. If the user tries to remove a node from an empty list a message is displayed telling 
     * them the list is empty. If the node trying to be removed is not found an exception is thrown
     * Precondition: The time value in the node constructor is valid
     * Postcondition: The time value is of type LocalDateTime
     * @param time - the data in the list that is being removed
     * @throws Exception - when the time/node can't be found.
     */
    public void remove(LocalDateTime time) throws Exception {
        
        if(first==null){
            throw new Exception("Can't remove a time from an empty list.");
        }
      else if(time.equals(first.etime)){
           first = first.next;
       }else{
          Node tmp = first; 
          while(tmp.next !=null && !time.equals(tmp.next.etime)){
              tmp = tmp.next;
          }
          if(tmp.next == null){
              throw new Exception("Time not found");
              
          }else{
              tmp.next = tmp.next.next;
          }
          
      }
    }

    /**
     * Traverses the list while counting the nodes in the list has it goes. It
     * only counts the nodes when the first one is not null. Precondition: the
     * list was not empty Postcondition: The values in the node constructor were
     * valid
     *
     * @return - the number of nodes in the list
     */
    public int listCount() {

        int count = 0;
        Node tmp = first;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
            
        }
        return count;
    }

    /**
     * Traverses the list to find the requested time, requested by the user and
     * outputs the type and event information for that time and node.
     * Precondition: the value is of LocalDateTime Postcondition: the value for
     * the LocalDayTime was valid
     *
     * @param time - the value the user is trying to find, it must be of type
     * LocalDateTime and be valid.
     * @return - the type and event information for the requested time and node
     * @throws Exception - when the requested time can't be found.
     */
    public String getEvent(LocalDateTime time) throws Exception {
        Node tmp = first;
        while (tmp != null && time != tmp.etime) {
            tmp = tmp.next;
        }
        if (time == null || tmp==null) {
            throw new Exception("The time requesed can't be found");
        }

        if (time == tmp.etime) {

        }
        return tmp.etime +" "+tmp.type + " : " + tmp.event;

    }

    /**
     * Overrides the base classes toString method, checks to see if the list is
     * empty and if it is outputs that the list is empty. If the list is not
     * empty it outputs every value in the linked list, one per line.
     * Precondition: All the values in the other methods are correct and don't
     * throw an exception Postcondition: All values were valid or the list was
     * empty.
     *
     * @return - if the list is empty an output statement that says the list is
     * empty. if the list is not empty it prints out each node on a separate
     * line with the time data followed by a tab, then the type:event.
     */
    @Override
    public String toString() {

        Node tmp = this.first;
        if (tmp == null) {
            System.out.println("This is an empty list.");
        } else {
            while (tmp != null) {
                System.out.println(tmp.etime + "\t" + tmp.type + ": " + tmp.event);
                tmp = tmp.next;
            }
        }
        System.out.println("\n");
        return "";
    }
}
