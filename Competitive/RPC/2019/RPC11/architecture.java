import java.util.Arrays;
import java.util.Scanner;

public class architecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int vec1[]=new int[a];
		int vec2[]=new int[b];
		for (int i = 0; i < a; i++) {
			vec1[i]=in.nextInt();
			
		}
		for (int i = 0; i < b; i++) {
			vec2[i]=in.nextInt();
		}
		
		Arrays.sort(vec1);
		Arrays.sort(vec2);
		System.out.println((vec1[vec1.length-1]==vec2[vec2.length-1])?"possible":"impossible");
		//System.out.println(vec1[vec1.length-1]+" "+vec2[vec2.length-1]);
	}

}
