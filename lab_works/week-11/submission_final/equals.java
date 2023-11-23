class Compare{
    public boolean compare_str(String str1,String str2){
        if(str1 == null || str2 == null){return false;}
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0; i < str1.length() ; i++){
            if  (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}


public class equals {
    public static void main(String[] args) {
        String str = new String("potato");
        String str1 = new String("potato     ");
        String str2 = new String("potat0");
        String str3 = new String("potato");
        String str4 = new String("Potato");
        String str5 = new String("POTATO");
        String str6 = new String("potato");


        Compare comparator = new Compare();

        System.out.println(str + " and "+str1+" are : "+comparator.compare_str(str, str1));
        System.out.println(str + " and "+str2+" are : "+comparator.compare_str(str, str2));
        System.out.println(str + " and "+str3+" are : "+comparator.compare_str(str, str3));
        System.out.println(str + " and "+str4+" are : "+comparator.compare_str(str, str4));
        System.out.println(str + " and "+str5+" are : "+comparator.compare_str(str, str5));
        System.out.println(str + " and "+str6+" are : "+comparator.compare_str(str, str));        
    }
}
