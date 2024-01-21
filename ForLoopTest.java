package assignment1.operators;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num2=sc.nextInt();
		for(i=1;i<=num2;i++) {
			fact=fact*i;
		}System.out.println("Factorial of "+num2+" is "+fact);
	}
}
