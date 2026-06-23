#include <iostream>

using namespace std;
#define ll long long

ll r,a1,S;
ll f(ll n){
	ll an=a1+(n-1)*r;
	ll sum= ((a1+an)*n)/2;
	return sum;
}
void solve(){

	ll x=1, y=(1000000009/r);
	if(a1>S){
		cout<<0<<endl; return;
	}
	while(x!=y){
		ll mid=(x+y)/2;
		if(f(mid)<=S){
			x=mid+1;
		}
		else{
			y=mid;
		}
	}
	printf("%d\n",x);
}

int main() {
	int n;
	scanf("%d",&n);
	while(n--){
	scanf("%llu %llu %llu",&r,&a1,&S);
	solve();
	}
	return 0;
}
