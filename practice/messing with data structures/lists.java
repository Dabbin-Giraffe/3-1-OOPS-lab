import java.util.*;

public class lists{
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("mango");
        list.add("potato");
        list.set(0,"aloo");

        list2.add("1");
        list2.add("2");
        list2.set(0,"i changed this");
        list.addAll(1,list2);
        for(String fruit:list){
            System.out.println(fruit);
        }
    }
}