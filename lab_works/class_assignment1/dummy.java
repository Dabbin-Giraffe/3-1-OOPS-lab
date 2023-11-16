import java.io.*;
import java.util.StringTokenizer;

public class dummy {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter("MUData.txt");

            System.out.println("Enter the number of records:");
            int numRecords = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numRecords; i++) {
                System.out.println("Enter record " + (i + 1) + ":");
                String input = reader.readLine();

                StringTokenizer tokenizer = new StringTokenizer(input, ",");
                String type = tokenizer.nextToken();

                if (type.equalsIgnoreCase("employee")) {
                    // Employee details
                    String name = tokenizer.nextToken();
                    double basicSalary = Double.parseDouble(tokenizer.nextToken());
                    double allowances = Double.parseDouble(tokenizer.nextToken());

                    // Calculate gross salary
                    double grossSalary = basicSalary + allowances;

                    // Store in the file
                    fileWriter.write("Employee Name: " + name + "\n");
                    fileWriter.write("Basic Salary: " + basicSalary + "\n");
                    fileWriter.write("Allowances: " + allowances + "\n");
                    fileWriter.write("Gross Salary: " + grossSalary + "\n");
                } else if (type.equalsIgnoreCase("student")) {
                    // Student details
                    String name = tokenizer.nextToken();
                    int currentYear = Integer.parseInt(tokenizer.nextToken());

                    // Calculate gross marks (for simplicity, assuming marks for each course)
                    int totalMarks = 0;
                    for (int year = 1; year <= currentYear; year++) {
                        System.out.println("Enter marks for year " + year + ":");
                        int marks = Integer.parseInt(reader.readLine());
                        totalMarks += marks;
                    }

                    // Store in the file
                    fileWriter.write("Student Name: " + name + "\n");
                    fileWriter.write("Current Year: " + currentYear + "\n");
                    fileWriter.write("Total Marks: " + totalMarks + "\n");
                }
            }

            fileWriter.close();
            reader.close();
            System.out.println("Data saved to MUData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}