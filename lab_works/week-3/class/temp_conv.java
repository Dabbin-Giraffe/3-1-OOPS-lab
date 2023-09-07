class temp_conv{

static void converter(float x){
float kelvin = 273.15f+x;
float farenheit = ((x*9)/5)+32;

System.out.println(x+"C in kelvin is "+kelvin);
System.out.println(x + "C in Farenheit is "+farenheit);
}

public static void main(String[] args){
float x = 6f;
converter(x);
}

}