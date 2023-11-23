import java.util.*;

public class buffer_replace {
    public static void main(String[] args) {

        StringBuffer buff = new StringBuffer();

        String str = new String("Laughing Fox laughed at a crying fox crying");

        buff.append(str);

        int index1 = 0,index2 = 8;

        System.out.println("String buffer : " + str);
        buff.reverse();
        System.out.println("Reversed buffer : " + buff);
        buff.reverse();
        buff.replace(index1, index2, "Angry");
        System.out.println("After replacing : " + buff.toString());
    }
}
