package assignment2;

import java.util.Scanner;

public class Abbreviation {
// ANISHA JAIN= AJ
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Input");
		String obj=sc.nextLine();
		System.out.println(abbreviation(obj));
	}
	public static String abbreviation(String obj) {
		StringBuilder sb= new StringBuilder();
		String[] arr=obj.split("\\s+");
		for(int i=0;i<arr.length;i++) {
			String abc=arr[i];
			sb.append(abc.charAt(0));
		}return sb.toString().toUpperCase();
	}
}