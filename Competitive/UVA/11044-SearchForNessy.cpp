#include <bits/stdc++.h>
using namespace std;

#define TC(t) while (t--)


int main (){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    TC(t){
        int n , m ;
        cin >> n >> m;
        cout << (n/3)*(m/3)<< "\n";
    }
    return 0;
}