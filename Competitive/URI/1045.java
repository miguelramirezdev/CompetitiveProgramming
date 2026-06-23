import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double vec[] = new double[3];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = in.nextDouble();
		}
		Arrays.sort(vec);
		if (vec[2] >= (vec[1] + vec[0])) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(vec[2], 2) == (Math.pow(vec[1], 2) + Math.pow(vec[0], 2))) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (Math.pow(vec[2], 2) > (Math.pow(vec[1], 2) + Math.pow(vec[0], 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (vec[2] == vec[1] && vec[1] == vec[0]) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (((vec[2] == vec[1] && vec[2] != vec[0])) || ((vec[1] == vec[0] && vec[1] != vec[2]))
					|| ((vec[0] == vec[2] && vec[0] != vec[1]))) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}