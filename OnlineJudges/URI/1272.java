import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while (n-- != 0) {
			String aux = "";
			String s = in.nextLine();
			s = s.replace(".", " ");
			String vec[] = s.split(" ");
			for (int i = 0; i < vec.length; i++) {
				if (!vec[i].isEmpty()) {
					aux += String.valueOf(vec[i].charAt(0));
				}
			}
			System.out.println(aux);
		}
	}
}