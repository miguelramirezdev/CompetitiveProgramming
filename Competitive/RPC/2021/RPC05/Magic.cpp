#include <iostream>
using namespace std;
void solve(string s){
	int F[26]= {0};
	for(char c : s){
		F[c-'a']++;
		if(F[c-'a'] > 1){
			cout << 0 << endl;
			return;
		}
	}
	cout << 1 <<endl;
}
int main() {
	string s; cin >> s;
	solve(s);
	return 0;
}
