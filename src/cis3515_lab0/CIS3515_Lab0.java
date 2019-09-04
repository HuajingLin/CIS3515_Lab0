
package cis3515_lab0;

/**
 * CIS 3515-3 Mobile Develop
 * @author huajinglin Full, 2019
 */

import java.io.*;
import java.util.Scanner;

public class CIS3515_Lab0 {

    public static void main(String[] args) {
        double value1 = 0.0;
        double value2 = 0.0;
        double value3 = 0.0;
        Scanner scan = new Scanner( System.in );

        //==========================================
        Square square = new Square("Square_A");
        System.out.print("Enter the lenght of square:");
        while(true){
            try{
                value1 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        
        System.out.print("Enter the height of square:");
        while(true){
            try{
                value2 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        square.setDimensions(value1, value2);
        System.out.printf("Shape name: %s\n", square.getName());
        square.printDimensions();
        System.out.printf("Area: %f\n\n", square.getArea());
        //========================================================
        
        
        //==========================================
        Circle circle = new Circle("Circle_A");
        System.out.print("Enter the radius of Circle:");
        while(true){
            try{
                value1 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        
        circle.setDimensions(value1);
        System.out.printf("Shape name: %s\n", circle.getName());
        circle.printDimensions();
        System.out.printf("Area: %f\n\n", circle.getArea());
        //========================================================


        //==========================================
        Triangle triangle = new Triangle("Triangle A");
        System.out.print("Enter the side A of triangle:");
        while(true){
            try{
                value1 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        
        System.out.print("Enter the side B of triangle:");
        while(true){
            try{
                value2 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        
        System.out.print("Enter the side C of triangle:");
        while(true){
            try{
                value3 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        triangle.setDimensions(value1, value2, value3);
        System.out.printf("Shape name: %s\n", triangle.getName());
        triangle.printDimensions();
        System.out.printf("Area: %f\n\n", triangle.getArea());
        //========================================================
        
        
        //==========================================
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral Triangle A");
        System.out.print("Enter the side of equilateral triangle:");
        while(true){
            try{
                value1 = scan.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Please enter the digital.");
            }
        }
        
        equilateralTriangle.setDimensions(value1);
        System.out.printf("Shape name: %s\n", equilateralTriangle.getName());
        equilateralTriangle.printDimensions();
        System.out.printf("Area: %f\n\n", equilateralTriangle.getArea());
    }
    
}
