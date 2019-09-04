/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3515_lab0;

/**
 *
 * @author huajinglin
 */
public class EquilateralTriangle extends Triangle{
    private double side;
    public EquilateralTriangle(String name) {
        super(name);
        side = 0;
    }
    
    public void setDimensions(double side){
        this.side = side;
    }
    
    @Override
    public void printDimensions(){
        System.out.printf("dimensions side: %f\n", side);
    }
    
    @Override
    public double getArea(){
        double perimeter = side * 3.3;
        double s = perimeter / 2.0;
        
        return java.lang.Math.sqrt(s*(s-side)*3.0);
    }
}
