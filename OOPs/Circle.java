package OOPs;

public class Circle {
    private double radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
        //displayResult();
    }
    // gitter sitter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Area of the Circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    // Circumference of Circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayResult() {
        System.out.println("Your Radius and Circumference of Circle is: " + getArea()
                                                                          + " or " + + getCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayResult();
        c.radius = 10;
        c.displayResult();
    }

}
