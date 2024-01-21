package assignment2;

import java.util.Scanner;

public class RemoveSmallx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.next();
		System.out.println(RemoveSmallx.remove(input));
	}
	public static String remove(String input) {
		StringBuilder obj=new StringBuilder();
		StringBuilder xx= new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='x') {
				xx.append(input.charAt(i));
			}else {
				obj.append(input.charAt(i));
			}
		}
				obj.append(xx);
		return obj.toString();
	}
}