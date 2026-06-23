#include <bits/stdc++.h>
using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
    int x = m-n;
	string cad1, cad2;
    string aux(x,' ');
	cin >> cad1 >> cad2;
	aux += cad1;
	for (int i = x-1; i >= 0; i--) {
		aux[i] = 'a' + (cad2[i+n]-aux[i+n]+26)%26;
	}
	cout << aux << endl;
}
