import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class vision {

	static Set<Point> pts = new HashSet<>(2000);
	static Map<Point, Integer> diff = new HashMap<>(2000);

	public static void vector() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i)
			pts.add(new Point(in.nextInt(), in.nextInt()));
		for (Point p1 : pts)
			for (Point p2 : pts)
				if (p1 != p2) {
					Point pd = new Point(p1.x - p2.x, p1.y - p2.y);
					diff.put(pd, diff.getOrDefault(pd, 0) + 1);
				}
		int res = 0;
		for (Map.Entry<Point, Integer> me : diff.entrySet())
			if (me.getValue() >= n / 2)
				if (testVector(me.getKey()))
					++res;
		System.out.println(res);
	}

	static boolean testVector(Point pd) {
		for (Point p : pts)
			if (!pts.contains(new Point(p.x + pd.x, p.y + pd.y)) && !pts.contains(new Point(p.x - pd.x, p.y - pd.y)))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vector();
	}

}
