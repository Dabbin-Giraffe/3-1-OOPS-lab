class prime_num{

static int prime(int x){
if(x == 1){System.out.println(x+" illegal");
return 1;}
int half = x/2;
for(int i =1;i < half;i++){
if(x%i == 0 && i != 1){
System.out.println(x + " not prime");
return 0;
}
}
System.out.println(x + " is prime");
return 1;
}

public static void main(String[] args){
int x = 1;
int y = 2;

prime(x);
prime(y);


}

}