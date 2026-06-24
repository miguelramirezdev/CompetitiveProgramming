#include <bits/stdc++.h>

using namespace std;

int degree = 0;
string s;

int fun(string x) {
    int res = 0;
    for (char i : x) {
        res += int(i - 48);
    }
    degree++;
    if (res < 10) {
        if (res == 9) {
            cout << s << " is a multiple of 9 and has 9-degree " << degree << "." << "\n";

        } else {
            cout << s << " is not a multiple of 9." << "\n";
        }
        return 0;
    }
    return fun(to_string(res));
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    while (cin >> s) {
        if (s == "0") {
            break;
        }
        fun(s);
        degree = 0;
        s = "";
    }
}