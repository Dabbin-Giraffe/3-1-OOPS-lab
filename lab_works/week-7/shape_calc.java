class Shape_area {

    public int calculateArea(){
        return 0;
    }

}

class Circle extends Shape_area{
    public double calculateArea(double r){
        return 3.141*r*r;
    }

}

class Rectangle extends Shape_area{
    public double calculateArea(double length,double breadth){
        return length*breadth;
    }
}

class Triangle extends Shape_area{
    public double calculateArea(double height,double base){
        return 0.5*base*height;
    }
}

public class shape_calc{
    public static void main(String args[]){

        Shape_area object = new Shape_area();
        System.out.println("First class : ");
        System.out.println(object.calculateArea());

        Circle circle = new Circle();
        System.out.println("Using circle class");
        System.out.println(circle.calculateArea(10.0));

        Rectangle rectangle = new Rectangle();
        System.out.println("Using rectangle class");
        System.out.println(rectangle.calculateArea(10.0,12.0));

        Triangle triangle = new Triangle();
        System.out.println("Using triangle class");
        System.out.println(triangle.calculateArea(10.0,12.0));

    }
}