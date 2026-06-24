import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class mugs {

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		new mugs().run();
	}

	static final int[] BITS = new int[27];
	static {
		for (int i = 0; i < 26; ++i)
			BITS[i] = 1 << i;
		BITS[26] = 0;
	}
	Map<Integer, Integer> first = new HashMap<>(100000);
	int pos, state, best = 0;

	void run() throws Exception {
		input.readLine();
		first.put(state = 0, pos = 0);
		for (char c : input.readLine().toCharArray()) {
			first.putIfAbsent(state ^= (1 << (c - 'a')), ++pos);
			for (int b : BITS) {
				Integer prev = first.get(state ^ b);
				if (prev != null && pos - prev > best) {
					best = pos - prev;
				}
			}
		}
		System.out.println(best);
	}
}
