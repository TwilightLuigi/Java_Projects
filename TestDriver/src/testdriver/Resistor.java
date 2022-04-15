/**
 * Lab 1 for CS 1181
 * This program demonstrates the use of NetBeans IDE
 * The class will make a resistor object, get he values for the resistancevalue and the powerrating, claculate the
 * max and mini resistance, power from the current, validate values, throw exceptions when values are not vaild, and output
 * values.
 */
package testdriver;

/**
 * @author Sierra Sprungl
 * CS1181L- 06
 * Instructor: R. Volkers
 * TA's: William Hess and Chris Stropes 
 */
public class Resistor implements PowerDissipation {

    private double resistancevalue;
    private double tolerancevalue;
    private double powerrating;
    /**
    * Takes in values in a given range and validates them.
    * Precondition: The values must be within a range.
    * Postcondition: The values fall within the range.
    * @param resistancevalue - the value for this must be greater than 0 and it is the value that will be used resistancevalue.
    * @param tolerancevalue - the value for this must be greater than 0 but less than one and can't be 0 or 1 and it is the value
    * that will be used has the tolerancevalue.
    * @param powerrating - the value for this must be greater than 0 and it is the value that will be used for the powerrating.
    * @throws Exception when the range for the parameters is violated. 
    */
    public Resistor(double resistancevalue, double tolerancevalue, double powerrating) throws Exception {
        if (resistancevalue <= 0) {
            throw new Exception("The resistance value must be greater than zero.");
        }
        if (tolerancevalue <= 0 || tolerancevalue >= 1) {
            throw new Exception("The tolerance value must be between zero and one (not incusive).");

        }
        if (powerrating <= 0) {
            throw new Exception("The power rating must be greater than zero.");
        } else {
            this.resistancevalue = resistancevalue;
            this.tolerancevalue = tolerancevalue;
            this.powerrating = powerrating;
        }

    }
    /**
    * Takes the hard coded value for the resistancevalue and returns it when the method is called
    * Precondition: The resistance value must have been a valid value in the class constructor.
    * Postcondition: The resistance value is a value greater than 0 
    * @return The value for the resistancevalue that was hard coded.
    */
    public double getResistanceValue() {
        return this.resistancevalue;
    }
    
   /**
   * Takes the hard coded value for the powerratting and returns it when the method is called
   * Precondition: The powerratting value must have been a valid value in the class constructor
   * Postcondition: The powerratting is greater than 0.
   * @return The value for the powerrating that was hard coded. 
   */
    public double getPowerRating() {
        return this.powerrating;
    }
    
    /**
    * Caclultes the value for the mini resistance by doing simple mathmatices.
    * Precondition: The resistance must have been a valid value in the class constructor
    * Postcondition: The resistance is greater than 0.
    * @return The value for the mini resistance
    */
    public double miniResistance() {
        double minir = resistancevalue * (1.0 - tolerancevalue);
        return minir;
    }
    
    /**
     * Cacluates the value for the max resistance by doing simple mathmatices. 
     * Precondition: The resistance value must have been a valid value in the class constructor
     * Postcondition: The resistance value is greater than 0.
     * @return The value for the max resistance.
     */
    public double maxResistance() {
        double maxr = resistancevalue * (1.0 + tolerancevalue);
        return maxr;
    }
    
    /**
    * Caculates the power dissipation by doing simple mathmatices, then it checks the power dissipation to see if is greater than the powerrating.
    * if it is then an expection is thrown, if not the value is displayed.
    * Precondition: A value for the current was hard coded and the powerrating was a valid value in the class constructor
    * Postcondition: The value for current allowed the power dissipation to be lower than the powerrating.
    * @param current - the hard coded value for the current that will be used to clauclate the power dissipation 
    * @return the value for the power dissipation
    * @throws Exception when the power dissipation is greater than the powerrating.
    */
    @Override
    public double powerFromCurrent(double current) throws Exception {
        double pd = current * current * maxResistance();
        if (pd > powerrating) {
            throw new Exception("Power dissipation can't exceed power rating.");
        } else {
            return pd;

        }
    }
    
    /**
     * Prints out a string that reports the values for the resistance, tolerance, and power rating.
     * Precondition: all the values were valid in the resistance class consctor. 
     * @return 
     */
    @Override
    public String toString() {
        return "The value of the resistance is: " + resistancevalue + " ohms." + " The value of the tolerance is: " + tolerancevalue + "." + " The power rating is: " + powerrating + " watts.";

    }
}
