package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public Square( double side) {
        super("Square");
        setSide(side); // we add te side in constructor because we want to apply if condition in setSide method when we are initializing
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.err.println("Invalid side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return side*4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
