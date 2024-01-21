package assignment2;

import java.util.Scanner;
//arr=[Hi ,how, are, you]
public class FindMaxLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentance");
		String obj=sc.nextLine();//.next will read only one word , .nextLine will read till the last String even if white space occurs
		System.out.println(max(obj));
		
	}
	public static String max(String obj) {
		//converting string to string array 
		//split the string and store it in the array
		String[] arr=obj.split("\\s+");// (.split breaks the string where whitespace occurs, \\s+ where multiple whitespaces occurs )
		//find max string
		String maxx="";// considering maxx string as empty
		for(int i=0;i<arr.length;i++) {
			String abc=arr[i];//at i=0, abc= hi
			if(abc.length()>maxx.length()) {
				maxx=abc;//abc=hi, maxx=2
			}
		}return maxx;
	}
}