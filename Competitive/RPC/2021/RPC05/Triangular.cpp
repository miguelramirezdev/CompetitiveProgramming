#include <iostream>
#include <vector>
#include <algorithm>
#include <math.h>
using namespace std;
vector<int>A;
int lim;
bool test(int a,int b,int c){ // ver si el triangulo existe
	return a+b>c;
}
long long int pow(int a,int b){
	long long int p = 1;
	for(int i =0 ; i < b; i++){
		p*=a;
	}
	return p;
}
void solve(){
	long long int ans = 0,u=0;
	for(int i = 0 ; i<lim ; i++){
		for(int j = i+1 ; j < lim ; j++){
			int k = j+1;
			while(k<lim && test(A[i],A[j],A[k])){
				k++;
			}
			//cout << k << " " << j <<endl;
			ans += pow(2,k-j-1) -1 ;
		}
	}
	cout << ans << endl;
}
int main() {
	int n; cin >> n;
	lim = n;
	while(n--){
		int x; cin >> x;
		A.push_back(x);
	}
	sort(A.begin(),A.end());
	//for(int x : A){
	//	cout << x <<endl;
	//}
	solve();
	return 0;
}
