#include <bits/stdc++.h>

using namespace std;


void solve(string str) {

    stack<char> b;
    int cont = 0;
    for (int i = 0; i < (int) str.length(); ++i) {
        if (str[i] == '(') {
            b.push(str[i]);
            continue;
        } else if (!b.empty()) {
            char x = b.top();
            if (x == '(') {
                b.pop();
                cont += 2;
            }
        }
    }
    cout << cont << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    string s;
    cin >> s;
    solve(s);
    return 0;
}
