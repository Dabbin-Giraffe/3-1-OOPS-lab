class Shape{
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
}

class Triangle extends Shape{
    double height;
    double base;
    double a,b,c;

    public Triangle(double height,double base,double a,double b,double c){
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        return 0.5*this.base*this.height;
    }
    public double perimeter(){
        return this.a+this.b+this.c;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return 3.141*this.radius*this.radius;
    }
    @Override
    public double perimeter(){
        return 2*3.141*this.radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area(){
        return this.length*this.breadth;
    }
    @Override
    public double perimeter(){
        return this.length + this.breadth;
    }
}

class area_perimeter{
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println("Shape area "+shape.area());
        System.out.println("Shape perimaeter "+shape.perimeter());

        Circle circle = new Circle(12.7);
        System.out.println("Circle area "+circle.area());
        System.out.println("Circle perimeter "+circle.perimeter());

        Triangle triangle = new Triangle(4.8,6.3,7.1,8.2,9.5);
        System.out.println("Triangle area "+triangle.area());
        System.out.println("Triangle perimeter "+triangle.perimeter());

        Rectangle rectangle = new Rectangle(13.5,12.5);
        System.out.println("Area rect "+rectangle.area());
        System.out.println("Perimeter rect "+rectangle.perimeter());
    }
}