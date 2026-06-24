#include <iostream>
#include <string.h>
using namespace std;

string tostring(int n){
	string ans = "";
	string NUMBER = "0123456789"; 
	while(n!=0){
		ans = NUMBER[n%10] + ans;
		n/=10;
	}
	return ans;
}
int main() {
	int n ; cin >> n;
	string s ; cin >> s;
	int idx = 0;
	for(int i = 1 ; i <= n; i ++){
		string x = tostring(i);
		if(x!=s.substr(idx,x.size())){
			cout << i << endl;
			return 0;
		}
		idx += x.size();
	}
	return 0;
}
