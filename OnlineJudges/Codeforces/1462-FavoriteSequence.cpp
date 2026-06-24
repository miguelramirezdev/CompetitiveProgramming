#include <bits/stdc++.h>
using namespace std;

vector<int> solve (vector<int> integers) {
	int l = 0, r = integers.size() - 1;
	vector<int> sol;
	while (l <= r) {
		sol.push_back(integers[l]);
		if (l != r) {
			sol.push_back(integers[r]);
		}
		l++;
		r--;
	}
	return sol;
}


int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

	int t; cin >> t;
	while (t--) {
		int n; cin >> n;
		vector<int> a(n);
		for (int i = 0; i < n; i++) {
			cin >> a[i];
		}
		vector<int> sequence = solve(a);
		for (auto x: sequence) {
			cout << x << " ";
		}
		cout << endl;
	}
}
