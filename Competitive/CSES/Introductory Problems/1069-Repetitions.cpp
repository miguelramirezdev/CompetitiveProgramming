#include <bits/stdc++.h>
using namespace std;

int main(int argc, char** argv) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
	string s ;
	cin >> s ;
	int r = 1, m = 1;
	for (int i = 1; i < (int)s.length(); i++){
		if(s[i] == s [i-1]){
			r++;
			m = max(m,r);
		}
		else {
			r = 1 ;
		}
	}
	cout << m << "\n";
	return 0;
}
