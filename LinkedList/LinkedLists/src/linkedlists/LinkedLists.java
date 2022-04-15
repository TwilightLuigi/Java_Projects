/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author student
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    // define the start of the linked list
         static Node first = null;
         public static void addToFrount(String value){
              Node n = new Node(value);
              // make this node point to the existing list 
              n.next = first;
              // make this node the first node 
              first = n;
              
         }
         public static String deleteFromFront(){
             // empty list error case
             if (first ==null){
                 return null;
             }
             else{
                 String s = first.data;
                 // make list point at the second thing on the list
                 first = first.next;
                 return s;
             }
         }
         public static void display(){
             // get a temp pointer to start of the list 
             Node tmp = first;
             // loop stops when we reach the end marked by null 
             while (tmp !=null){
                 System.out.println(tmp.data);
                 // move the tmp pointer to the next node.
                 tmp = tmp.next;
             }
         }
         // Insert a value at a specific postion 
         // the frist value in the list is postion 1
         public static void insert(int pos, String value){
             if(pos<1){
                 System.out.println("Inviald Postion <1");
                 return;
             }
             if(pos==1){
                  addToFrount(value);
                  return;
             }
             Node tmp = first;
             while(--pos >1 && tmp!=null){
                 tmp = tmp.next;
             }
             if (tmp !=null){
             Node n = new Node(value);
             // make new node point to the node following the insertion point
             n.next=tmp.next;
             // make the tmp node point to this new node 
             tmp.next = n;
         }else{
                 System.out.println("Invaild position > end of list");
                 return;
             }
         }
    public static void main(String[] args) {
       // add three names to our list 
       addToFrount("Bob");
       addToFrount("Joe");
       addToFrount("Ellen");
        display();
        insert(0, "Bob2");
        insert(5, "Bob2");
        insert(4, "Bob2");
        display();
        insert(1, "Jamie");
        display();
        deleteFromFront();
        display();
        
    }
    
}
class Node{
    String data;
    Node next;
    public Node(String value){
        data = value;
        next = null;
    }
}