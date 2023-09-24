class even_odd{

static void even(int x){
if(x%2 == 1){
System.out.println(x+" is odd");}else{
System.out.println(x+" is even");
}
}

public static void main(String[] args){
int x = 20;
int y = 21;

even(x);
even(y);

}

}