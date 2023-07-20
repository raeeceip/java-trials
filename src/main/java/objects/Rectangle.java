package objects;

public class Rectangle {
    private Shape shape;
    private double length;

    private double width;

    public Rectangle(){
        this.shape = new Shape();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }

    public double calculatePerimeter(){
        return 2 * (this.length + this.width);
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}
