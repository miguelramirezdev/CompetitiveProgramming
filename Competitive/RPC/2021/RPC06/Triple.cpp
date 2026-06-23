#include <iostream>
#include <string.h>
#include <map>
using namespace std;
int main() {
    map<string,int>M;
    string s; cin >> s;
    int l = s.size(); int h = l/3;
    int idx = 0;
    string ans = "";
    int _max = 0;
    for(int i = 0 ; i < 3 ; i++){
        string ss = s.substr(idx,h);
        M[ss]++;
        if(M[ss]>_max){
            ans = ss;
            _max = M[ss];
        }
        idx += h;
    }
    cout << ans <<endl;
    return 0;
}
