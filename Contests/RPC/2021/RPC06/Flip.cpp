#include <bits/stdc++.h>

using namespace std;
bitset<10000001> visited;

int main() {
    int t, s, n;
    cin >> t >> s >> n;


    while (n--) {
        int a;
        cin >> a;
        visited[a] = 1;
    }
    int u = 0, d = s;
    for (int k = 0; k < t; k++) {
        if (visited[k]) {
            swap(u, d);
        }
        if (u) {
		u--;
		 d++;
	}
    }
    cout << u << endl;
}


