#include <iostream>
#include <stack>
using namespace std;
#define ii pair<int,int>
void solve(){
	int q;
	cin>>q;
	stack<ii>S;
	int maximo=-999999, minimo=9999999;
	while(q--){
		int cmd; cin>>cmd;
		if(cmd==1){
			int dato; cin>>dato;
			if(S.empty()){
				S.push(ii(dato,dato));
			}
			else{
				S.push(ii(max(dato,S.top().first),min(dato,S.top().second)));
			}
		}
		else if(cmd==2){
			if(!S.empty()){
				S.pop();
			}
		}
		else{
			if(S.empty()){
				cout<<"Empty!"<<endl;
			}
			else{
			
				cout<<S.top().first-S.top().second<<endl;
			}
		}
	}
}
int main() {
	int t;
	cin>>t;
	while(t--){
		solve();
	}
	return 0;
}
