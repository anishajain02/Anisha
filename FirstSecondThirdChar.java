package assignment2;

import java.util.Scanner;
//anisha jain global=AAO
public class FirstSecondThirdChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String obj= sc.nextLine();
		String output=firstSecond(obj);
		System.out.println(firstSecond(obj));
	}
	public static String firstSecond(String obj) {
		StringBuilder sb= new StringBuilder();
		String[] arr=obj.split("\\s+");
		for(int i=0;i<arr.length;i++) {
			String abc=arr[i];
			sb.append(arr[i].charAt(i));
		}return sb.toString().toUpperCase();	
	}
}