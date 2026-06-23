#include <iostream>
#include <queue>
using namespace std;
#define ii pair<int,int>
int n;
void solve(){
	int a;
	queue<ii>Q;
	for(int i=1;i<=n;i++){
		cin>>a;
		Q.push(ii(a,i));
	}
	int c=0;
	while(c<n-1){
		ii u = Q.front();
		int x = u.first;
		int cuantosborrar = (x%Q.size() )-1;
		if(cuantosborrar < 0){
			cuantosborrar=Q.size()-1;
		}
		for(int i=0;i<cuantosborrar;i++){
			Q.push(Q.front());
			Q.pop();
		}
		Q.pop();
		c++;
	}
	cout<<Q.front().second<<endl;
	
}
int main() {
	cin>>n;
	solve();
	return 0;
}
