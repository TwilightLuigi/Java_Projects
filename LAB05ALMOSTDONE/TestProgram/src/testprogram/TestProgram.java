/*
* Lab 05 for CS 1181
* This program demonstrates the use of the NetBeans IDE.
* This program will create many different LinkedLists and allow for the manipulation of them. This manipulation will occur by adding courses, getting the information about 
* all the courses, added a student, getting all the informaion about all the students, enrolling and unenrolling a student. Get all the courses a student is enrolled in and 
* get all the students that are enrolled in a course.
 */
package testprogram;

import java.util.LinkedList;

/**
 * @author Sierra Sprungl CS1181L-06 Instructor: R. Volkers TA'S: William Hess
 * and Chris Stropes
 */
public class TestProgram {

    /**
     * The main method, will be used for creating the Linked Lists and testing
     * them Precondition: accepts an array of Strings Postcondition: an array of
     * Strings was entered.
     *
     * @param args - the command line arguments
     */
    public static void main(String[] args) {
        // Creating 10 different students that will be added to a LinkedList called Student. 
        // The names and the student IDs for the 10 students are being made, as String values.
        String sn1 = "Estes, Thomas W.";
        String sid1 = "w547gds";
        String sn2 = "Mullen, Destiny B.";
        String sid2 = "w389rty";
        String sn3 = "Winas, Kelsie E.";
        String sid3 = "w122tsa";
        String sn4 = "Romig, Jacob T.";
        String sid4 = "w391qto";
        String sn5 = "Kumcha, Kathy L.";
        String sid5 = "w008swh";
        String sn6 = "Sprungl, Sierra E.";
        String sid6 = "w345sts";
        String sn7 = "Duggar, Eiljah T.";
        String sid7 = "w978zxz";
        String sn8 = "Smith, John A.";
        String sid8 = "w122tyt";
        String sn9 = "Johnson, Sue R.";
        String sid9 = "w556wrw";
        String sn10 = "Nebula, Timmy P.";
        String sid10 = "w102gwo";

        // Makes the student objects, which contian the student's name and ID number.
        StudentInfo estes = new StudentInfo(sid1, sn1);
        StudentInfo mullen = new StudentInfo(sid2, sn2);
        StudentInfo winas = new StudentInfo(sid3, sn3);
        StudentInfo romig = new StudentInfo(sid4, sn4);
        StudentInfo kumcha = new StudentInfo(sid5, sn5);
        StudentInfo sprungl = new StudentInfo(sid6, sn6);
        StudentInfo duggar = new StudentInfo(sid7, sn7);
        StudentInfo smith = new StudentInfo(sid8, sn8);
        StudentInfo johnson = new StudentInfo(sid9, sn9);
        StudentInfo nebula = new StudentInfo(sid10, sn10);
       
        // Creating na enrollment manager object. so we can call methods from the EnrollmentManager Class.  
        EnrollmentManager m = new EnrollmentManager();

        // Testing to see if the addStudent method adds students to the students LinkedList in sorted order.
//        m.addStudent(sn2, sid2,estes);
//        m.addStudent(sn1, sid1, mullen);
//        m.addStudent(sn3, sid3, winas);
//        m.addStudent(sn4, sid4, romig);
//        m.addStudent(sn5, sid5, kumcha);
//        m.addStudent(sn6, sid6, sprungl);
//        m.addStudent(sn7, sid7, duggar);
//        m.addStudent(sn8, sid8, smith);
//        m.addStudent(sn9, sid9, johnson);
//        m.addStudent(sn10, sid10, nebula);

        // Testing ot see if the getAllStudents method prints out a list of all students, in a nicly fiormated string, this also tests to see if the toString method in the StudentInfo class works.
//         LinkedList <StudentInfo> sl = m.getAllStudents();
//        for(int i = 0; i < sl.size(); i++){
//           StudentInfo hold = sl.get(i);
//           
//            System.out.println(hold.toString()); 
//        }
        

        // Testing to see if the addStudent methiod prints out an error when a duplicate student gets added to the list 

//       m.addStudent(sn10, sid10, nebula);

   
   

        // Creating 10 different courses that will be added to a LinkedList called courses
        // The names, course IDs, instructors, days the course meets, times that the courses meet, and the room numbers for the courses are being made, as String values. 
        String cid1 = "CS1180";
        String cn1 = "Computer Science 1";
        String ci1 = "Cheatham";
        String cd1 = "MWF";
        String ct1 = "2:30 - 3:25";
        String cr1 = "RC270";
        String cid2 = "CS2000";
        String cn2 = "Discrete Mathematics";
        String ci2 = "Doran";
        String cd2 = "TR";
        String ct2 = "12:30 - 1:50";
        String cr2 = "RC123";
        String cid3 = "CS1000";
        String cn3 = "Tech and Society";
        String ci3 = "Foster";
        String cd3 = "MF";
        String ct3 = "12:00 - 12:30";
        String cr3 = "SC220";
        String cid4 = "CEG2300";
        String cn4 = "Org Concepts and Usage";
        String ci4 = "Buck";
        String cd4 = "MWF";
        String ct4 = "10:10 - 11:05";
        String cr4 = "SC145";
        String cid5 = "MTH2400";
        String cn5 = "Calculus 1";
        String ci5 = "Lop";
        String cd5 = "TR";
        String ct5 = "2:00 - 2:55";
        String cr5 = "RK120";
        String cid6 = "HIS1500";
        String cn6 = "Western Civ";
        String ci6 = "Carfellio";
        String cd6 = "TR";
        String ct6 = "4:45-5:40";
        String cr6 = "OH224";
        String cid7 = "AR1000";
        String cn7 = "Intro to Art Forms";
        String ci7 = "Circle";
        String cd7 = "TF";
        String ct7 = "12:30 - 1:25";
        String cr7 = "SU345";
        String cid8 = "ENG5000";
        String cn8 = "English Comp.";
        String ci8 = "Willson";
        String cd8 = "TR";
        String ct8 = "4:00-4:55";
        String cr8 = "AH160";
        String cid9 = "MTH1200";
        String cn9 = "Linear Algebra";
        String ci9 = "Corn";
        String cd9 = "MWF";
        String ct9 = "1:15 - 2:10";
        String cr9 = "MM3400";
        String cid10 = "ART6700";
        String cn10 = "3D Art";
        String ci10 = "Phillp";
        String cd10 = "TW";
        String ct10 = "3:23-4:18";
        String cr10 = "OH134";
   
        // Makes the courses objects, which contain the course's ID number, name, instructor who teaches the class, the day and time the course meets, and the room 
        // where the class is held.
        CourseInfo cs1180 = new CourseInfo(cid1,cn1,ci1,cd1,ct1,cr1);
        CourseInfo cs2000 = new CourseInfo(cid2,cn2,ci2,cd2,ct2,cr2);
        CourseInfo cs1000 = new CourseInfo(cid3,cn3,ci3,cd3,ct3,cr3); 
        CourseInfo ceg2300 = new CourseInfo(cid4,cn4,ci4,cd4,ct4,cr4);
        CourseInfo mth2400 = new CourseInfo(cid5,cn5,ci5,cd5,ct5,cr5);
        CourseInfo his1500 = new CourseInfo(cid6,cn6,ci6,cd6,ct6,cr6);
        CourseInfo ar1000 = new CourseInfo(cid7,cn7,ci7,cd7,ct7,cr7);
        CourseInfo eng5000 = new CourseInfo(cid8,cn8,ci8,cd8,ct8,cr8);
        CourseInfo mth1200 = new CourseInfo(cid9,cn9,ci9,cd9,ct9,cr9);
        CourseInfo art6700 = new CourseInfo(cid10,cn10,ci10,cd10,ct10,cr10);
        
        // Testing to see if the addCourses method adds courses to the courses LinkedList in sorted order.
        m.addCourse(cid1,cn1,ci1,cd1,ct1,cr1,cs1180);
        m.addCourse(cid2,cn2,ci2,cd2,ct2,cr2,cs2000);
        m.addCourse(cid3,cn3,ci3,cd3,ct3,cr3,cs1000);
        m.addCourse(cid4,cn4,ci4,cd4,ct4,cr4,ceg2300);
        m.addCourse(cid5,cn5,ci5,cd5,ct5,cr5,mth2400);
        m.addCourse(cid6,cn6,ci6,cd6,ct6,cr6,his1500);
        m.addCourse(cid7,cn7,ci7,cd7,ct7,cr7,ar1000 );
        m.addCourse(cid8,cn8,ci8,cd8,ct8,cr8,eng5000);
        m.addCourse(cid9,cn9,ci9,cd9,ct9,cr9,mth1200 );
        m.addCourse(cid10,cn10,ci10,cd10,ct10,cr10,art6700);
        
        //
        m.addStudent(sn2, sid2,estes);
        m.addStudent(sn1, sid1, mullen);
        m.addStudent(sn3, sid3, winas);
        m.addStudent(sn4, sid4, romig);
        m.addStudent(sn5, sid5, kumcha);
        m.addStudent(sn6, sid6, sprungl);
        m.addStudent(sn7, sid7, duggar);
        m.addStudent(sn8, sid8, smith);
        m.addStudent(sn9, sid9, johnson);
        m.addStudent(sn10, sid10, nebula);
        
        //
        System.out.println("This is the list of students:");
        LinkedList <StudentInfo> sl = m.getAllStudents();
        for(int i = 0; i < sl.size(); i++){
           StudentInfo hold = sl.get(i);
           
            System.out.println(hold.toString()); 
        }
        
        
         // Testing ot see if the getAllCoruses method prints out a list of all courses, in a nicly fiormated string, this also tests to see if the toString method in the CourseInfo class works.
         System.out.println("This is the list of courses:");
         LinkedList <CourseInfo> cl = m.getAllCourses();
        for(int i = 0; i < cl.size(); i++){
           CourseInfo hold = cl.get(i);
           
            System.out.println(hold.toString()); 
        }
        
        // Tests to see if the addCourses method prints out an error message when a duplicate class is being added to the LinkedList
        
        
       // Testing to see if the enrollStudent method enrolls 2 different students into four different courses each. 
       // Here we are enrolling student object estes into 4 different courses objects.
        System.out.println("These are the courses that Estes is enrolled in:");
       m.enrollStudent(estes,his1500);
        m.enrollStudent(estes,mth1200);
        m.enrollStudent(estes,eng5000);
        m.enrollStudent(estes,mth2400);
String test2 = estes.getCourses();
        System.out.println(test2);
        // Here we enrolling student object kumcha into 4 different courses objects.
        System.out.println("These are the courses that Kumcha is enrolled in:");
       m.enrollStudent(kumcha,ar1000);
        m.enrollStudent(kumcha,art6700);
        m.enrollStudent(kumcha,cs2000);
        m.enrollStudent(kumcha,cs1000);
String test = kumcha.getCourses();
       System.out.println(test);
        System.out.println("These are the ocurse that mullen is enrolled in ");
       m.enrollStudent(mullen, ceg2300);
       m.enrollStudent(mullen, cs1180);
       m.enrollStudent(mullen, cs1000);
       String test3 = mullen.getCourses();
        System.out.println(test3);
        // Testing to see if the getCourses method returns the courses that the estes student object is enrolled in
       //System.out.println(m.getCourses(estes));
        //System.out.println(m.getCourses(kumcha));
          // Testing to see if the enrollStudent method prints out an error when trying to enroll a student that is not in the student LinkedList/ does not exist.
         String sn11 = "Adam, Steve Y.";
         String snid11 = "w123ase";
         StudentInfo adam = new StudentInfo(snid11,sn11);
//         m.enrollStudent(adam,cs1000);
         
         

    }

}
