class Base {
    void display() {
        System.out.println("Base class");
    }
}

class Derived extends Base {
    @Override
    void display() {
        System.out.println("Derived class");
    }

    void display(int num) {
        System.out.println("Derived class param: " + num);
    }
}

public class main_override {
    public static void main(String[] args) {
        Base baseObj = new Derived();
        baseObj.display(); 
        Derived derivedObj = new Derived();
        derivedObj.display(); 
        derivedObj.display(42); 
    }
}
