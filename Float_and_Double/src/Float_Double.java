public class Float_Double {
    public static void main(String[] args){
        
        float myMinFloatVal=Float.MIN_VALUE;
        float myMaxFloatVal=Float.MAX_VALUE;
        System.out.println("Min Float Value = "+myMinFloatVal);
        System.out.println("Max Float Value = "+myMaxFloatVal);

        double myMinDoubleVal=Double.MIN_VALUE;
        double myMaxDoubleVal=Double.MAX_VALUE;
        System.out.println("Min Double Value = "+myMinDoubleVal);
        System.out.println("Max Double Value = "+myMaxDoubleVal);

        int myInt=5;
        float myFloat=5.25f; // 32 bits precision; use 'f' at the end to use it as a decimal num
        double myDouble=5.25; // 64 bits precision; default for a decimal number
        System.out.println("Int = "+myInt);
        System.out.println("Float = "+myFloat);
        System.out.println("Double = "+myDouble);

        int myInt2=5/3; // does not return the decimal values - result=1
        float myFloat2=5f/3f; //  medium decimal values - 1.6666666
        double myDouble2=5d/3d; // long decimal values - 1.6666666666666667; highly recommended.
        System.out.println("Int2 = "+myInt2);
        System.out.println("Float2 = "+myFloat2);
        System.out.println("Double2 = "+myDouble2);

    }
}
