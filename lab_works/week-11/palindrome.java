import java.nio.Buffer;

class Checker{
    public boolean palindrome_checker_string(String str1){
        if(str1 == null){return false;}
        int len = str1.length();
        for(int i=0; i < len ; i++){
            if  (str1.charAt(i) != str1.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    public boolean palindrome_checker_buffer(StringBuffer buff1){
        if(buff1 == null){return false;}

        int len = buff1.length();
        for(int i=0; i < len ; i++){
            if  (buff1.charAt(i) != buff1.charAt(len-i-1)){
                return false;
            }
        }
        return true;

    }
}

public class palindrome {
    public static void main(String[] args) {
        Checker obj = new Checker();

        String str1 = "racecar";
        StringBuffer buff1 = new StringBuffer(str1);

        String str2 = "potato";
        StringBuffer buff2 = new StringBuffer(str2);


        System.out.println("Checking if "+str1+" is a Palindrome "+obj.palindrome_checker_string(str1));
        System.out.println("Checking if "+str1+" is a Palindrome using buffer "+obj.palindrome_checker_buffer(buff1));

        System.out.println("Checking if "+str2+" is a Palindrome "+obj.palindrome_checker_string(str2));
        System.out.println("Checking if "+str2+" is a Palindrome using buffer "+obj.palindrome_checker_buffer(buff2));

    }
}
