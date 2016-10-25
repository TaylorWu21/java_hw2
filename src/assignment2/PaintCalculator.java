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
public class PaintCalculator {
    private int SQFT = 350;
    private int PRICE = 32;
    
    public double roomArea(int width, int length) {
        return width * length;
    }
    
    public double paintNeeded(double area) {
        return area / SQFT;
    }
    
    public double paintPrice(double gallon) {
        return gallon * PRICE;
    }
}
