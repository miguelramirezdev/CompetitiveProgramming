import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int c = 1;
		while (t-- > 0) {
			String a = in.next();
			String b = in.next();
			if (b.equals("bin")) {
				System.out.println("Case " + c + ":");
				c++;
				int n = Integer.parseInt(a, 2);
				System.out.println(n + " dec");
				System.out.println(Integer.toHexString(n) + " hex");
				System.out.println();
			} else if (b.equals("dec")) {
				System.out.println("Case " + c + ":");
				c++;
				Integer n = Integer.parseInt(a);
				System.out.println(Integer.toHexString(n) + " hex");
				System.out.println(Integer.toBinaryString(n) + " bin");
				System.out.println();
			} else {
				System.out.println("Case " + c + ":");
				c++;
				int n = Integer.parseInt(a, 16);
				System.out.println(n + " dec");
				System.out.println(Integer.toBinaryString(n) + " bin");
				System.out.println();
			}
		}
	}
}