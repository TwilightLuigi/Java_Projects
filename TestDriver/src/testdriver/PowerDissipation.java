/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriver;

/**
 * 
 * 
 * 
 */

public interface PowerDissipation {
/**
 * When passed a value for current, the method then takes that value and uses it to calulate the power dissipation 
 * if the power dissipation exceeds the power setting then an exception is thrown.
 * Precondition: the value for current must be a double.
 * Postcondition: the value for current will have been a double and be a valid value.
 * @param current- the value used for calulating the power dissipation, must be a double.
 * @return the value for the power dissipation.
 * @throws Exception when the power dissipation is higher than the power setting.
 */   
public double powerFromCurrent(double current)throws Exception;
    
}
