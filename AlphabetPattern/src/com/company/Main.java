package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printK();
    }
    static int height = 5;

    // Number of character width in each line
    static int width = (2 * height) - 1;

    // Function to find the absolute value
// of a number D
    static int abs(int d)
    {
        return d < 0 ? -1 * d : d;
    }
    static void printK()
    {
        int i, j, half = height / 2, dummy = half;
        for (i = 0; i < height; i++)
        {
            System.out.printf("*");
            for (j = 0; j <= half; j++)
            {
                if (j == abs(dummy))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            dummy--;
        }
    }
}
