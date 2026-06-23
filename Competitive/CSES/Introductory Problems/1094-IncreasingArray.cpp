#include <bits/stdc++.h>
 
using namespace std;
#define ll long long
 
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, aux;
    cin >> n;
    ll ans = 0;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        aux = max(x, aux);
        ans += aux - x;
    }
    cout << ans << "\n";
    return 0;
}