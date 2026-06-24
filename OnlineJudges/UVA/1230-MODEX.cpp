#include <bits/stdc++.h>
using namespace std;

long long binpow(long long a, long long b, long long m) {
    a %= m;
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
    }
    return res;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long long x, y, n;
    int c;
    cin >> c;
    while (c--){
        cin >> x >> y >> n;
        cout << binpow(x, y, n) << "\n";
    }
    return 0; 
}