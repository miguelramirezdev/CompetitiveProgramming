#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    int a = 0, b = 0, c = 0;
    int mod = 1000000007;
    while (n--) {
        int m;
        cin >> m;
        if (m == 1) {
            a++;
        } else if (m == 2) {
            b = 2 * b + a;
            b %= mod;
        } else {
            c += b;
            c %= mod;
        }
    }
    cout << c << "\n";
    return 0;
}