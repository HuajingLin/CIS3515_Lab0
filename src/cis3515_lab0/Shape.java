package cis3515_lab0;

/**
 * CIS 3515-3 Mobile Develop
 * @author huajinglin
 */
public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // returns the name of the shape
    public String getName() {
        return name;
    }
    
    //returns the area of the shape
    public double getArea(){
        return 0.0;
    }
    
    public void printDimensions(){
        System.out.println("No dimensions");
    }
}
