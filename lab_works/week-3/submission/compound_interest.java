class compound_interest{


public static double calc(double principal, double rate, int years, double compounded) {
        double amount = principal * Math.pow(1 + (rate / compounded), compounded * years);
        double compoundInterest = amount - principal;
        return compoundInterest;
}
public static void main(String[] args){

double principal = 1_000_000;
double rate = 0.03;
int years = 10;
double compounded = 12;

double compound = calc(principal,rate,years,compounded);

System.out.println("Compound Interest for principal of "+principal+", rate of "+rate*100+"%, number of years : "+years+" and compounded for "+compounded+" times is "+compound);

}

}