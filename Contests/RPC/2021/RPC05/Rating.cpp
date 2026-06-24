#include <iostream>
using namespace std;
int n,k;
int main() {
	cin >> n >> k;
	double _max = 0 , _min = 0;
	for(int i  = 0 ; i < k ; i++){
		double x; cin >> x;
		_max += x; _min += x;
	}
	for(int i = 0 ; i < n-k ; i++){
		_max += 3;
		_min -= 3;
	}
	printf("%.6lf %.6lf\n",_min/n,_max/n);
	
	return 0;
}
