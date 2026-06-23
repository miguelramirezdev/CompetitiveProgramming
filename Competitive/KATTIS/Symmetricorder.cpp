#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    int cont = 1;
    while (cin >> t) {
        if (t == 0) {
            break;
        }
        stack<string> even;
        stack<string> odd;
        for (int i = 0; i < t; ++i) {
            string x;
            cin >> x;
            if (i % 2 == 0) {
                even.push(x);
            } else {
                odd.push(x);
            }
        }
        stack<string> aux;
        while (!even.empty()) {
            string xx = even.top();
            aux.push(xx);
            even.pop();
        }

        cout << "SET " << (cont++) << "\n";
        while (!aux.empty()) {
            cout << aux.top() << "\n";
            aux.pop();
        }
        while (!odd.empty()) {
            cout << odd.top() << "\n";
            odd.pop();
        }
    }
    return 0;
}
