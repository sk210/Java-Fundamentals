package Geekster.Week1;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
//		System.out.println("please enter first number");
//		int i = userinput.nextInt();
//		while(i>=0) {
//			System.out.println(i);
//			i = i-2;
//		}
		
		System.out.print("Enter your balance: ");
		long balance = userinput.nextLong();
		System.out.println("your balance is: " + balance);
		
		

	}

}
