import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while (in.hasNext()) {
			int a= in.nextInt();
			String s1=in.next();
			int b= in.nextInt();
			String s2=in.next();
			int c= in.nextInt();
			String s3=in.next();
			int d= in.nextInt();
			if(s2.equals("+"))
			{
				int abajo = b*d;
				int arriba = (a*(abajo/b)+(c*(abajo/d)));
				int gcd = Euclides(arriba,abajo);
				System.out.println(arriba+"/"+abajo+" = "+(arriba/gcd)+"/"+(abajo/gcd));
			}
			else if(s2.equals("-"))
			{
				int abajo = b*d;
				int arriba = (a*(abajo/b)-(c*(abajo/d)));
				int gcd = Euclides(Math.abs(arriba),abajo);
				System.out.println(arriba+"/"+abajo+" = "+(arriba/gcd)+"/"+(abajo/gcd));
			}
			else if(s2.equals("*"))
			{
				int abajo = b*d;
				int arriba = a*c;
				int gcd = Euclides(arriba,abajo);
				System.out.println(arriba+"/"+abajo+" = "+(arriba/gcd)+"/"+(abajo/gcd));
			}
			else 
			{
				int abajo = b*c;
				int arriba = a*d;
				int gcd = Euclides(arriba,abajo);
				System.out.println(arriba+"/"+abajo+" = "+(arriba/gcd)+"/"+(abajo/gcd));
			}
			
		} 
			
			
	}
	
	public static int Euclides(int a, int b) 
	{
		int r=b;
		while (b> 0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}
	
}