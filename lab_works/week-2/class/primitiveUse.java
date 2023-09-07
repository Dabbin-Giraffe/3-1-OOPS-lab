class primitiveUse{

static int add_int(int x,int y){

 return x+y; 

}

static boolean or_relation(boolean x,boolean y){
return x||y;
}

    static int add_byte(byte x, byte y) {
        return x + y;
    }
static int add_short(short x,short y){
return x+y;
}

static String add_money(String x,String y){
long a = Long.parseLong(x);
long b = Long.parseLong(y);

long sum = a+b;
String money = Long.toString(sum);
return money;

}

static float convert_time(int second){
hours = second / 3600;
minutes = (second % 3600) / 60;
seconds = second % 60;

timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
return timeString;
}

public static void main(String args[]){
byte x = 12;
byte y = 13;

short a = 32000;
short b = 32001;

String cash1 = "999999999999";
String cash2 = "12432412312433";

int second = 1234567;

System.out.println("sum of ints is "+add_int(2147483640,-2147483620));
System.out.println("or condition is "+or_relation(true,false));
System.out.println("sum of bytes "+add_byte(x,y));
System.out.println("sum of shorts is " + add_short(a,b));
System.out.println("sum of shorts is " + add_money(cash1,cash2));
System.out.println("time is "+convert_time(second));
}


}

