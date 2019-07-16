package shapes;

public class Triangle extends Abstractshapes {
private double side1;
private double side2;
    private double height;
    private double base;
    public Triangle( double xpos, double ypos){
        super(xpos,ypos);
    }

    public void setHeight(double x){
        height = x;
    }

    public void setBase(double b){
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getarea() {
        double area = (base*height)*0.5;
        return area;
    }

    public double getradius() {
        return 0;
    }

    public double getperimeter() {
        double perimeter = base+side1+side2;
        return perimeter ;
    }
    public Triangle clone() {
        Triangle theClone;
        theClone = new Triangle(this.xpos, this.ypos);
        theClone.setHeight(this.height);
        theClone.setBase(this.base);
        return theClone;
    }
    public boolean equals(Triangle r) {
        return r.height == this.height
                && r.base == this.base
                && r.getXPos() == this.xpos
                && r.getYPos() == this.ypos;
    }

    public String display() {
        String message = "\n[RECTANGLE]"
                + "\nPosition: (" + xpos + ", " + ypos
                + ")\nHeight: " + height
                + "\nbase: " + base
                + "\nside: " +side2
                + "\nside: " + side1
                + "\nArea: " + this.getarea()
                + "\nPerimeter: " + this.getperimeter();
        return message;
    }


    /*public double gethypotenuse() {
        return Math.sqrt(Math.pow(base,));
    }*/
}
