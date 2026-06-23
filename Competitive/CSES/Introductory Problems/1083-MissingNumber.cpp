#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main(int argc, char** argv) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);	
	ll n, sum = 0;
	cin >> n;
	for (int i = 0; i < n-1; i++){

		int m ; cin >> m;
		sum += m;
	}
	cout << n * (n+1)/2 - sum << "\n";	
	return 0;
}
