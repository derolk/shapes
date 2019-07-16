package shapes;

import java.awt.*;

public class Circle extends Abstractshapes {

    private double radius;


    public Circle(double xpos, double ypos) {
        super(xpos, ypos);
    }


    public void setRadius(double r) {
        radius = r;
    }


    public double getradius() {
        return radius;
    }


    public double getarea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }


    public double getperimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double gethypotenuse() {
        return 0;
    }

    public Circle clone() {
        Circle theClone;
        theClone = new Circle(this.xpos, this.ypos);
        theClone.setRadius(this.radius);
        return theClone;
    }


    public boolean equals(Circle c) {
        return c.radius == this.radius
                && c.getXPos() == this.xpos
                && c.getYPos() == this.ypos;
    }


    public String display() {
        String message = "\n[CIRCLE]"
                + "\nPosition: (" + xpos + ", " + ypos
                + ")\nRadius: " + radius
                + "\nArea: " + this.getarea()
                + "\nCircumference: " + this.getperimeter();
        return message;
    }

}
