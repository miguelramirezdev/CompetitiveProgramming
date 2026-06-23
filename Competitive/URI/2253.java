import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cadena = in.nextLine();
			int n = cadena.length();
			if (n < 6 || n > 32) {
				System.out.println("Senha invalida.");
			} else {
				int aux1 = 0, aux2 = 0, aux3 = 0;
				boolean bandera = false;
				for (int i = 0; i < cadena.length(); i++) {
					if (!(Character.isAlphabetic(cadena.charAt(i))) && !(Character.isDigit(cadena.charAt(i)))) {
						bandera = true;
						break;
					} else {
						if (Character.isUpperCase(cadena.charAt(i))) {
							aux1++;
						} else if (Character.isLowerCase(cadena.charAt(i))) {
							aux2++;
						} else if (Character.isDigit(cadena.charAt(i))) {
							aux3++;
						}
					}
				}
				if (bandera == true) {
					System.out.println("Senha invalida.");
				} else if (aux1 >= 1 && aux2 >= 1 && aux3 >= 1) {
					System.out.println("Senha valida.");
				} else {
					System.out.println("Senha invalida.");
				}
			}
		}
	}
}