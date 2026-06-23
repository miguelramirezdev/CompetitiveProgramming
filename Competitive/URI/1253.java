import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String alfabeto[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int a = in.nextInt();
		while (a-- > 0) {
			String aux = "";
			String cadena = in.next();
			int salto = in.nextInt();
			for (int i = 0; i < cadena.length(); i++) {
				String indice = String.valueOf(cadena.charAt(i));
				for (int j = 0; j < alfabeto.length; j++) {
					if (alfabeto[j].equals(indice)) {
						int u = j - (salto);
						if (u < 0) {
							u = Math.abs(u);
							int x = alfabeto.length - u;
							aux += alfabeto[x];
						} else {
							aux += alfabeto[u];
						}
					}
				}
			}
			System.out.println(aux);
		}
	}
}