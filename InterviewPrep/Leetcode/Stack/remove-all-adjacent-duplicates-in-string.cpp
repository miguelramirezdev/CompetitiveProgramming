#include <bits/stdc++.h>

using namespace std;


class Solution {
public:
    string removeDuplicates(string s) {
        stack<char> p;
        for (int i = 0; i < (int) s.length(); ++i) {
            if (!p.empty() && p.top() == s[i]) {
                p.pop();
            } else {
                p.push(s[i]);
            }
        }
        string aux = "";
        while (!p.empty()) {
            aux += p.top();
            p.pop();
        }
        string rev = string(aux.rbegin(),aux.rend());
       return rev;
    }
};


int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string x = "abbaca";
    Solution s;
    cout << (s.removeDuplicates(x))<< endl;
}   