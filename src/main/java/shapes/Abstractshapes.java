package shapes;

public abstract class Abstractshapes implements Shape {

    protected double xpos;
    protected double ypos;


    public Abstractshapes(double x, double y) {
        xpos = x;
        ypos = y;
    }


    public void move(double xLoc, double yLoc) {
        xpos = xLoc;
        ypos = yLoc;
    }


    public double getXPos() {
        return xpos;
    }


    public double getYPos() {
        return ypos;
    }


    public String display() {
        String message = "xPos: " + xpos
                + "\nyPos: " + ypos;
        return message;
    }

}
