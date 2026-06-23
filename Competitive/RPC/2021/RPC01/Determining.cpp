#include <iostream>
#include <map>
using namespace std;
const unsigned long long MOD=2147483647;

int main(int argc, char** argv) {
	map<unsigned long long, bool>M;
	unsigned long long int F[10009];
	F[0]=0, F[1]=1;
	M[0]=true;
	M[1]=true;
	for(int i=2;i<10001;i++){
		F[i]=(F[i-1]%MOD+F[i-2]%MOD)%MOD;
		M[F[i]]=true;
	}
	int q;
	cin>>q;
	while(q--){
		unsigned long long int a;
		cin>>a;
		if(M[a]){
		cout<<"YES"<<endl;
		}
		else{
			cout<<"NO"<<endl;
		}
	}
	return 0;
}
