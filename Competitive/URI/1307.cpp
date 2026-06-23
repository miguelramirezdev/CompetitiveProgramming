#include<bits/stdc++.h>

using namespace std;

int main() {

    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    int p = 1;
    while (n--) {
        string s1, s2;
        cin >> s1 >> s2;
        int a = stoi(s1, 0, 2);
        int b = stoi(s2, 0, 2);
        if (__gcd(a, b) > 1) {
            cout << "Pair #" << (p++) << ": All you need is love!" << "\n";
        } else {
            cout << "Pair #" << (p++) << ":" << " Love is not all you need!" << "\n";
        }

    }
    return 0;
}

