#include <iostream>
#include <bits/stdc++.h>

using namespace std;

typedef long long   ll;
typedef vector<int> vi;
const int N=1e4+10; // multipli

void solve(){
	ll v[20]={0}; //porcentaje
    int a, s;
    cin>>a>>s;
    ll x;
    for(int i=0; i<a; i++){
		cin>>v[i];
	}
    ll sum=accumulate(v, v + a, 0);
    sum*=100;
    for(int i=0; i<s; i++){
        ll cur=0;
        for(int j = 0; j < a; j++){
            cin>>x;
            cur+=x*v[j];
        }
        cur=cur*10000000/sum;
        ll cur2=cur;
        ll md=cur % 100000;
        cur/=100000;
        ll k=(cur / 5);
        if(k*5==cur && md==0){
            cout<<cur<<" SAME\n";
        }
		else{
            ll D = k*500000, U=(k+1)*500000;
            if(abs(D-cur2)<=abs(U-cur2))
                cout<<D/100000<<" DOWN"<<endl;
            else
                cout<<U/100000<<" UP"<<endl; //quita el 0 pario
        }
    }
}
int main(){
   	int t;
   	cin>>t;
   	while(t--){
   		solve();
   		cout<<endl;
	}
    return 0;
}
