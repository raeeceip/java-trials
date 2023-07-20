package objects;

import static objects.PrintShape.getColorAndFilled;

public class RectangleCalculator {

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        rectangle1.setLength(5);
        rectangle1.setWidth(10);

        totalArea(rectangle1, rectangle2);
        totalPerimeter(rectangle1, rectangle2);
        getColorAndFilled();
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
    }

    private static void totalPerimeter(Rectangle rectangle1, Rectangle rectangle2) {
        double totalPerimeter = rectangle1.calculatePerimeter() + rectangle2.calculatePerimeter();
        System.out.println("The total perimeter is: " + totalPerimeter);
    }

    private static void totalArea(Rectangle rectangle1, Rectangle rectangle2) {
        double totalArea = rectangle1.calculateArea() + rectangle2.calculateArea();
        System.out.println("The total area is: " + totalArea);
    }

}



