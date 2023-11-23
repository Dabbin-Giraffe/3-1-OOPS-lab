import java.util.*;

public class concat{
    public static void main(String[] args) {
        System.out.println("Enter two strings : ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String concat_string = str1+str2; 

        System.out.print("Enter start index  : ");
        int index1 = scanner.nextInt();
        System.out.print("Enter end index  : ");
        int index2 = scanner.nextInt();

        String sub_string = concat_string.substring(index1,index2);
        System.out.println(sub_string);


        scanner.close();

        // System.out.println(str1+str2);
        // System.out.println(str2);

        
    }
}