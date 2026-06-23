#include <iostream>
#include <math.h>
using namespace std;
typedef long long ll;
const int N=1000006;
ll A[N];
int main() {
	ll S=1;
	for(ll i=1;i<1000001;i++){
		A[i]=A[i-1]+S;
		S+=(i+1);
	}
	int q; scanf("%d",&q);
	int y;
	while(q--){
		scanf("%d",&y);
		printf("%llu\n",A[y]);
	}
	return 0;
}
