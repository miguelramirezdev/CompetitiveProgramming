import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = n / 365;
		int aux1 = n % 365;
		int aux2 = aux1 % 30;
		int m = aux1 / 30;
		int d = aux2 % 30;
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");
	}	
}
