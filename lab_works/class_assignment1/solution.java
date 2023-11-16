import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter("employee_student_data.txt");

            while (true) {
                System.out.print("Enter employee/student data seperated by commas.Enter it as follows (designation type(emp or stud),Name,data*) (Enter 'exit' to quit the program) ");
                String input = reader.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                StringTokenizer tokenizer = new StringTokenizer(input, ",");

                    String type = tokenizer.nextToken().trim();

                if (type.equalsIgnoreCase("emp")) {
                    String name = tokenizer.nextToken().trim();
                    double salary = Double.parseDouble(tokenizer.nextToken().trim());
                    double bonus = Double.parseDouble(tokenizer.nextToken().trim());
                    double grossSalary = salary + bonus;

                    fileWriter.write("Employee: Name - " + name +", Salary - "+ salary +", Additional stuff - "+bonus+", Gross Salary - " + grossSalary + "\n");
                } else {
                    String name = tokenizer.nextToken().trim();
                    double totalMarks = Integer.parseInt(tokenizer.nextToken().trim());
                    int counter = 1;
                    while (tokenizer.hasMoreTokens()) {
                        totalMarks += Double.parseDouble(tokenizer.nextToken().trim());
                        counter++;
                    }

                    fileWriter.write("Student: Name - " + name +",Current Year - "+counter+ ", Total/Gross Marks - " + totalMarks + "\n");
                }
            }

            fileWriter.close();
            System.out.println("Data saved to 'employee_student_data.txt'.");
            System.out.println("Beep Boop, I go now.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
