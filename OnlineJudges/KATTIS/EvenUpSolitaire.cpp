#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    stack<int> cards;

    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        if (!cards.empty() && (cards.top() + x) % 2 == 0) {
            cards.pop();
        } else {
            cards.push(x);
        }
    }
    cout << (int) cards.size() << "\n";
    return 0;
}