import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a integer");
		a = scanner.nextInt();
		switch (a) {
		case (1):
			System.out.println("The integer is one.");
			break;

		case (2):
			System.out.println("The integer is two.");
			break;

		case (3):
			System.out.println("The integer is three.");
			break;

		case (4):
			System.out.println("The integer is four.");
			break;

		case (5):
			System.out.println("The integer is five.");
			break;

		case (6):
			System.out.println("The integer is six.");
			break;

		case (7):
			System.out.println("The integer is seven.");
			break;

		case (8):
			System.out.println("The integer is eight.");
			break;

		case (9):
			System.out.println("The integer is nine.");
			break;

		default:
			System.out.println("Other");
			break;
		}

	}

}