#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> br;
        char t;
        for (int i = 0; i < (int) s.length(); ++i) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                br.push(s[i]);
                continue;
            } else {
                if (br.empty()) {
                    return false;
                }
                switch (s[i]) {
                    case ')':
                        t = br.top();
                        br.pop();
                        if (t != '(') { return false; }
                        break;
                    case ']' :
                        t = br.top();
                        br.pop();
                        if (t != '[') { return false; }
                        break;

                    case '}':
                        t = br.top();
                        br.pop();
                        if (t != '{') { return false; }
                        break;
                }
            }
        }
        return (br.empty());
    }
};

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    Solution sol;
    cout << (sol.isValid(")") ? "True" : "False") << "\n";

}