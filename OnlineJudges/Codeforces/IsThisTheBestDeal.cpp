#include <bits/stdc++.h> // Include every standard library
using namespace std;


int main(){

    int p1, p2, p3;
    cin >> p1 >> p2 >> p3;
    int t = p1 + p2 + p3;
    int c = t / 500;
    if(t >= 500){
        cout << t - (c*100) <<"\n";
    }else{
        cout << t << "\n";
    }
    return 0;
}