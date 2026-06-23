#include <iostream>
#include <bitset>
#include <vector>
using namespace std;
int n,k;
vector<string>Answers;
const int N = 10;
int score(string s1,string s2){
	int c = 0 ;
	for(int i=0;i<k;i++){
		if(s1[i]==s2[i]){
			c++;
		}
	}
	return c;
}
string convert(string s){
	string ans = "";
	for(int i=0;i<k;i++){
		if(s[i]=='1'){
			ans+='T';
		}
		else{
			ans+='F';
		}
	}
	return ans;
}
void solve(){
	
   	int a[n] = {10,20,30}; 
   	int ans = 0;
   	int u =1;
   	for(int mask = 0; mask < (1 << k); ++mask) { // cada posible confi
   		int notabaja = k;
    	bitset<N> b;
    	b = mask;
    	string ss = b.to_string();
    	string resp = ss.substr(N-k,k); // respuesta del profe
    	resp = convert(resp);
    //	cout<<u<<" * "<<resp<<endl;
    	for(string sx : Answers){
    		notabaja = min(notabaja,score(resp,sx));
		}
      	ans = max(ans,notabaja);
      	u++;
  	}
  	cout<<ans<<endl;
}
int main() {
	cin>>n>>k;
	for(int i=0;i<n;i++){
		string s; cin>>s;
		Answers.push_back(s);
	}	
	solve();
	return 0;
}
