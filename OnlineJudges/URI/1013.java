import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x= Math.max(a, b);
		System.out.println(Math.max(x,c)+" eh o maior");
		

	}
}