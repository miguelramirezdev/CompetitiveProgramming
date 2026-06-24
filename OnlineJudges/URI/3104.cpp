#include <bits/stdc++.h>

using namespace std;


int mod(string num, int a) {
    int res = 0;
    for (int i = 0; i < num.length(); i++)
        res = (res * 10 + (int) num[i] - '0') % a;

    return res;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    string a;
    int b;
    cin >> a >> b;
    cout << mod(a, b) << "\n";
    return 0;
}
