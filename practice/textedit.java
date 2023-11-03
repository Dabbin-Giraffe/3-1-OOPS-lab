import java.io.*;

public class textedit {
    public static void main(String[] args){
        PrintWriter potato = null;
        try{
            potato = new PrintWriter(new FileOutputStream("out.txt",true));

        }
        catch(FileNotFoundException e){
            System.exit(0);
        }

        int count;
        for(count = 0;count < 3;count++){
            potato.println(count);
        }
        potato.close();

    }
}
