
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bill {

static final int BEER = 42;
	
	StringTokenizer st = new StringTokenizer("");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		new bill().run();
	}

	String s;
	void run() throws Exception {
		int sum = 0;
		while ((s = input.readLine()) != null) {
			if (s.isEmpty()) continue;
			int price = parsePrice();
			int cnt = 0;
			for (char c : s.toCharArray())
				if (c == '|') ++cnt;
			sum += price * (cnt == 0 ? 1 : cnt);
		}
		System.out.println((sum+9)/10*10 + ",-");
	}
	
	int parsePrice() {
		int idx = s.indexOf(',');
		if (idx < 0) return BEER;
		int price = Integer.parseInt(s.substring(0, idx));
		s = s.substring(idx+2);
		return price;
	}
}
