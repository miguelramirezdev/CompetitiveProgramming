import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			String[] vec1 = line.split(" ");
			int[] vec = new int[2];
			vec[0] = Integer.valueOf(vec1[0]);
			vec[1] = Integer.valueOf(vec1[1]);

			if (vec[0] == 0 || vec[1] == 0)
				break;

			if (vec[0] > 0 && vec[1] > 0) {
				System.out.println("primeiro");
			} else if (vec[0] < 0 && vec[1] > 0) {
				System.out.println("segundo");
			} else if (vec[0] < 0 && vec[1] < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
		}
	}
}