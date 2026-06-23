import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.next(), b = in.next(), c = in.next();
		if (a.equals("vertebrado")) {
			if (b.equals("ave")) {
				if (c.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (c.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (b.equals("inseto")) {
				if (c.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (c.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
	}
}
