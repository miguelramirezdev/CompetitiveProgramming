#include <bits/stdc++.h>
using namespace std;

int main (){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t, i = 1 ;
    cin >> t ;
    while(t--){
        vector <int> employes (3);
        for(auto &x : employes){
            cin >> x ;
        }
        sort(employes.begin(), employes.end());
        cout <<"Case "<< i <<": "<< employes[1] << "\n";
        i++;
    }
    return 0;
}