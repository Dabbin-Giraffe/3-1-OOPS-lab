interface VehicleSystem{

	abstract void set_mileage(double mileage);
	abstract double get_mileage();

	abstract void set_tank_cap(double tank_cap);
	abstract double get_tank_cap();


	abstract void set_max_speed(int max_speed);
	abstract int get_max_speed();

	abstract void set_model(String model);
	abstract String get_model();

}

class Bike implements VehicleSystem{
	private boolean helmet;
	private int passengers = 2;
	private int wheels;


	private double mileage;
	private double tank_cap;
	private int max_speed;
	private String model;

	public Bike(){
		this.wheels = 2;
	}

	public void set_helmet(boolean helmet){
		this.helmet = helmet;
	}

	public boolean get_helmet(){
		return this.helmet;
	}
	public int get_passengers(){
		return this.passengers;
	}
	
	public void set_mileage(double mileage){
	this.mileage = mileage;
	}
	public double get_mileage(){
		return this.mileage;
	}

	public void set_tank_cap(double tank_cap){
		this.tank_cap = tank_cap;
	}
	public double get_tank_cap(){
		return this.tank_cap;
	}

	public int get_wheels(){
		return this.wheels;
	}

	public void set_model(String model){
		this.model = model;
	}
	public String get_model(){
		return this.model;
	}

public void set_max_speed(int max_speed){
		this.max_speed = max_speed;
	}
	public int get_max_speed(){
		return this.max_speed;
	}

}

class Car implements VehicleSystem{
	private int passengers;
	private int wheels;


	private double mileage;
	private double tank_cap;
	private int max_speed;
	private String model;

	public Car(){
		this.wheels = 4;
	}

	public void set_passengers(int pass){
		this.passengers = pass;
	}
	public int get_pass(){
		return this.passengers;
	}
	
	public void set_mileage(double mileage){
	this.mileage = mileage;
	}
	public double get_mileage(){
		return this.mileage;
	}

	public void set_tank_cap(double tank_cap){
		this.tank_cap = tank_cap;
	}
	public double get_tank_cap(){
		return this.tank_cap;
	}

	public int get_wheels(){
		return this.wheels;
	}

	public void set_model(String model){
		this.model = model;
	}
	public String get_model(){
		return this.model;
	}

public void set_max_speed(int max_speed){
		this.max_speed = max_speed;
	}
	public int get_max_speed(){
		return this.max_speed;
	}

}


public class vms_interface{
	public static void main(String[] args){

		Bike potatoBike = new Bike();
		
		potatoBike.set_helmet(true);
		potatoBike.set_mileage(21);
		potatoBike.set_model("Big Bike");
		potatoBike.set_tank_cap(20.2);
		potatoBike.set_max_speed(450);

		// System.out.println("<<------------------------Bike thing----------------------------->>");

		System.out.println("Mileage : "+potatoBike.get_mileage());
		System.out.println("tank cap : "+potatoBike.get_tank_cap());
		System.out.println("Wheels : "+potatoBike.get_wheels());
		System.out.println("max speed : "+potatoBike.get_max_speed());
		System.out.println("Model : "+potatoBike.get_model());
		System.out.println("helmet : " + potatoBike.get_helmet());

		Car potatoCar = new Car();

		potatoCar.set_mileage(2.9);
		potatoCar.set_model("Big car");
		potatoCar.set_tank_cap(21);
		potatoCar.set_max_speed(50);
		potatoCar.set_passengers(7);

		// System.out.println("<<------------------------Car thing----------------------------->>");

		System.out.println("Mileage : "+potatoCar.get_mileage());
		System.out.println("tank cap : "+potatoCar.get_tank_cap());
		System.out.println("Wheels : "+potatoCar.get_wheels());
		System.out.println("max speed : "+potatoCar.get_max_speed());
		System.out.println("Model : "+potatoCar.get_model());
		System.out.println("Passengers : "+potatoCar.get_pass());
	}
}