#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {

	int n, p;
	cin >> n >> p;
	vector<int> t(n);
	vector<int> a(n, 0);
	for(int i = 0; i < n; i++){
		cin >> t[i];
	}
	int start = n;
	for(int i=n - 1;i>=0;i--) {
		if(t[i] != 0) {
			start = i;
			break;
		}
	}
	if(start == n) {
		for(int i = 0; i < n; i++){
			cout<<a[i]<<endl;
		}
		return 0;
	}

	int pid  = 1;
	a[start] = pid;
	for(int i=start-1;i>=0;i--) {
		if(t[i]>t[i+1]) pid++;
		a[i] = pid;
	}
	if(a[0] == p) {
		for(int i=0;i<n;i++) {
			cout<<a[i]<<endl;
		}
	} 
	else{
		cout<<"ambiguous"<<endl;
	}

	return 0;
}
