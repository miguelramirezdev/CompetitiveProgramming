#include <bits/stdc++.h>
using namespace std;

void solve (int n, string s) {
	int l = 0, r = s.length() - 1;
	while (l <= r && s[l] != s[r]) {
		s.erase(s.begin() +  r);
		r--;
		s.erase(s.begin()+l);
		r--;
	}
	cout << s.length() << endl;
}


int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

	int t; cin >> t;
	while (t--) {
		int n; cin >> n;
		string s; cin >> s;
		solve(n, s);
	}
}
