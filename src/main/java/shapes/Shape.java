package shapes;

public interface Shape {
    double getarea();
    double getradius();
    double getperimeter();


    String display();
    double getXPos();

    double getYPos();

     void move(double xLoc, double yLoc);


}
