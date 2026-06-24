#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    string line;
    cin >> line;
    stack<char> s;
    for (int i = (int) line.length() - 1; i >= 0; --i) {
        if (!s.empty() && line[i] == s.top()) {
            s.pop();
        } else {
            s.push(line[i]);
        }
    }
    string ans;
    while (!s.empty()) {
        ans += s.top();
        s.pop();
    }
    cout << ((ans.length() > 0) ? ans : "Empty String") << "\n";
    return 0;
}
