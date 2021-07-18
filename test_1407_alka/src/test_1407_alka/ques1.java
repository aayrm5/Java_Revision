package test_1407_alka;


public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		int counter = 0;
	    int numInt = 0;
	    t1.start();
	    do {
	       numInt = (int) Math.random();
	       System.out.println(t1.getName() + " and random number " + numInt);
	       if (numInt%2==0) {
	    	   t1.interrupt();
	    	   t2.start();
	    	   int sq = numInt*numInt;
	    	   System.out.println(t2.getName() + " and square " + sq);
	    	   t2.interrupt();
	       	}
	       else
	       {
	    	   t1.interrupt();
	    	   t3.start();
	    	   int cube = numInt*numInt*numInt;
	    	   System.out.println(t3.getName() + " and cube " + cube);
	    	   t3.interrupt();
	    	   
	       }
	       t1.start();
	       counter++;
	    } while(counter != 5);
	    
	}

}
