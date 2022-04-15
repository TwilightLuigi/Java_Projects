/*
* Lab 05 for CS 1181
* This program demostrates the use of the NetBeans IDE.
* This class will create a linkedlist that contians several students and their two areas of information. 
* It will also sort the list according to the course's name  and print out the list in a nicely formated string.
* Lastly it implemets the comparable interface with allows the class to use sorting tools. 
*/
package testprogram;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Sierra Sprungl
 */
public class StudentInfo implements Comparable<StudentInfo> {

    private String studentID;
    private String studentName;

    LinkedList<CourseInfo> course = new LinkedList<>();

    /**
    * Creates a student object that takes in two parameter values and validates
    * them, this data will be used to create a LinkedList that contains the
    * student object. 
    * Precondition: The parameter values are Strings
    * Postcondition: The parameter values were valid and a String was entered
    * for each.
    * @param studentID - The number used to ID a student, must be a String
    * value.
    * @param studentName - The name of the student, must be a String value.
    */
    public StudentInfo(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
this.course= new LinkedList<CourseInfo>();
    }

    /**
    * Overrides the toString method, prints out the LinkedList in a nicely
    * formated string, printing out all the constructor parameter values and
    * prints labels that identify what they are. 
    * Precondition: The values bring printed out must have been valid in the courses constructor.
    * Postcondition: The values are of type String
    * @return - The String values with labels nicely formated.
    */
    @Override
    public String toString() {
        return "Name: " + studentName + " SID: " + studentID;
    }

    /**
    * Compares the the students based on there name and puts them in
    * alphabetical order. It overrides the compareTo method in the comparable
    * interface. 
    * Precondition: StudentInfo object was made and the value is valid 
    * Postcondition: Student object was passed in correctly
    * @param o - used to represent the StudentInfo object and will be used to
    * compare the studentNames of the StudentInfo objects
    * @return - the two studentNames that are being compared in the list in
    * sorted order.
    */
    @Override
    public int compareTo(StudentInfo o) {
        return this.studentName.compareTo(o.studentName);
    }

    /**
     *
     * Adds CourseInfo objects into the course LinkedList in this class only, is
     * used to help in adding CourseInfo objects in the EnrollmentManager
     * classes courses LinkedList. It also sorts the the courses LinkedList.
     * Precondition: A valid courses LinkedList was created. Postcondition: A
     * valid CoursetInfo object was made and passed in
     *
     * @param courseS - The CoursetInfo object that contains the information
     * about a course being added to the list.
     */

    public void addCourse(CourseInfo courseS) {
        this.course.add(courseS);
        Collections.sort(this.course);
    }

    /**
    * A getter for getting the course linked list contained within this class,
    * so that it can be accessed in other classes. It also sorts the CourseInfo
    * Objects in the list by there courseID for the highest ID to the Lowest ID
    * Precondition: A valid courses LinkedList was created
    * Postcondition: There are values in the courses LinkedList
    * @return - The courses LinkedList that is of type CourseInfo and holds
    * Strings
    */
    public LinkedList getCourseList() {
        return this.course;
    }

    /**
     * Determines if two student id's are equal/the same or not. This is used to
     * determine if a student is already in a list or not in other methods and
     * allows for the comparesion of two studentID's. It overrides the orginal
     * equals method. 
     * Precondition: the studentID object was created
     * Postcondition: the studentID object was passed in and was valid
     * @param obj - the ID number given to a StudentInfo object and is the
     * thing being compared.
     * @return - true if the studentID's are the same. False if the studentID's
     * are different.
     */
    @Override
    public boolean equals(Object obj) {
       String s = (String) studentID;
       if (this.studentID.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
    public String getCourses() {
        String info = new String();
     
       
            for (int i = 0; i < this.getCourseList().size(); i++) {
                
                info += this.getCourseList().get(i).toString()+"\n";
                
            }
        
            
            return info;
        
    }
    
     

}
