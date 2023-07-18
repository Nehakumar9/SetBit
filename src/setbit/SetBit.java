package setbit;

import java.util.Scanner;

public class SetBit {
	 public static int setBit(int A,int B){
	        int val=0;
	        val=val|1<<A;
	        val=val|1<<B;
	        return val;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the A-th Bit :");
	        int A=sc.nextInt();
	        System.out.println("Enter the B-th Bit :");
	        int B=sc.nextInt();
	        int val=setBit(A,B);
	        System.out.println("the value is : "+val);
	    }
}
