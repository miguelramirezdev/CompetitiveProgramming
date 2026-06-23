import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int inicio = in.nextInt();
		int fin = in.nextInt();
		int aux = fin - inicio;
		if (aux < 0) {
			aux = 24 + (fin - inicio);
		}
		if (inicio == fin) {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", aux);
		}
	}
}
