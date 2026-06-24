import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String a = in.nextLine();
			for (int i = 0; i < a.length(); i++) {
				char x = a.charAt(i);
				if ((int) x >= 97 && (int) x <= 122) {
					if ((char) (x + 13) > 'z') {
						System.out.print((char) (x - 13));
					} else {
						System.out.print((char) (x + 13));
					}
				} else if (x >= 65 && x <= 90) {
					if ((char) (x + 13) > 'Z') {
						System.out.print((char) (x - 13));
					} else {
						System.out.print((char) (x + 13));
					}
				} else {
					System.out.print(x);
				}
			}
			System.out.println();
		}
	}
}