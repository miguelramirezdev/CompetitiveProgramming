#include <bits/stdc++.h>

using namespace std;


int main() {
    int t;
    cin >> t;

    while (t--) {
        int  x;
        cin >> x;
        int d = x / 11;
        int m = x % 11;
        if(d/10 >= m){
            cout << "YES" << endl;
        }else{
            cout << "NO" << endl;
        }
    }
    return 0;
}