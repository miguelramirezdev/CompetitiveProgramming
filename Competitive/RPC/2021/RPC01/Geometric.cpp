#include <iostream>
using namespace std;
#define ll long long
const int MOD=1e9;

ll modpow(int a,ll b){
	if(b==1) return a%MOD;
	if(b%2==0){
		ll k=modpow(a,b/2);
		return  ((k%MOD)*(k%MOD))%MOD;
	}
	return ((modpow(a,b-1)%MOD)*(a%MOD))%MOD;
}

void solve(){
	int k,q;
	scanf("%d %d",&k,&q);
	int A[k];
	for(int i=0;i<k;i++){
		scanf("%d",&A[i]);
		if(A[i]<0)
			A[i]=(A[i]+MOD)%MOD;
	}
	ll ans;
	ll a;
	while(q--){
		scanf("%llu",&a);
		ans=modpow(A[a%k], (a/k)+1 );
		printf("%llu\n",ans);
	}
}
int main() {
	int t;
	scanf("%d",&t);
	while(t--){
		solve();
	}
	return 0;
}
