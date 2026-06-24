#include <bits/stdc++.h> // Include every standard library
using namespace std;

typedef long long LL;
typedef pair<int, int> pii;
typedef pair<LL, LL> pll;
typedef pair<string, string> pss;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<pii> vii;
typedef vector<LL> vl;
typedef vector<vl> vvl;

#define TC(t) while (t--)



void solve (){

    LL n;
    cin >> n;
    if(n % 2050 != 0){
        cout << "-1" << "\n";
    }else{
        n /= 2050;
        LL ans = 0 ;
        while (n){
            ans += n%10 ;
            n /= 10 ;
        }
        cout << ans << "\n";
    }
    
}

int main (){
    int T;
    cin >> T;
    TC(T){
        solve();
    }
    return 0;
}