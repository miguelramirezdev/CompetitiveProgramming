import java.util.Scanner;

public class greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();

		char vec[] = s.toCharArray();
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] == 'e') {
				System.out.print(vec[i]);
			}
			System.out.print(vec[i]);
		}
		System.out.println();
	}

}
