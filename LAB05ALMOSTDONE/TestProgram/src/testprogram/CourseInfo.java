/*
* Lab 05 for CS 1181
* This program demonstrates the use of the NetBeans IDE.
* This class will create a linkedlist that contians several courses and their six areas of information. 
* It will also sort the list according to the course's ID number and print out the list in a nicely formated string.
* Lastly it implemets the comparable interface with allows the class to use sorting tools. 
*/
package testprogram;

import java.util.Collections;
import java.util.LinkedList;

/**
* @author Sierra Sprungl
*/
public class CourseInfo implements Comparable<CourseInfo> {

    private String courseID;
    private String courseName;
    private String instructor;
    private String daysTheCourseMeets;
    private String timeTheCourseMeets;
    private String roomNumber;

    LinkedList<StudentInfo> students = new LinkedList<>();

    /**
    * Creates a courses object that takes in six parameter values and validates
    * them, this data will be used to create a LinkedList that contains the
    * courses object.
    * Precondition: The parameter values are Strings
    * Postcondition: The parameter values were valid and a String was entered
    * for each.
    * @param courseID - The number used to ID the course. Must be a String
    * value.
    * @param courseName - The name of the course. Must be a String value.
    * @param instructor - The name of the person teaching the course. Must be a
    * String value.
    * @param daysTheCourseMeets - The days the course meets, listed like MTWRF.
    * Must be a String value.
    * @param timeTheCourseMeets - The time the course meets. Must be a String
    * value.
    * @param roomNumber - The room where the course meets. Must be a String
    * value.
    */
    public CourseInfo(String courseID, String courseName, String instructor, String daysTheCourseMeets, String timeTheCourseMeets, String roomNumber) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
        this.daysTheCourseMeets = daysTheCourseMeets;
        this.timeTheCourseMeets = timeTheCourseMeets;
        this.roomNumber = roomNumber;
        this.students = new LinkedList<StudentInfo>();
    }

    /**
    * Overrides the toString method, prints out the LinkedList in a nicely
    * formated string, printing out all the constructor parameter values and
    * prints labels that identify what they are. 
    * Precondition: The values being printed out must have been valid in the courses constructor.
    * Postcondition: The values are of type String
    * @return - The String values with labels nicely formated.
    */
    @Override
    public String toString() {

        return "CID: " + courseID + " Name: " + courseName + " Prof: " + instructor + " Days: " + daysTheCourseMeets + " Time: " + timeTheCourseMeets + " Room: " + roomNumber;
    }

    /**
    * Compares the the courses based on the CourseID, puts them in order from
    * highest ID to lowest ID. It overrides the compareTo method in the
    * comparable interface. 
    * Precondition: CourseInfo object was made and the
    * value is valid 
    * Postcondition: CourseInfo object was passed in correctly
    * @param o - used to represent the CourseInfo object and will be used to
    * compare the course ID's of the CourseInfo objects
    * @return - the two courseIDs that are being compared in the list in sorted
    * order.
    */
    @Override
    public int compareTo(CourseInfo o) {
        return this.courseID.compareTo(o.courseID);

    }

    /**
    * A getter for getting the student linked list contained within this class,
    * so that it can be accessed in other classes. It also sorts the
    * StudentInfo Objects in the list by there name in alphabetical order.
    * Precondition: A valid students LinkedList was created 
    * Postcondition: There are values in the students LinkedList
    * @return - The student LinkedList that is of type StudentInfo and holds
    * Strings
    */
    public LinkedList getStudentList() {
        Collections.sort(this.students);
        return this.students;
    }

    /**
    * Adds StudentInfo objects into the students LinkedList in this class only,
    * is used to help in adding StudentInfo objects in the EnrollmentManager
    * classes students LinkedList. It also sorts the students LinkedList
    * Precondition: A valid students LinkedList was created. 
    * Postcondition: A valid StudentInfo object was made and
    * passed in
    * @param studenT - The StudentInfo object that contains the information
    * about a student being added to the list.
    */
    public void addStudent(StudentInfo studenT) {
        this.students.add(studenT);
        Collections.sort(this.students);
    }
}
