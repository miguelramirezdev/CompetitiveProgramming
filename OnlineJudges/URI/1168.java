import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cont = 0;
		while (n-- > 0) {
			String cad = in.next();
			for (int j = 0; j < cad.length(); j++) {
				if (cad.charAt(j) == '1') {
					cont += 2;
				} else if (cad.charAt(j) == '2' || cad.charAt(j) == '3' || cad.charAt(j) == '5') {
					cont += 5;
				} else if (cad.charAt(j) == '4') {
					cont += 4;
				} else if (cad.charAt(j) == '9' || cad.charAt(j) == '6' || cad.charAt(j) == '0') {
					cont += 6;
				} else if (cad.charAt(j) == '7') {
					cont += 3;
				} else if (cad.charAt(j) == '8') {
					cont += 7;
				}
			}
			System.out.println(cont + " leds");
			cont = 0;
		}
	}
}