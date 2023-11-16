class Shape{
    public double getArea(){
       return 0.0;
    }
}

class Rectangle extends Shape{
    double length,breadth;
    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea(){
        return this.length*this.breadth;
    }
}

public class area_main {
    public static void main(String[] args){
    Rectangle rectangle = new Rectangle(10,20);
    System.out.println("Area is : " + rectangle.getArea());}}