package com.company;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
    }

    static class Square extends Thread
    {
        int x;
        Square(int n)
        {
            x = n;
        }
        public void run()
        {
            int sqr = x * x;
            System.out.println("Square of " + x + " = " + sqr );
        }
    }

    static class Cube extends Thread
    {
        int x;
        Cube(int n)
        {
            x = n;
        }
        public void run()
        {
            int cub = x * x * x;
            System.out.println("Cube of " + x + " = " + cub );
        }
    }

    static class Number extends Thread
    {
        public void run()
        {
            Random random = new Random();
            for(int i =0; i<5; i++)
            {
                int randomInteger = random.nextInt(100);
                System.out.println("Random Integer generated : " + randomInteger);
                Square s = new Square(randomInteger);
                s.start();
                Cube c = new Cube(randomInteger);
                c.start();
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException ex)
                {
                    System.out.println(ex);
                }
            }
        }
    }
}
