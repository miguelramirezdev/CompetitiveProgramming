import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = Integer.valueOf(in.readLine());
		while (n-- > 0) {
			int l = Integer.valueOf(in.readLine());
			int total = 0;
			for (int i = 0; i < l; i++) {
				String linea = in.readLine();
				for (int j = 0; j < linea.length(); j++) {
					int indice = alfa.indexOf(linea.charAt(j));
					total += indice;
					total += j;
					total += i;
				}
			}
			System.out.println(total);
		}
	}
}