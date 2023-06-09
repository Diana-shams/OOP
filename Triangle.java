public class Triangle extends GeometricObject{
    double side1,side2,side3;
    String color;
    boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public String getColor() {
        return color;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double area()
    { return side1*side2*side3;}
    public double permiter()
    {
        return side1+side2+side3;
    }
}
