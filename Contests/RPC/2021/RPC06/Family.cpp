#include <iostream>
#include <vector>
#include <algorithm>
#include <set>
using namespace std;
vector<int> ANS;
void solve(int cas){
	int n; cin >> n;
	int n1 = n;
	vector<int> MAX(n);
	vector<int> P;
	
	while(n--){
		int x; cin >> x;
		P.push_back(x);
	}
	
	MAX[n1-1] = P[n1-1];
	for(int i = n1-2 ;i >=0 ; i--){ // maximos de izq a der
	
		MAX[i] = max(MAX[i+1],P[i]);
	}
	set<int> Prev;
	for(int i = 0 ;i < n1 ; i ++){
		Prev.insert(P[i]);
		set<int>::iterator it = Prev.upper_bound(P[i]) ; // posicion del mayor anterior
		if(it != Prev.end()){ // si existe
			int maxi = *it;
			if(maxi<MAX[i]){
				ANS.push_back(cas);
				return;
			}	
		}
	}
}
int main() {
	int n; cin >> n;
	int cas = 1;
	while(n--){
		solve(cas);
		cas++;
	}
	cout << ANS.size() <<endl;
	for(int x : ANS){
		cout  << x <<endl;
	}
	return 0;
}
