
package cis3515_lab0;

/**
 * CIS 3515-3 Mobile Develop
 * @author huajinglin
 */
public class Circle extends Shape{
    
    private double radius;
    public Circle(String name) {
        super(name);
        radius = 0;
    }
    
    public void setDimensions(double radius){
        this.radius = radius;
    }
    
    @Override
    public void printDimensions(){
        System.out.printf("the radius of circle: %f.\n", radius);
    }
    
    @Override
    public double getArea(){
        double pi = 3.14;
        return pi * radius * radius;
    }
}
