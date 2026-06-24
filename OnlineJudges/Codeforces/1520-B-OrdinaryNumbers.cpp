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

#define TC(t) while (t--)

void solve (){
    int n ;
    cin >> n ;
    LL x =1 , ans = 0;
    while(x <= n){
        FOR(i, 1 , 10){
            if(x*i <= n)
                ans++;
        }
        x *= 10;
        x++;
    }
    cout << ans << endl;
}

int main(){

    int t;
    cin >> t;
    TC(t){
        solve();
    }
    return 0;
}