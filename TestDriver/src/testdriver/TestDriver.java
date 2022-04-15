/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Lab 1 for CS1181
 * This program demonstrates the use of the NetBeans IDE
 * The program will do numerical manipulation through the use of methods, uses getters and setters, uses intertance, and outputs data.
 */
package testdriver;

/**
 * @author Sierra Sprungl 
 * CS1181L-06 
 * Instructor: R. Volkers 
 * TA's: William Hess
 * and Chris Stroplos
 */
public class TestDriver {

    /**
     * Tests the methods, getters, setters, exceptions, and output statements of
     * the PowerDissipation Interface, Resistor Class, and VariableResistor
     * Class. Uses hard coded values throughout, there is no user input.
     * Precondition: The main function expects an array of Strings.
     * Postcondition: The program would have entered an array of Strings.
     *
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        // Tesing the Resistor class starts here.
        // Testing of the Resistor Class constructor starts here as well.
        // Testing to see if the expection is thrown when the resistencevalue is less than 0 when the resistancevalue is being passed to the Resistance Class 
        // constructor. 
        try {
            double powerrating = 1;
            double tolerancevalue = 0.5;
            double resistancevalue = -1;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        // Testing to see if the expection is thrown when the resistancevalue is 0 when being passed to the Resistance Class
        // constructor.
        try {
            double powerrating = 1;
            double tolerancevalue = 0.5;
            double resistancevalue = 0;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the expection is thrown when the tolerancevalue is less than 0 when being passed into the Resistance Class
        // constructor.
        try {
            double powerrating = 1;
            double resistancevalue = 1;
            double tolerancevalue = -1;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the expection is thrown when the tolerancevalue is more than 1 when being passed to the Resistance Class 
        // constructor 
        try {
            double powerrating = 1;
            double resistancevalue = 1;
            double tolerancevalue = 2;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the expection is thrown when the tolerancevalue is 0 when being passed to the Resistance Class constructor.
        try {
            double powerrating = 1;
            double resistancevalue = 1;
            double tolerancevalue = 0;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the expection is thrown when the tolerancevalue is 1 when being passed to the Resistance Class constructor.
        try {
            double powerrating = 1;
            double resistancevalue = 1;
            double tolerancevalue = 1;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Exception Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the expection is thrown when the powerrating is less than 0 when being passed to the Resistance Class constructor.
        try {
            double powerrating = -1;
            double resistancevalue = 1;
            double tolerancevalue = 0.5;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Excpetion Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Testing to see if the expection is thrown when the powerrating is 0 when being passed to the Resistance Class constructor.
        try {
            double powerrating = 0;
            double resistancevalue = 1;
            double tolerancevalue = 0.3;
            Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
            System.out.println("Excpetion Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Tests end for the Resistance Class constructor.
        // Test for the Resistance Class methods start. 
        // Testing the getResistanceValue method to ensure that when the method is called that the correct resistance value is returned and that the value gets 
        // returned.
        double powerrating = 2;
        double resistancevalue = 10000;
        double tolerancevalue = 0.5;
        Resistor rt = new Resistor(resistancevalue, tolerancevalue, powerrating);
        System.out.println("The resistance value is " + rt.getResistanceValue());
        
        // Testing the maxResistance method to ensure that when the method is called that it caluclates the max resistance correctly and returns the 
        // value of the max resistance.
         System.out.println("The max resistance is " + rt.maxResistance());
         
        // Testing the miniResistance method to ensure that when the method is called that is caluclates the mini resistance correctly and returns the
        // value of the mini resistance.
        System.out.println("The mini resisatnce is " + rt.miniResistance());
        
        // Testing the toString method to ensure that when the method is called that it returns the values of the resistancevalue, tolerancevalue,
        // and powerrating correctly and that it also returns the rest of the string that was typed.
        System.out.println(rt.toString());
        
        // Testing the getPowerRating method to ensure that when the methos is called that the correct powerrating value is returned and that the value gets 
        // returned. 
        System.out.println("The power rating is " + rt.getPowerRating());
        
        // Testing the methods of the Resistor Class ends.
        // Tesing for Resistor Class ends.

        // Testing for VariableResistor Class starts.
        // Testing for expcetions start.
        // Testing to see if the exception is thrown when the controlsetting is less than 0 when being passed into the VariableResistor Class constructor.
        try {
            double controlsetting = -1;
            VariableResistor vrt = new VariableResistor(resistancevalue, tolerancevalue, powerrating, controlsetting);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Testing to see if the exception is thrown when the controlsetting is more than 1 when being passed into the VariableResistor Class constructor.
        try {
            double controlsetting = 1.5;
            VariableResistor vrt = new VariableResistor(resistancevalue, tolerancevalue, powerrating, controlsetting);
            System.out.println("Excpetion Failed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing to see if the excpetion is thrown when the controlsetting is less than 0 when being passed into the setControlSetting method. 
        try {
            double controlsetting = -2;
            VariableResistor vrt = new VariableResistor(resistancevalue, tolerancevalue, powerrating, controlsetting);
            vrt.setControlSetting(controlsetting);
            System.out.println("Exception Failed");
        } catch (java.lang.Exception a) {
            System.out.println(a.getMessage());
        }
        // Testing to see if the excpetion is thrown when the controlsetting is more than 1 when being passed into the setControlSetting method.
        try{
            double controlsetting=1.5;
            VariableResistor vrt = new VariableResistor(resistancevalue, tolerancevalue, powerrating, controlsetting);
            vrt.setControlSetting(controlsetting);
            System.out.println("Exception Failed");
        } catch (java.lang.Exception a) {
            System.out.println(a.getMessage());
        }
        
        // Testing of expcetions end.
        // Testing of methods start.
        // Testing the setControlSetting method to ensure that when the method is called and passed a valid value for the controlsetting that it
        // properly sets the controlsetting to the value that was passed to the method.
        double controlsetting = 0.5;
        VariableResistor vrt = new VariableResistor(resistancevalue, tolerancevalue, powerrating, controlsetting);
        vrt.setControlSetting(controlsetting);
        
        // Testing the getResistanceValue method to ensure that when the method is called that the correct resistance value is returned and that the value gets 
        // returned.
        System.out.println("The resistance value is " + vrt.getResistanceValue());
        
        // Testing the miniResistance method to ensure that when the method is called that is caluclates the mini resistance correctly and returns the
        // value of the mini resistance.
        System.out.println("The mini resistance is " + vrt.miniResistance());
        
        // Testing the maxResistance method to ensure that when the method is called that it caluclates the max resistance correctly and returns the 
        // value of the max resistance.
        System.out.println("The max resistance is " + vrt.maxResistance());
        
        // Testing the toString method to ensure that when the method is called that it returns the values of the resistancevalue, tolerancevalue,
        // powerrating, and controlsetting correctly and that it also returns the rest of the string that was typed.
        System.out.println(vrt.toString());
        // End of testing the methods in the VariableResistor Class.
        // End of testing for the VariableResistor class.
        // Start testing for PowerDissipation Interface.
        // Testing the powerFromCurrent method in Resistor Class that was implemted from the PowerDissipation Interface. 
        // Testing to ensure that the method when the power dissaption exceeds the powerrating value the method throws an exception.
        try {
            double current = 0.2;
            vrt.powerFromCurrent(current);
            System.out.println("Exception Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Testing the powerFromCurrent method to ensure that the method when called calucates the power disspation correctly and returns the 
        // the value for the power disspation.
        double current = 0.001;
        System.out.println("The power from the current is " + rt.powerFromCurrent(current));
        
        // Testing powerFromCurrent method in VariableResistor Class.
        // Testing to ensure that the method when the power dissaption exceeds the powerrating value the method throws an exception.

        try {
            double current1 = 0.2;
            vrt.powerFromCurrent(current1);
            System.out.println("Exception Failed");

        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing the powerFromCurrent method to ensure that the method when called calucates the power disspation correctly and returns the 
        // the value for the power disspation.
        double current2 = 0.001;
        System.out.println("The power from the current is " + vrt.powerFromCurrent(current2));
        // Testing for PowerDissipation Interface stops.
        // Testing stops.
    }
}
