#include <iostream>
#include <vector>
using namespace std;
const int N = 2e5 + 9;
const int inf = 1e9 + 9;
int n;
struct Campament{
	int padre; // 0 -> root
	int capacity;
	int water;
}VC[N];
void solve(){
	vector<int>dp(N,0); // guardar el minimo de agua
	dp[0] = VC[0].capacity; // root,valor inicial del agua
	int _min = dp[0]; // minimizar la maxima presa
	for(int i = 1 ; i<=n ; i++){
		int state = 0;
		int prec = dp[VC[i].padre] - VC[i].capacity;
		// cout <<"*" << prec <<endl;
		if(prec>state){
			state = prec;
		}
		dp[i] = VC[i].capacity - VC[i].water + state;
		_min = min(_min,dp[i]);
	}
	cout << _min << endl;
}
int main() {
	 cin >> n;
	int x; cin >> VC[0].capacity;
	for(int i = 1 ; i <= n ; i++){
		cin >> VC[i].padre >> VC[i].capacity >> VC[i].water;
	}
	solve();
	return 0;
}
