import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a string 1");
		str1=scanner.next();
		System.out.println("please enter a string 2");
		str2=scanner.next();
		if(str1.equalsIgnoreCase(str2) == true ){
			System.out.println("The two strings are the same.");
		}
		else System.out.println("The two strings are not the same.");
	}

}
