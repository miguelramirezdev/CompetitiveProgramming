import java.util.Scanner;

public class parity {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s="";
		String abc="abcdefghijklmnopqrstuvwxyz";
		
			s=in.next();
			int v[]=new int[26];
			for (int i = 0; i < s.length(); i++) {
				v[abc.indexOf(s.charAt(i))]++;
			}
			boolean even=true, odd=true;
			for (int i = 0; i < v.length; i++) {
				if (v[i]>0) {
					if (v[i]%2==0) {
						odd=false;
					}
					else {
						even=false;
					}
				}
				
			}
			if (even&&!odd) {
				System.out.println("0");
			}
			else if (!even&&odd) {
				System.out.println("1");
			}
			else {
				System.out.println("2");
			}
		
		

	}

}
