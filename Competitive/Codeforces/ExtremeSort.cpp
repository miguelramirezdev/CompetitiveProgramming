#include <bits/stdc++.h>

using namespace  std;
int main(){
    int n ;
    cin >> n ;
    n -=1;
    int aux;
    cin >> aux;
    bool band = true;
    while (n--){
        int a;
        cin >> a ;
        if(a < aux){
            cout << "no" << endl;
            band = false;
            break;
        }
        aux = a ;
    }
    if(band){
        cout << "yes" << endl;
    }
    return 0;
}