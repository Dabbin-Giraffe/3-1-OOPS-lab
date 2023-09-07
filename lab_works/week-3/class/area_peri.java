class area_peri{

public static void calc(float radius){
float pi = 3.141592f;
float area = pi*radius*radius;
float perimeter = 2*pi*radius;
System.out.println("area for circle of radius "+radius + " is "+area);
System.out.println("permiter for circle of radius "+radius + " is "+perimeter);
}

public static void main(String[] args){

float radius = 12.5f;
float radius2 = 1;

calc(radius);
calc(radius2);

}

}