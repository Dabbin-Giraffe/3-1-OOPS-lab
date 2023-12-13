import java.util.ArrayList;
import java.util.List;

class NumberCalculator{
    int[] numbers;
    public NumberCalculator(int[] numbers){
        this.numbers = numbers;
    }
    public float calculateAverage(){
        int sum = 0;
        for(int num:this.numbers){
            sum+=num;
        }
        return (float) sum/this.numbers.length;
    }
}

public class calc {
    public static void main(String args[]){
    NumberCalculator thing = new NumberCalculator(new int[]{1,2,3,4,5,6});
    System.out.println(thing.calculateAverage());
    }
}
