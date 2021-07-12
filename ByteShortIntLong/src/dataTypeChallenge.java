public class dataTypeChallenge {
    public static void main(String[] args){
        int MinVal = Integer.MIN_VALUE; // occupies 32 bits
        System.out.println("Integer Minimum Value "+MinVal);

        int MaxVal = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value "+ MaxVal);

        System.out.println("Busted Min Num :" + (MinVal-1)); // underflow
        System.out.println("Busted Max Num :" + (MaxVal+1)); // overflow

        int MaxTest = 2_147_483_647; //using underscore for better readability
        System.out.println(MaxTest);

        byte ByteMin=Byte.MIN_VALUE; // occupies 8 bits
        byte ByteMax=Byte.MAX_VALUE;
        System.out.println("Byte Min Value "+ ByteMin);
        System.out.println("Byte Max Value "+ ByteMax);

        short ShortMin=Short.MIN_VALUE; // occupies 16 bits
        short ShortMax=Short.MAX_VALUE;
        System.out.println("Short Min Value "+ ShortMin);
        System.out.println("Short Max Value "+ ShortMax);

        long myLongVal=2_147_483_647_234L; // L-represents the long datatype, without L, java treats it as a INT datatype.
        long LongMin=Long.MIN_VALUE;
        long LongMax=Long.MAX_VALUE;
        System.out.println("Long Min Value "+ LongMin);
        System.out.println("Long Max Value "+ LongMax);
        System.out.println("My Long Value "+ myLongVal);
    }
}
