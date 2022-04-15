/*
 * Lab 05 for CS 1181
 * This program demostrates the use of the NetBeans IDE.
 * This class will create courses and student linkedlists. It will allow for the adding of courses to the courses linkedlist, 
 * get the string that contians the data on all the courses, add students to the student linkedlist, get the string that contians the data on
 * all the students, the enrollment of students, the unenrollment of students, get the list of students in a course, and lastly get the classes a student 
 * is enrolled in.
 */
package testprogram;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author Sierra Sprungl
 */
public class EnrollmentManager {

    LinkedList<CourseInfo> courses = new LinkedList<>();
    LinkedList<StudentInfo> student = new LinkedList<>();

    /**
     * Checks to see if the course is already in the list, based on if the list has a courseID that is the same has the one trying to be entered in
     * the list, if the courseID's are the same the course does not get added to the list and an error message is displayed. If the courseID's are not the
     * same the course gets added to the list.
     * Precondition: All the values being passed in a are valid and of the correct data type.
     * Postcondition: All values were passed in and valid
     * @param courseID - the number used to ID the course, will determine if the course is already in the list or not and is of type String.
     * @param courseName - the name of the course being added to the list
     * @param instructor - the name of the person teaching the class of the course being added to the list.
     * @param daysTheCourseMeets - the days the course being added to the list meets
     * @param timeTheCourseMeets - the time the course being added to the list meets
     * @param roomNumber - the location of the course being added to the list
     * @param courseS - the CourseInfo object being added to the list
     * @param studenT - the StudentInfo object being used to access the addCourse method in the StudentInfo class.
     */
    public void addCourse(String courseID, String courseName, String instructor, String daysTheCourseMeets, String timeTheCourseMeets, String roomNumber, CourseInfo courseS) {

        if (courseID.equals(courseID) == false) {
            System.out.println("This course is already in the list, can't have the same course more than once.");

        } else {
           // studenT.addCourse(courseS);
            courses.add(courseS);
            
            Collections.sort(courses);
        }
    }

    public LinkedList getAllCourses() {

        return courses;
    }

    public void addStudent(String studentID, String studentName, StudentInfo studenT) {

        if (studentID.equals(studentID) == false) {
            System.out.println("Student is already in list, can't add same student more than once.");

        } else {
           // courseS.addStudent(studenT);
            student.add(studenT);
            
            Collections.sort(student);

        }

    }

    public LinkedList getAllStudents() {

        return student;
    }

    public void enrollStudent(StudentInfo studenT, CourseInfo courseS) {
//        if (!student.contains(studenT)) {
//            System.out.println("This student does not exist.");
//        } else if (!courses.contains(courseS)) {
//            System.out.println("This course does not exist.");
//        } else if (courses.contains(studenT)) {
//            System.out.println("This student is already in the course.");
//        } else {
                int indexOf2 = student.indexOf(studenT);    
                int indexOf = courses.indexOf(courseS);
                courses.get(indexOf).addStudent(student.get(indexOf2));
                
                student.get(indexOf2).addCourse(courses.get(indexOf));
                studenT.addCourse(courseS);
                courseS.addStudent(studenT);
        //}
    }

    public void dropStudent(StudentInfo studenT, CourseInfo courseS) {
        if (!student.contains(studenT)) {
            System.out.println("This student does not exist.");
        }
        if (!courses.contains(courseS)) {
            System.out.println("This course does not exist");
        }
        if (!courses.contains(studenT)) {
            System.out.println("This student is not enrolled in this class");
        } else {
            courseS.getStudentList().remove(studenT);
            studenT.getCourseList().remove(courseS);
        }
    }

    public String getStudents(CourseInfo courseS) {
        String info = "";
        if (!courses.contains(courseS)) {
            System.out.println("This course doesn't exist.");
        } else {
            int indexOf = student.indexOf(courseS);
            CourseInfo temp = courses.get(indexOf);
           courseS.getStudentList();
            for (int i = 0; i < courses.size(); i++) {
                
                temp.getStudentList().indexOf(courseS);
                info = temp.toString();
            }
        }

        return info;
    }

    public String getCourses(StudentInfo studenT) {
        String info = new String();
     
        if (!student.contains(studenT)) {
            System.out.println("This student doesn't exist.");
        } else {
            int indexOf = student.indexOf(studenT);
            StudentInfo temp = student.get(indexOf);
            //String info = "";
            
            for (int i = 0; i < temp.getCourseList().size(); i++) {
                
                info += temp.getCourseList().get(i).toString()+"\n";
                
            }
        }
            
            return info;
        
    }
}

