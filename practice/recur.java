class Factorial{
    int result;
    int fact(int num){
        if (num == 1) return 1;
        this.result = this.fact(num-1)*num;
        return result;
    }
}

class recur{
    public static void main(String[] args){
        Factorial obj = new Factorial();
        System.out.println("The factorial of 3 is "+obj.fact(3));
    }
}