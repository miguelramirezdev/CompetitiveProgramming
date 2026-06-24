import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int horas = 0, minutos = 0;
		int a = in.nextInt();
		int x = in.nextInt();
		int b = in.nextInt();
		int y = in.nextInt();
		horas = b - a;
		if (horas < 0) {
			horas = 24 + (b - a);
		}
		minutos = y - x;
		if (minutos < 0) {
			minutos = 60 + (y - x);
			horas--;
		}
		if (a == b && x == y) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		}
	}
}
