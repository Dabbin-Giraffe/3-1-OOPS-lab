class Box {
    protected double length;
    protected double breadth;
    protected double height;
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void set(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public double area() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

class Box3D extends Box {
    public Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class box_main {
    public static void main(String[] args) {
        Box3D box3D = new Box3D(5.0, 3.0, 2.0);

        double area = box3D.area();
        double volume = box3D.volume();

        System.out.println("Area of the 3D Box: " + area);
        System.out.println("Volume of the 3D Box: " + volume);
    }
}
