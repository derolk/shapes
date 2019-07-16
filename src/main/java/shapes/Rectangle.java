package shapes;

public class Rectangle extends Abstractshapes{
    private double height;
    private double width;


    public Rectangle(double xpos, double ypos) {
        super(xpos, ypos);
    }


    public void setHeight(double h) {
        height = h;
    }


    public double getHeight() {
        return height;
    }


    public void setWidth(double w) {
        width = w;
    }


    public double getWidth(double w) {
        return width;
    }

    // Calculate the area
    public double getarea() {
        double area = height * width;
        return area;
    }

    public double getradius() {
        return 0;
    }


    public double getperimeter() {
        double perimeter = (2 * width) + (2 * height);
        return perimeter;
    }




    public Rectangle clone() {
        Rectangle theClone;
        theClone = new Rectangle(this.xpos, this.ypos);
        theClone.setHeight(this.height);
        theClone.setWidth(this.width);
        return theClone;
    }


    public boolean equals(Rectangle r) {
        return r.height == this.height
                && r.width == this.width
                && r.getXPos() == this.xpos
                && r.getYPos() == this.ypos;
    }

    public String display() {
        String message = "\n[RECTANGLE]"
                + "\nPosition: (" + xpos + ", " + ypos
                + ")\nHeight: " + height
                + "\nWidth: " + width
                + "\nArea: " + this.getarea()
                + "\nPerimeter: " + this.getperimeter();
        return message;
    }

}
