class swap_nums{

static void swap_num(int x,int y){
System.out.println("Before x = "+x+"; y = "+y);
x = x+y;
y = x-y;
x = x-y;
System.out.println("After x = "+x+"; y = "+y);

}

public static void main(String[] args){
int x,y;
x = 32;
y = 25;

swap_num(x,y);
}

}