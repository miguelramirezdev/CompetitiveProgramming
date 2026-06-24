#include <bits/stdc++.h>

using namespace std;


int solveC(string str) {
    stack<char> brackets;
    int x = 0;
    for (int i = 0; i < (int) str.length(); ++i) {
        if (str[i] == '[') {
            brackets.push(str[i]);
            continue;
        }
        if (str[i] == ']' && !brackets.empty()) {
            char c = brackets.top();
            if (c == '[') {
                brackets.pop();
                x++;
            }
        }
    }
    return x;
}

int solveP(string str) {
    stack<char> brackets;
    int y = 0;
    for (int i = 0; i < (int) str.length(); ++i) {
        if (str[i] == '(') {
            brackets.push(str[i]);
            continue;
        }
        if (str[i] == ')' && !brackets.empty()) {
            char c = brackets.top();
            if (c == '(') {
                brackets.pop();
                y++;
            }
        }
    }
    return y;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    while (n--) {
        string s;
        cin >> s;
        int p = solveP(s);
        int c = solveC(s);
        cout << (p + c) << "\n";
    }
    return 0;
}


