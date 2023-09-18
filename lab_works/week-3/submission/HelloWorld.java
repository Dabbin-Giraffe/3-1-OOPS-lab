class HelloWorld {
    public static void main(String[] args) {
        char customerType = 'R';
        long iphonePrice = 70000;
        long macPrice = 130000;
        float discountPercent = 12.5f;
        byte macQuant = 70;
        short iphoneQuant = 250;
        boolean discount = false;
        int packagePrice = 1000;
        double overallPrice;
        if(customerType == 'R'){
            discount = true;
        }
        else{
            discount = false;
        }
        if(discount == true ){
            overallPrice = (macPrice * macQuant ) + (iphonePrice * iphoneQuant) ;
            overallPrice = overallPrice + packagePrice;
            overallPrice = overallPrice - overallPrice*(discountPercent/100);
            System.out.println(overallPrice);
        }else{
         overallPrice = (macPrice * macQuant ) + (iphonePrice * iphoneQuant) ;
            overallPrice = overallPrice + packagePrice;
            System.out.println(overallPrice);
            
        }
        
    }
}