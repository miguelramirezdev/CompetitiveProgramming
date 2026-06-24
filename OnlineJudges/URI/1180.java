import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a =in.nextInt();
		int aux=0; int y=0;int q=0;
		int vec [] = new int [a];
		int v [] = new int [a];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=in.nextInt();
			v[i]=vec[i];
		}
		Arrays.sort(vec);
		y= vec[0];
		for (int i = 0; i < v.length; i++) {
			if (y==v[i])
			{
				q=i;
			}
		}
		System.out.println("Menor valor: "+vec[0]);
		System.out.println("Posicao: "+q);
		
	}
}