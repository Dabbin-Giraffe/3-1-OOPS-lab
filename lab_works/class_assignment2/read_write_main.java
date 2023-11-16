import java.io.*;

public class read_write_main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter text (type 'exit' to finish): ");
            

            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String input;
            while (true) {
                input = reader.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input);
                writer.newLine(); 
            }

            writer.close();
            System.out.println("Saved to 'output.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
