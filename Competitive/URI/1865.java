import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			String name = in.next();
			int x = in.nextInt();
			if (name.toUpperCase().equals("THOR")) {
				System.out.println("Y");
			}else{
				System.out.println("N"); 
			}
		}
	}
}
