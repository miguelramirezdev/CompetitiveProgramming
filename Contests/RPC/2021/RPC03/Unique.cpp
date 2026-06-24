#include <iostream>
#include <set>
using namespace std;
#define ll long long int
int main(void) {
    int n;
    cin >> n;
	int v[n];
	for(int i=0;i<n;i++){
		cin>>v[i];
	}
    ll ans = 0;
	int r = 0;
	set<int>s; 
    for (int i=0; i<n; i++) {
		while(s.count(v[i])== 1){
			s.erase(v[r]);
			r++;
		}
		s.insert(v[i]);
		ans+=(i-r+1);
    }
	cout<<ans<<endl;
    return 0;
}
