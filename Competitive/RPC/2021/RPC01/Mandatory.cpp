#include <iostream>
using namespace std;
#define ll unsigned long long int 
const ll mod = 2147483647;
const ll inv = 1789569706;

int main(int argc, char** argv) {
	int t; scanf("%d",&t);
	ll n, A[3];
	ll ans;
	while(t--){
		ans = inv;
		scanf("%llu",&n);
		A[0] = n;
		A[1] = n+1;
		A[2] = n+2;
		for(int i = 0; i < 3 ; i++){
			ans = ( (ans%mod) * (A[i]%mod) ) % mod;
		}
		printf("%llu\n",ans%mod);
	}
	return 0;
}
