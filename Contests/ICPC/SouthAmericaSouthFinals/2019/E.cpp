#include<bits/stdc++.h>
typedef long long int ll;
typedef long double ld;
#define pii pair <ll,ll>
#define pb push_back
#define vi vector<ll>
#define vii vector<pii>
#define mp make_pair
#define F first
#define S second
#define B begin()
#define E end()
#define INF 1e18
#define MOD 1e9 + 7
using namespace std;

int main ()
{
    string b;
    cin>>b;
    int s;
    int n = b.length();
    cin>>s;
    vi v;
    ll c1=0,c2=0;
    for(int i = 0; i < n; i++){
        if(b[i]=='E') c1++;
        else c2++;
    }
    if(c1 == n){
        cout<<(c1*s)<<"\n";
        return 0;
    }
    else if(c2 == n){
        cout<<"0\n";
        return 0;
    }
    for(int i = 0; i < n+s-1; i++){
        if(b[i%n]=='E') v.pb(i);
    }
    if(s == 1){
        cout<<(v.size())<<"\n";
        return 0;
    }
    ll ans = 0;
    for(int i = 0; i < n; i++){
        if(b[i]=='E') ans+=s;
        else{
            int k = lower_bound(v.B,v.E,i)-v.B;
            k = v[k];
            if(abs(i-k)<s){
                ans+=(s-abs(i-k));
            }
        }
    }
    cout<<ans<<"\n";
    return 0;
}