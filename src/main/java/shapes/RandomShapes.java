package shapes;
import javafx.scene.shape.Path;

import  java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import java.awt.geom.*;
public class RandomShapes {
    public static void main(String[] args) {

        RandomShapes shps = new RandomShapes();

    }
    public void colour( Graphics g){
            Graphics g2 = (Graphics2D) g;
            double randX, randY, randRadius, randWidth, randHeight,randBase,randSide2,randBase2,randSide1, randHeight2;

            Abstractshapes[] shapes = new Abstractshapes[5];

            for (int i = 0; i < shapes.length; i++) {

                int unknowshape = (int) (Math.random() * 4 + 1);


                randX = (int) ((Math.random() * 100) + 1);
                randY = (int) ((Math.random() * 100) + 1);
                randRadius = (int) ((Math.random() * 100) + 1);
                randWidth = (int) ((Math.random() * 100) + 1);
                randHeight = (int) ((Math.random() * 100) + 1);
                randBase2 = (int) ((Math.random() * 100) + 1);
                randSide1 = (int) ((Math.random() * 100) + 1);
                randSide2 = (int) ((Math.random() * 100) + 1);
                randBase = (int) ((Math.random() * 100) + 1);
                randHeight2 = (int) ((Math.random() * 100) + 1);



                if (unknowshape == 1) {

                    shapes[i] = new Circle(randX, randY);
                    ((Circle) shapes[i]).setRadius(randRadius);
                    double centerX =randX;
                    double centerY= randY;
                    double radius=randRadius;

                    Ellipse2D circle = new Ellipse2D.Double();
                    circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
                    g2.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256) ));
                    ((Graphics2D) g2).draw(circle);
                    System.out.println("\n#" + (i+1) + shapes[i].display());
                } else if (unknowshape==2){
                    shapes[i] = new Rectangle(randX, randY);
                    ((Rectangle) shapes[i]).setHeight(randHeight);
                    ((Rectangle) shapes[i]).setWidth(randWidth);

                    double leftX =randX;
                    double topY= randY;
                    double width=randWidth;
                    double height= randHeight;
                    Rectangle2D circle = new Rectangle2D.Double();
                    circle.setFrame(leftX,topY,leftX+width,topY+height);
                    g2.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256) ));
                    ((Graphics2D) g2).draw(circle);
                    System.out.println("\n#" + (i+1) + shapes[i].display());
                }else if (unknowshape==3){

                    shapes[i] = new Triangle(randX, randY);
                    ((Triangle) shapes[i]).setHeight(randHeight);
                    ((Triangle) shapes[i]).setBase(randBase);
                    ((Triangle) shapes[i]).setSide1(randSide1);
                    ((Triangle) shapes[i]).setSide2(randSide2);
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,150,150 ));
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,150,150 ));
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,50,150 ));
                    g2.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256) ));
                    System.out.println("\n#" + (i+1) + shapes[i].display());
                }else {
                    shapes[i] = new Trapezium(randX, randY);
                    ((Trapezium) shapes[i]).setHeight(randHeight);
                    ((Trapezium) shapes[i]).setBase(randBase);
                    ((Trapezium) shapes[i]).setHeight2(randHeight2);
                    ((Trapezium) shapes[i]).setBase2(randBase2);
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,150,150 ));
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,150,150 ));
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,50,150 ));
                    ((Graphics2D) g2).draw(new Line2D.Double(randX,randY,150,150 ));
                    g2.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256) ));
                    System.out.println("\n#" + (i+1) + shapes[i].display());
                }
            }
        }


}



