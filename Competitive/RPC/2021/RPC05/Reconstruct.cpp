#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int n; cin >> n;
	int A[n+1] = {0};
	int R[n+1];
	for(int i = 1; i <= n ; i++){
		int x; cin >> x;
		R[i] = x;
		A[i] = A[i-1] + x;
	}
	bool posible = 0;
	int ans ;
	for(int i = 1; i <=n ; i++){
		int num = R[i];
		int sum1 = A[i-1];
		int sum2 = A[n] - A[i];
		if(num == sum1 + sum2){
			posible = 1;
			ans = num;
		}
	}
	if(posible){
		cout << ans << endl;
	}
	else{
		cout << "BAD" <<endl;
	}
	return 0;
}
