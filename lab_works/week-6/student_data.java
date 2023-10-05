import java.util.ArrayList;

class Student{

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private double gpa;

	Student(int id,String firstName, String lastName,String email,double gpa){

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gpa = gpa;

	}
	Student(){}
	public void set_firstName(String firstname){
		this.firstName = firstName;
	}
	public void set_lastName(String lastname){
		this.lastName = lastName;
	}
	public void set_email(String email){
		this.email = email;
	}
	public void set_gpa(double gpa){
		this.gpa = gpa;
	}
	public void set_id(int id){
		this.id = id;
	}

	public int get_id(){
		// System.out.println("The id of student is : ");
		// System.out.println(this.id);
		return this.id; 
	}
	public String get_lastName(){
		// System.out.println("The last name of student is : "+this.lastName);
		// System.out.println(this.id);
		return this.lastName;
	}
	public String get_firstName(){
		// System.out.println("The first name of student is : "+this.firstName);
		// System.out.println(this.id);
		return firstName;
	}
	public double get_gpa(){
		// System.out.println("The gpa of the student is : ");
		// System.out.println(this.gpa);
		return this.gpa;
	}
	public String get_email(){
		// System.out.println("The email of student is : "+this.email);
		return this.email;
	}
}

class StudentDatabase{
	
	ArrayList<Student> students;

	StudentDatabase(){
		students = new ArrayList<Student>();
	}

	public void addStudent(Student student){
		students.add(student);
	}
	public Student getStudentById(int id){
		for(int i = 0;i<students.size();i++){
			if(students.get(i).get_id() == id){
				return students.get(i);
			}
		}
		return students.get(0);
	}
	
	public ArrayList<Student> getAllStudents(){
		return students;
	}

	public double calculateAverageGPA(){
		double sum = 0;
		for(int i=0;i<students.size();i++){
			sum += students.get(i).get_gpa();
		}
		double average = sum/students.size();
		return average;
	}

	public void displayStudentDetails(){
		for(int i = 0;i < students.size();i++){
			System.out.println("Student Id : ");
			System.out.println(students.get(i).get_id());

			System.out.println("Student Name : " + students.get(i).get_firstName() + students.get(i).get_lastName());
			
			System.out.println("Student email is : "+students.get(i).get_email());

			System.out.println("Student GPA is : ");
			System.out.println(students.get(i).get_gpa());

			System.out.println();
		}
	}

	public void removeStudent(int id){
		for(int i = 0;i < students.size();i++){
			if(students.get(i).get_id() == id){
				students.remove(i);
			}
		}
	}

}

public class student_data{
	public static void main(String args[]){
		StudentDatabase data = new StudentDatabase();

		Student a = new Student(1,"Laughing","Fox","laughingfox@gmail.com",9.8);
		data.addStudent(a);

		Student b = new Student(2,"Crying","Fox","cryingfox@gmail.com",1.2);
		data.addStudent(b);


		Student c = new Student(3,"Potato","Fox","potatofox@gmail.com",5.0);
		data.addStudent(c);

		Student d = new Student(4,"Emo","Fox","emofox@gmail.com",7.8);
		data.addStudent(d);



		data.displayStudentDetails();

		ArrayList<Student> students = new ArrayList<Student>();
		students = data.getAllStudents(); 
		System.out.println(students);
		

		System.out.println(data.getStudentById(2));

		double average_gpa = data.calculateAverageGPA();
		System.out.println("Average GPA : ");
		System.out.println(average_gpa);

		data.removeStudent(3);
		data.displayStudentDetails();
		
	}
}