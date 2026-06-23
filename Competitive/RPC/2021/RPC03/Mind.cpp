#include <iostream>
#include <queue>
using namespace std;

int main() {
	int n;
	cin>>n;
	string S ="ABCDEFGH";
	queue<int> A [10] ;
	
	int total = 0;
	for(int i=0;i<n;i++){
		int t; cin>>t; // el i-semio jugador tiene t cartas
		for(int j=0;j<t;j++){
			int x; cin>>x;
			A[i].push(x);
		}
		total += t;
	}
	
	string ans="";
	for(int i=0;i<total;i++){ // iterar el total de cartas
		int menor = 9999999,idx=0;
		for(int j=0;j<n;j++){
			if(A[j].size()>0){
				int u  = A[j].front();
				//cout<<"primer: "<<u<<endl;
				if(u<menor){
					menor = u;
					idx = j;
				}
			}
		}
		menor = 9999;
		ans+=S[idx];
		A[idx].pop();
	}
	cout<<ans<<endl;
	return 0;
}
