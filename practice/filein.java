import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class filein{
    public static void main(String[] args)
   {
      String fileName = null;
      try
      { Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter file name:");
         fileName = keyboard.next();
         BufferedReader inputStream =
            new BufferedReader(new FileReader(fileName));
	String line = null;
	line = inputStream.readLine();
         System.out.println("The first line in " + fileName + " is:");
         System.out.println(line);
	line = inputStream.readLine();
         System.out.println("The first line in " + fileName + " is:");
         System.out.println(line);
         inputStream.close();         
      }
      catch(FileNotFoundException e)
      {
	System.out.println("File " + fileName + " not found.");
      }
      catch(IOException e)
      {
         System.out.println("Error reading from file " + fileName);
      }
   }

}