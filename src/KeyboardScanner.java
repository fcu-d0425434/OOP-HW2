import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a integer");
		a=scanner.nextInt();
		float b;
		System.out.println("please enter a float");
		b=scanner.nextFloat();
		String c;
		System.out.println("please enter a string");
		c=scanner.next();
		System.out.printf("HI "+ c + ",the multiplication of "+ a + " and " + b + " is " + "%1.2e",a*b);
	}

}
