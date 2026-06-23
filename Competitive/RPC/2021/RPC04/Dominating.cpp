#include <iostream>
#include <stack>
using namespace std;
int main() {
	int n; cin>>n;
	stack<int>S;
	int ans = 0;
	for(int i =0;i<n;i++){
		int x; cin>>x;
		int len = S.size();
		while(!S.empty() && S.top()<x){
			S.pop();
		}
		int m = S.size();
		//cout<<x<<" "<< min(len,len-m+1) <<endl;
		ans += min(len,len-m+1);
		S.push(x);
	}
	cout<<ans<<endl;
}
