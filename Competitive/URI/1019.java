import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int h = t / 3600;
		t = t - (h * 3600);
		int m = t / 60;
		t = t - (m * 60);
		System.out.println(h + ":" + m + ":" + t);
	}
}