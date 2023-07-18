package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int num=5;
		int i,fact=1;
		for (i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+ " is :" +fact);

	}

}
