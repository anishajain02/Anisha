package assignment2;

import java.util.Scanner;

public class QuestionOneParse {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter any String ");
			String str=sc.next();
			System.out.println(QuestionOneParse.Parse(str));
			sc.close();
			
		}
		public static String Parse(String str) {
			StringBuilder abc=new StringBuilder();
			for(int i=str.length()-1;i>=0;i--) {
				abc.append(str.charAt(i)).append('-');
				
			}
			//delete from last -
			abc.deleteCharAt(abc.length()-1);
			return abc.toString();
	}
}
