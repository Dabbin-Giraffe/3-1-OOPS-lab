// import java.util.Scanner

class Calculator{

	// Constructor Stuff
	// Default Constructor
	Calculator(){
		int val2 = 10;
		int val1 = 20;
		int answer_add = this.add_int(val1,val2);
		this.display_result("Result add : ",1);
		System.out.println(answer_add);

		int answer_sub = this.sub_int(val1,val2);

		this.display_result("Result subtract :",1);
		System.out.println(answer_sub);
	}

	// Sum for int

	Calculator(int a,int b){
		int answer = this.add_int(a,b);
		this.display_result("Result Add : ",2);
		System.out.println(answer);

		int answer_sub = this.sub_int(a,b);
		this.display_result("Result Subtract : ",2);
		System.out.println(answer_sub);

	}

	// Sum for doubles

	Calculator(double a,double b){
		double answer = this.add_double(a,b);
		this.display_result("Result Subtract",3);
		System.out.println(answer);

		double answer_sub = this.sub_double(a,b);
		this.display_result("Result Sub : ",3);
		System.out.println(answer_sub);
			}

	// Method to display result

	private void display_result(String text,int number){
		System.out.println(text+String.valueOf(number));
	}

	// Method to add ints

	private int add_int(int a,int b){
		return a+b;
	}

	// Method to add doubles

	private double add_double(double a,double b){
		return a+b;
	}

	private int sub_int(int a,int b){
		return a-b;
	}

	private double sub_double(double a,double b){
		return a-b;
	}
}

public class calculator_main{
	public static void main(String args[])
	{Calculator  object = new Calculator();
	
		Calculator object2 = new Calculator(1,2);
		// object2(3,2)
	
		Calculator object3 = new Calculator(7.3,6.4);
		// object3(5.2,7.3);
	}


}