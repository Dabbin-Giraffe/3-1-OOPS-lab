import java.io.*;
public class textout {
    public static void main(String[] args){
        PrintWriter potato = null;
        try{
            potato = new PrintWriter(new FileOutputStream("out.txt"));
        }
        catch (FileNotFoundException e){
            System.exit(0);
        }
        System.out.println("Enter three lines ig");
        int count;
        for (count = 1;count <= 3;count++){
            potato.println(count);
        }
        potato.close();
        System.out.println("Done");
    }
}
