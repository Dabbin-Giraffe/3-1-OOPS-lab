class bitwise_op{

static void bitwise(int x,int y){
System.out.println("bitwise os of "+ x + " and "+ y+" is "+(x|y));
}

public static void main(String[] args){
int x = 6;
int y = 9;

int a = 12;
int b = 20; 
bitwise(a,b);
bitwise(x,y);
}

}