#include <iostream>
#include <math.h>
#include <algorithm>

using namespace std;
int main(int argc, char** argv) {
	int n; cin >> n;
	double A[n];
	for(int i = 0 ; i < n;i++){
		cin >> A[i];
	}
	sort(A,A+n);
	int pot = 1;
	double ans = 0;
	for(int i = n-1 ; i >=0 ;i--){
		ans += (A[i]/pow(2,pot));
		pot ++;
	}
	printf("%.7lf\n",ans);
	return 0;
}
