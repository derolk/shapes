package shapes;

public class Trapezium extends Abstractshapes {

        private double height;
        private double base;
        private double base2;
        private double height2;
        public Trapezium ( double xpos, double ypos){
            super(xpos,ypos);
        }

        public void setHeight(double x){
            height = x;
        }

        public void setBase(double b){
            base = b;
        }
    public void setBase2(double b1){
        base2 = b1;
    }

    public void setHeight2(double height2) {
        this.height2 = height2;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight2() {
        return height2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }



        public double getarea() {
            double area = ((base*base2)*0.5)*height;
            return area;
        }

        public double getradius() {
            return 0;
        }

        public double getperimeter() {
            double perimeter = base+height+height2+base2;
            return perimeter ;
        }
        public Trapezium clone() {
            Trapezium theClone;
            theClone = new Trapezium(this.xpos, this.ypos);
            theClone.setHeight(this.height);
            theClone.setBase(this.base);
            return theClone;
        }
        public boolean equals(Trapezium r) {
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
                    + "\nbase2: " + base2
                    + "\nheight2: " + height2
                    + "\nArea: " + this.getarea()
                    + "\nPerimeter: " + this.getperimeter();
            return message;
        }

    }

