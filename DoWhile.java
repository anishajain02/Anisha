package assignment1.operators;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int a1=0,a2=1;
		System.out.print(a1+" "+a2+" ");
		do {
			int next=a1+a2;
			System.out.print(next+" ");
			a1=a2;
			a2=next;
			count++;
		}while(count<8);
	}
}
