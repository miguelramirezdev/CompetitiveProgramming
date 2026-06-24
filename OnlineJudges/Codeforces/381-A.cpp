#include <bits/stdc++.h>
using namespace std;

void solve (vector<int> cards) {
	int l = 0, r = cards.size() - 1;
	int sereja = 0, dima = 0, pick = 0;
	bool turn = 0;
	while (l <= r) {
		if (cards[l] > cards[r]) {
			pick = cards[l];
			l++;
		}else {
			pick = cards[r];
			r--;
		}
		if (!turn) {
			sereja += pick;
		}else {
			dima += pick;
		}
		turn = !turn;
	}
	cout << sereja << " " << dima << endl;
}


int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

    int n; cin >> n;
	vector<int> a(n);
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	solve(a);
}
