package assignment2;

import java.util.Scanner;

public class ReplaceFirstAndLast {

	public static void main(String[] args) {
		//Hello World
		//dello WorlH
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter input: ");
		String obj = sc.nextLine();
		String output=replace(obj);
		System.out.println(output);
	}
	public static String replace(String obj) {
		StringBuilder sb=new StringBuilder(obj);
		char firstElement = obj.charAt(0);
		char lastElement = obj.charAt(obj.length()-1);
		
		//replacing first character with last index
		sb.setCharAt(0, lastElement);
		//replacing last character with first index
		sb.setCharAt(sb.length()-1,firstElement);
		return sb.toString();
	}
}
