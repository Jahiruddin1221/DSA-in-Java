package OOPs;

public class Rectangle {
    private int width;
    private int height;

    // constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        //displayArea();
    }

    // getter
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    // setter
    public void setWidth(int width) {
     this.width = width;
     }
     public void setHeight(int height) {
     this.height = height;
     }

    public int getArea() {
        return width * height;
    }

    public void displayArea() {
        System.out.println("Height is " + getHeight() + " and width is " + getWidth()
                                        + " Area of rectangle is: " + getArea());

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.displayArea();
        r.width = 20;
        r.displayArea();
        r.height = 10;
        r.displayArea();


    }
}
