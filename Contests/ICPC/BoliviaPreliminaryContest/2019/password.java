import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0) {
			int t = in.nextInt();
			String cadena = in.next();
			boolean ban = true;
			int p = 1;
			int contra = 0;
			while (ban) {
				String fin = "";
				if (String.valueOf(contra).length() <= p) {
					for (int i = 0; i < p - String.valueOf(contra).length(); i++) {
						fin = fin + "0";
					}
					fin = fin + String.valueOf(contra);
					if (!cadena.contains(fin)) {
						System.out.println(fin.length() + " " + fin);
						ban = false;

					} else {
						if (cadena.length() == fin.length()) {
							System.out.println(fin.length() + " " + fin);
							break;
						}
						contra++;
					}
				} else {
					p++;
					contra = 0;
				}
			}	
		}
	}
}
