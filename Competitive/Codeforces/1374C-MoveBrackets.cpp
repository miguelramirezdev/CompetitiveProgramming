#include <bits/stdc++.h>

using namespace std;


int solveP(string str) {
    stack<char> brackets;
    int y = 0;
    for (int i = 0; i < (int) str.length(); ++i) {
        if (str[i] == '(') {
            brackets.push(str[i]);
            continue;
        }
        if (str[i] == ')') {
            if (!brackets.empty()) {
                char c = brackets.top();
                if (c == '(') {
                    brackets.pop();
                }
            } else {
                y++;
            }
        }
    }
    return y;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        string s;
        cin >> s;
        int p = solveP(s);
        cout << p << "\n";
    }
    return 0;
}