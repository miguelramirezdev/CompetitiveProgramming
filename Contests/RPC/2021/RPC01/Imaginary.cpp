#include <iostream>
using namespace std;
#define ll long long int   

void solve(ll a,ll b){
	b=(b%4);
	if(b==0){
		cout<<a<<endl; return;
	}
	if(b==1){
		cout<<a<<"i"<<endl; return;
	}
	if(b==2){
		cout<<-a<<endl; return ;
	}
	if(b==3){
		cout<<-a<<"i"<<endl; return ;
	}
	
}
int main() {
	ll a,b;
	while(cin>>a>>b){
		if(a==0 && b==0){
			break;
		}
		else{
			solve(a,b);
		}
	}
	return 0;
}
