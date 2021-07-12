public class ChallengeOperators {
    public static void main(String[] args) {
        double val = 20d;
        double secVal = 80d;
        double result = (val+secVal)*100;
        System.out.println("Result = "+ result);
        double remainder = result % 40.00;
        System.out.println("The Remainder = " + remainder);
        boolean boo = (remainder == 0) ? true : false;
        System.out.println("Boolean Value = " + boo);

        if (boo != true) {
            System.out.println("Got some remainder");
        }
        else{
            System.out.println("The remainder is zero");
        }

    }
}
