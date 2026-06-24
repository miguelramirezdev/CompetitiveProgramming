#include <iostream>
#include <vector>
#include <algorithm>
#include <math.h>
using namespace std;
const double pi = acos(-1);
#define is pair<int,string>
#define dis pair<double,is>
vector<dis> Stk;
void solve(){

	bool pre = 0;
	
	for(int i = 0 ; i< Stk.size() - 1 ; i++){
			if(Stk[i].second.second == "cylinder" && Stk[i+1].second.second == "cube"){
				double r =  Stk[i].second.first;
				double l =  Stk[i+1].second.first ;
				l/=2;
				double h = l*sqrt(2);
				if(r>l){
					pre = 1;
				}
		 	}
		 	if(Stk[i].second.second == "cube" && Stk[i+1].second.second == "cylinder"){ // cubo arriba, cilindor abajo
				double r =  Stk[i+1].second.first;
				double l =  Stk[i].second.first ;
				l = l/2;
			//	cout << "? "<<l <<endl;
				double h = l*sqrt(2);
					//cout << "* " <<r << " "<<h <<endl;
				if(h>r){
					pre = 1;
				}
		 	}
	}
	if(pre){
		cout << "impossible" <<endl;
		return;
	}
	
	for(int i = 0 ; i< Stk.size() ; i++){
		cout << Stk[i].second.second <<" "<<Stk[i].second.first <<endl; // nombre , tamanio
	}
}
int main() {
	int n; cin >> n;
	while(n--){
		string s; double sz;
		cin >>s >> sz;
		dis A;
		if(s=="cube"){
			A.first = sz*sz;
			A.second.second = s;
			A.second.first = sz;
			Stk.push_back(A);
		}
		else{
			A.first = pi*sz*sz;
			A.second.first = sz;
			A.second.second = s;
			Stk.push_back(A);
		}
	}
	sort(Stk.begin(),Stk.end());
	solve();


	return 0;
}
