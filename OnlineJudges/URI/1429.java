import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int f[] = new int[6];
		f[5] = 120;
		f[4] = 24;
		f[3] = 6;
		f[2] = 2;
		f[1] = 1;
		f[0] = 1;
		while (in.hasNext()) {
			String n = in.next();
			if (n.equals("0")) {
				break;
			}
			char vec[];
			vec = (n).toCharArray();
			int resul = 0;
			int x = 0;
			for (int i = vec.length; i >= 1; i--) {
				resul += Character.getNumericValue(vec[x]) * f[i];
				x++;
			}
			System.out.println(resul);
		}
	}
}
