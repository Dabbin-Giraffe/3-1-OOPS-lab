class leap_year{

static void leap(int x){
if(x%4 == 0){
System.out.println(x+" is leap year");
}else{
System.out.println(x+" not a leap year");
}

public static void main(String[] args){
int x = 2005;
int y = 2016;

leap(x);
leap(y);


}

}