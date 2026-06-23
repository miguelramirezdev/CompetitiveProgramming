import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Double [] vec = new Double [100];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=in.nextDouble();
		}
		for (int i = 0; i < vec.length; i++) {
			if ( vec[i]<=10)
			{
				System.out.println("A["+i+"] "+"= "+ vec[i]);
			}
		}
	}
}