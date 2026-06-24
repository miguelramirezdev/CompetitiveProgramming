#include <bits/stdc++.h>

using namespace std;
set<string> vec;

bool verificar(string x) {
    if (!vec.count(x)) {
        return false;
    } else {
        return true;
    }
}

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;

    for (int i = 0; i < n; ++i) {
        string line;
        while (cin >> line && line != "->") {
            if (!verificar(line)) {
                cout << i + 1 << "\n";
                return 0;
            }
        }
        cin >> line;
        vec.insert(line);
    }
    cout << "correct" << "\n";
}