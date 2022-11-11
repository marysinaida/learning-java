abstract public class Shape {


    
    private double startPosition;
    
    Shape(double startPosition){
        this.startPosition = startPosition;
    }

    abstract double calculateVolume(); 

    abstract double findArea(); 

    abstract double calculateArea();

    void move(double nextLocation) {
        System.out.println("Moved from" + startPosition + nextLocation);

    }
    
}
