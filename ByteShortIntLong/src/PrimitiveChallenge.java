public class PrimitiveChallenge {
    public static void main(String[] args){

        byte myByteNum = 120;
        short myShortNum = 3213;
        int myIntNum = 12355;

        long myLongNum = 50000 + (10 * (myByteNum + myIntNum + myShortNum)); //can put 'L' after the numeric as well.
        System.out.println("The calculated Long num = " + myLongNum);

        short ShortTotal = (short) (1000 + 10 * (myByteNum + myShortNum + myIntNum));
        System.out.println("Printing Short Total = " + ShortTotal);
    }
}
