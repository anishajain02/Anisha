package assignment1.operators;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int num,sum=0,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num1=sc.nextInt();
        c = num1;
        while(num1>0)
        {
       	 r=num1%10;
       	 sum=(sum*10)+r;
       	 num1=num1/10;
        }if(c == sum)
       	 System.out.println("IT IS A PALINDROME NUMBER");
        else
       	 System.out.println("IT IS NOT A PALINDROME NUMBER");
	}
}