import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cadena = in.next();
			int aux1 = 0;
			int tamanio = cadena.length();
			for (int x = 0; x < cadena.length(); x++) {
				for (int i = 0; i < aux1; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < tamanio - 1; i++) {
					System.out.print(cadena.charAt(i));
					System.out.print(" ");
				}
				System.out.print(cadena.charAt(tamanio - 1));
				System.out.println();
				tamanio--;
				aux1++;
			}
			System.out.println();
		}
	}
}
