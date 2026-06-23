#include <bits/stdc++.h>
using namespace  std;

int main() {

    string x, y;
    cin >> x >>y ;
    int a = 0, b = 0;
    for (int i = 0; i < x.length() ; ++i) {
        if(x[i]=='S')
            a++;
    }
    for (int j = 0; j < y.length(); ++j) {
        if(y[j]=='S')
            b++;
    }
    int t = a *b ;
    for (int k = 0; k < t; ++k) {
        cout << "S(";
    }
    cout << "0";
    for (int l = 0; l < t; ++l) {
        cout << ")";
    }
    cout << "\n";

    return 0;

}
