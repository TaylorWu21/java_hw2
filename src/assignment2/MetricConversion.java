/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author taylorwu
 */
public class MetricConversion {
    private double CM = 2.54;
    private double LITER = 3.7854;
    
    MetricConversion() {}
    
    public double convertToCm(int inches) {
        return inches * CM;
    }
    
    public double convertToLiter(int gallons) {
        return gallons * LITER;
    }
}
