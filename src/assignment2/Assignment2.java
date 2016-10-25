/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner;

/**
 *
 * @author taylorwu
 */
public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter hourly rate: ");
        int hourlyRate = sc.nextInt();
        System.out.print("enter hours worked: ");
        int hours = sc.nextInt();
        Salary salary = new Salary();
        double overtime = salary.overTimeSalary(hourlyRate, hours);
        System.out.println("Overtime salary is: " + overtime);
    }
    
}
