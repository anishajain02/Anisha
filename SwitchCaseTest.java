package assignment1.operators;
public class SwitchCaseTest {
	public static void main(String[] args) {
		 char ch='A';
		 
		 switch(ch) {
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 case 'A':
		 case 'E':
		 case 'I':
		 case 'O':
		 case 'U':
			 System.out.println(ch + " is a vowel");
			 break;
	     default:System.out.println(ch + " is not a vowel");
		 }
		 }
	}