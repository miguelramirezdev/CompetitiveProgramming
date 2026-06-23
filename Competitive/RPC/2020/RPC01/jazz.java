import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jazz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] entrada1 = reader.readLine().split(" ");
		int n = Integer.parseInt(entrada1[0]);
		int c = Integer.parseInt(entrada1[1]);
		int segundos = -c * (n - 1);

		while (n-- > 0) {
			String[] entrada2 = reader.readLine().split(":");
			int m = Integer.parseInt(entrada2[0]);
			int ss = Integer.parseInt(entrada2[1]);
			segundos += 60 * m + ss;
		}
		int minutos = segundos / 60;
		segundos %= 60;
		int horas = minutos / 60;
		minutos %= 60;

		System.out.println((horas / 10) + "" + (horas % 10) + ":" + (minutos / 10) + "" + (minutos % 10) + ":"
				+ (segundos / 10) + "" + (segundos % 10));
	}

}
