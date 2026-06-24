import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cadena = in.next();
			cadena = cadena.replaceAll("\\+", "@").replaceAll("=", "@");
			String vec[] = cadena.split("@");
			if (vec[0] != "R" && vec[1] != "L" && vec[2].equals("J")) {
				System.out.println(Integer.parseInt(vec[0]) + Integer.parseInt(vec[1]));
			} else if (vec[0] != "R" && vec[1].equals("L") && vec[2] != "J") {
				System.out.println(Integer.parseInt(vec[2]) - Integer.parseInt(vec[0]));
			} else {
				System.out.println(Integer.parseInt(vec[2]) - Integer.parseInt(vec[1]));
			}
		}
	}
}   