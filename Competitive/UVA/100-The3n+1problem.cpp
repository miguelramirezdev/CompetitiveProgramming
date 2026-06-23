#include <bits/stdc++.h>
using namespace std;


int main (){

    int i, j ;
    while (cin >> i >> j){
        int mav = max(i , j);
        int miw = min (i , j);
        while(mav != 1){
            if(mav % 2 == 1){
                mav *= 3;
                mav += 1;
            }else{
                mav /= 2;
            }
            cout << mav << "\n";
        }
    }
    
    return 0;
}