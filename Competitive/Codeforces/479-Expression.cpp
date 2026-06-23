#include <bits/stdc++.h>
using namespace std;
 
 
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    int r = 0 ;
    r = max(r,(a+b+c));
    r = max(r,(a*(b+c)));
    r = max(r,(a*b*c));
    r = max(r,((a+b)*c));
    cout << r << "\n";
    return 0; 
}