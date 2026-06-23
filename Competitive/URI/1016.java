import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int t = (int) (d / ((90 / 60.0) - (60 / 60.0)));
		System.out.println(t + " minutos");
	}
}
