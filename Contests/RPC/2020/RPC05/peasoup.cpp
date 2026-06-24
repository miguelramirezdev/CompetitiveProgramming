#include <bits/stdc++.h>
using namespace std;

int main() {
	int N;
	cin >> N;
	for(int i = 0; i < N; i++) {
		int K;
		cin >> K;
		cin.ignore();
		string nombre1;
		getline(cin, nombre1);
		bool x = false, y = false;
		for(int i = 0; i < K; ++i) {
			string nombre2;
			getline(cin, nombre2);
			if (nombre2 == "pea soup")
                x = true;
			if (nombre2 == "pancakes")
                y = true;
		}
		if (x && y) {
			cout << nombre1 << endl;
			return 0;
		}
	}
	cout << "Anywhere is fine I guess" << endl;
}
