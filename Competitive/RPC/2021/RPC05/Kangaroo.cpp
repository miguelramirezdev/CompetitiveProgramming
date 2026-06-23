#include <iostream>
#include <vector>
using namespace std;
vector<int>K;
int d(int a,int b){
	return (a-b)*(a-b);
}
int F(int x,int y){
	int sum = 0 ;
	for(int i = 0 ; i < K.size();i++){
		sum += min(d(K[i],K[x]), d(K[i],K[y]));
	}
	return sum;
}
void solve(){
	int ans = 200000000;
	for(int i = 0 ; i<K.size();i++){
		for(int j =0 ; j < K.size(); j++){
			ans = min(ans,F(i,j));
		}
	}
	cout << ans <<endl;
}
int main(int argc, char** argv) {
	int n; cin >> n;
	while(n--){
		int x; cin >> x;
		K.push_back(x);
	}
	solve();
	return 0;
}
