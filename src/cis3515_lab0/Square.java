
package cis3515_lab0;

/**
 * CIS 3515-3 Mobile Develop
 * @author huajinglin
 */
public class Square extends Shape {
    
    private double length;
    private double height;

    
    public Square(String name) {
        super(name);
        length = 0;
        height = 0;
    }
    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions(){
        System.out.printf("length: %f, height: %f.\n", length, height);
    }
    
    @Override
    public double getArea(){
        return length * height;
    }
}
