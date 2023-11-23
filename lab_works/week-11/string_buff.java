public class string_buff{
    public static void main(String[] args) {
        StringBuffer buff1 = new StringBuffer("potato  ");
        StringBuffer buff2 = new StringBuffer("melon");

        buff1.append(buff2);

        int index = 7;

        String temp = "juice";
        
        System.out.println(buff1);
        System.out.println("After inserting '"+temp+"' at index "+index+" string is : "+buff1.insert(index, temp));
    }
}