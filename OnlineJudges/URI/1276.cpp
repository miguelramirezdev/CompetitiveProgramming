#include <bits/stdc++.h>

using namespace std;


int main() {

    string line;
    while (getline(cin, line)) {
        vector<int> v(27, 0);

        for (int i = 0; i < line.length(); ++i) {
            if (line[i] != ' ') {
                int x = line[i] - 97;
                v[x]++;
            }
        }
        string aux = "", aux1 = "";
        bool ok = false;
        for (int j = 0; j < v.size(); ++j) {
            if (v[j] > 0) {
                ok = true;
                if (ok) {
                    aux += (char) (j + 97);
                }
            } else {
                ok = false;
                if (aux.length() == 1) {
                    aux1 = aux1 + aux[0] + ":" + aux[0] + ", ";
                } else if (aux.length() > 1) {
                    aux1 = aux1 + aux[0] + ":" + aux[aux.length() - 1] + ", ";
                }
                aux = "";
            }
        }
        cout << aux1.substr(0, aux1.length() - 2) << "\n";
    }
    return 0;
}