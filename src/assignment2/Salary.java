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
public class Salary {
    private double OVERTIME = 1.5;
    
    public double overTimeSalary(double rate, int hour) {
        return (rate * OVERTIME) * hour;
    }
}
