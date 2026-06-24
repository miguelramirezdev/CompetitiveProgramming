

import java.util.Scanner;

public class baby {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s="";
		int c=1;
		boolean flag=true;
		while (n-->0) {
			s=in.next();
			if (Character.isDigit(s.charAt(0))) {
				if (c!=Integer.parseInt(s)) {
					flag=false;
					break;
				}
			}
			c++;
		}
		if (flag) {
			System.out.println("makes sense");
		}
		else {
			System.out.println("something is fishy");
		}

	}

}
