import java.util.Scanner;


public class PracticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers to multiply.");
		
		 int n1, n2;
		 
		 @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		 n1 = keyboard.nextInt();
		 n2 = keyboard.nextInt();
		
		System.out.println("The product is");
	    System.out.println(n1 * n2);
	}

}
