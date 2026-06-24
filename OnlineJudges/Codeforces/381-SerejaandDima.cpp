#include <bits/stdc++.h>
using namespace  std;
 
int main() {
 
    int n;
    cin >> n ;
    int p [n];
 
    for (int i = 0; i < n; ++i) {
        cin >> p[i] ;
    }
    int i = 0, j = n-1, temp, c = 0;
    int sereja = 0, dina= 0;
 
    while (i <= j){
        if(p[i] >= p[j]){
            temp = p [i];
            i++;
        }else{
            temp = p[j];
            j--;
        }if(c % 2 == 0){
            sereja += temp;
        }else{
            dina += temp;
        }
        c++;
    }
    cout << sereja << " " << dina << "\n";
}