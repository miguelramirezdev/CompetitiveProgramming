#include <bits/stdc++.h>

using namespace std;

int main() {
    string line1 = "", line2 = "";
    while (getline(cin, line1), getline(cin, line2)) {

        vector<int> frea(26, 0);
        vector<int> freb(26, 0);

        for (int i = 0; i < line1.length(); ++i) {
            frea[line1[i] - 97]++;
        }
        for (int i = 0; i < line2.length(); ++i) {
            freb[line2[i] - 97]++;
        }
        for (int j = 0; j < 26; ++j) {
            if (frea[j] > 0 && freb[j] > 0) {
                int m = min(frea[j], freb[j]);
                for (int i = 0; i < m; ++i) {
                    cout << (char) (j + 97);
                }
            }
        }
        cout << "\n";
    }

    return 0;
}