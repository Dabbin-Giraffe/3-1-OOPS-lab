class primitiveUse {

    // Primitive data types in java are : short,bool,integer,long,double,byte,char

    /* Making use of byte data type to return age */

    public static byte age_calc(short born, short end) {
        byte age = (byte) (end - born);
        return age;
    }

    /*
     * Making use of short data type to calculate grade total score of a student in
     * 5 subjects as the max score that can be scored in each subject is 100
     * short data type is perfect for this kind of calculation
     */

    public static short score_calc(short sub1, short sub2, short sub3, short sub4, short sub5) {
        int result = sub1 + sub2 + sub3 + sub4 + sub5;
        return (short) result;
    }

    /*
     * making use of long data type by returning how many seconds there are in given
     * number of days
     */

    public static long convert_seconds(int days) {
        long seconds = days * 24 * 60 * 60;
        return seconds;
    }

    /*
     * Making use of double by calculting the weight of compound given number of
     * carbon, oxygen,nitrogen,hydrogen atoms in its chemical formula
     */

    public static double weight(int carbon, int nitrogen, int oxygen, int hydrogen) {
        double C = 12.011;
        double H = 1.00797;
        double N = 14.0067;
        double O = 15.9994;

        double atm_weight = carbon * C + nitrogen * N + hydrogen * H + oxygen * O;
        return atm_weight;
    }

    /*
     * We are using boolean data type to tell whether a whole number is even or not
     */

    public static boolean even(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    /*
     * Making use of long data type to generate random 10 digit phone numbers
     */

    public static long phone_num() {
        long min = 100_000_000_0L;
        long max = 999_999_999_9L;

        long new_num = min + (long) (Math.random() * (max - min + 1));
        return new_num;
    }

    /*
     * Making use of float data type to calculate area of a circle for given radius
     */
    public static float area_calc(float radius) {
        float pi = 3.1415f;
        float area = pi * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        // Age method
        short born = 1999, current = 2023;
        byte age = age_calc(born, current);
        System.out.println("Age for person born in " + born + " is " + age + " years");

        // Score calculation
        short sub1 = 45, sub2 = 25, sub3 = 15, sub4 = 99, sub5 = 100;
        short total_score = score_calc(sub1, sub2, sub3, sub4, sub5);
        System.out.println("Total score is " + total_score);

        // seconds calc
        int days = 236345;
        long seconds = convert_seconds(days);
        System.out.println("Number of seconds in " + days + " days are " + seconds);

        // weight calculaton
        int carbon = 12, hydrogen = 43, oxygen = 23, nitrogen = 3;
        double weight = weight(carbon, nitrogen, oxygen, hydrogen);
        System.out.println("Weight of given compound is " + weight + " atomic units");

        // even or odd
        int num1 = 23;
        int num2 = 44;
        System.out.println(num1 + " is even : " + even(num1));
        System.out.println(num2 + " is even : " + even(num2));

        // generating random phone number

        long ph_num = phone_num();
        System.out.println("Your random generated phone number is " + ph_num + " Please do not call");

        // area calculation

        float radius = 34.6f;
        float area = area_calc(radius);
        System.out.println("The area of circle of radius " + radius + " is " + area);

    }
}
