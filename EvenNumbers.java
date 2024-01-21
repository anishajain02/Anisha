package assignment1.operators;

public class EvenNumbers {

	public static void main(String[] args) {
		even();
	}

	public static void even() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {

				System.out.println(i);
			}
		}
	}

}
