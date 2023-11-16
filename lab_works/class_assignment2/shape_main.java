class Shape{
    public void draw(){
        System.out.println("Shape drawn");
    }
    public void erase(){
        System.out.println("Shape is no more");
    }
}

class Triangle extends Shape{
    // @Override
    public void draw(){
        System.out.println("Triangle drawn");
    }
    // @Override
    public void erase(){
        System.out.println("Triangle is no more");
    }
}
class Circle extends Shape{
    // @Override
    public void draw(){
        System.out.println("Circle drawn");
    }
    // @Override
    public void erase(){
        System.out.println("Circle is no more");
    }
}
class Square extends Shape{
    // @Override
    public void draw(){
        System.out.println("Square drawn");
    }
    // @Override
    public void erase(){
        System.out.println("Square is no more");
    }
}

class shape_main{
    public static void main(String[] args){
        Shape shape = new Shape();
        shape.draw();
        shape.erase();

        Circle circle = new Circle();
        circle.draw();
        circle.erase();

        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.erase();

        Square square = new Square();
        square.draw();
        square.erase();
    }
}