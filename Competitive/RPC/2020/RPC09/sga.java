import java.util.*;

public class sga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] c = new long[26];
        HashMap<String, Long>[] cadenasc = new HashMap[26];
        for (int i = 0; i < 26; i++) {
            cadenasc[i] = new HashMap<>();
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            String entrada = in.next();
            int x = entrada.charAt(0) - 'A';
            //System.out.println(x);
            long y = c[x];
            //System.out.println(y);
            long z = cadenasc[x].containsKey(entrada) ? cadenasc[x].get(entrada) : 0;
            //System.out.println(z);
            res += 2 * (y - z);
            c[x]++;
            cadenasc[x].put(entrada, z + 1);
            //System.out.println(cadenasc[x].put(entrada, z + 1));
        }
        System.out.println(res);
    }
}
