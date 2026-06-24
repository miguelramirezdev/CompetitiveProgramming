#include <bits/stdc++.h>

using namespace std;

const int MAX_N = 1e6 + 10;

string P;
int n, m;

int b[MAX_N];

void kmpPreprocess() {                                  // call this first
    int i = 0, j = -1;
    b[0] = -1;                                          // starting values
    while (i < m) {                                     // pre-process P
        while ((j >= 0) && (P[i] != P[j]))j = b[j]; // different, reset j
        ++i;
        ++j;                                    // same, advance both
        b[i] = j;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cin >> P;
    m = (int) P.size();
    kmpPreprocess();
    int ans = b[m];
    bool band = 0;
    while (ans > 0) {
        for (int i = P.size() - 1; i > ans && !band; i--)
            band = b[i] >= ans;
        if (band)
            break;
        ans = b[ans];
    }
    cout << ((band) ? (P.substr(0, ans)) : "Just a legend ") << "\n";
    return 0;
}
