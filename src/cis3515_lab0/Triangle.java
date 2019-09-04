
package cis3515_lab0;

/**
 * CIS 3515-3 Mobile Develop
 * @author huajinglin
 */
public class Triangle extends Shape {
    private double sideA, sideB, sideC;
    
    public Triangle(String name) {
        super(name);
        sideA = sideB = sideC = 0;
    }
    
    public void setDimensions(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    @Override
    public void printDimensions(){
        System.out.printf("side A: %f, side B: %f, side C: %f.\n", sideA, sideB, sideC);
    }
    
    @Override
    public double getArea(){
        double perimeter = sideA + sideB + sideC;
        double s = perimeter / 2.0;
        
        return java.lang.Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
}
