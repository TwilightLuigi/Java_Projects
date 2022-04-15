/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriver;

/**
 *
 * @author Sierra
 */
public class VariableResistor extends Resistor {

    private double controlsetting;

    public VariableResistor(double resistancevalue, double tolerancevalue, double powerrating, double controlsetting) throws Exception {
        super(resistancevalue, tolerancevalue, powerrating);
        if (controlsetting < 0 || controlsetting > 1) {
            throw new Exception("The control setting must be between 0 to 1(inclusive) ");
        }

    }

    public void setControlSetting(double controlsetting) throws IllegalArgumentException {
        if (controlsetting < 0 || controlsetting > 1) {
            throw new IllegalArgumentException("The control setting must be between 0 to 1(inclusive) ");
        } else {
            this.controlsetting = controlsetting;

        }
    }

    @Override
    public double getResistanceValue() {
        double r = super.getResistanceValue();
        double nr = r * controlsetting;
        return nr;

    }

    @Override
    public double miniResistance() {
        double mr = getResistanceValue();
        double nmr = mr * (super.miniResistance() / super.getResistanceValue());
        return nmr;
    }

    @Override
    public double maxResistance() {
        double Maxr = getResistanceValue();
        double nmar = Maxr * (super.maxResistance() / super.getResistanceValue());
        return nmar;
    }

    @Override
    public double powerFromCurrent(double current) throws Exception {
        double pd = current * current * maxResistance();
        
        if (pd > super.getPowerRating()) {
            throw new Exception("Power dissipation can't exceed power rating.");
        } else {
            return pd;
        }
    }

    @Override
    public String toString() {

        return super.toString() + " The control setting value is: " + controlsetting + ".";
    }

}
