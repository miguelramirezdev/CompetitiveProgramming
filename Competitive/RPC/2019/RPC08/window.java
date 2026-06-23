

import java.util.Scanner;

public class window {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
		int h=in.nextInt();
		int d=in.nextInt();
		int quitar=d*2;
		if (w-quitar<0||h-quitar<0) {
			System.out.println("0");
		}
		else {
			System.out.println((w-quitar)*(h-quitar));
		}

	}

}
