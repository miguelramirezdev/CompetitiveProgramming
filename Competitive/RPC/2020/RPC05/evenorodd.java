
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if (N % 4 == 0)
			System.out.println("Even");
		else if (N % 2 == 0)
			System.out.println("Odd");
		else
			System.out.println("Either");
	}

}
