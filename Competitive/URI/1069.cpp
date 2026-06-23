#include <bits/stdc++.h>

using namespace std;

void solve(string str){

    int c = 0;
    stack<char> b;
    for (size_t i = 0; i < (int)str.length(); i++){
        if(str[i] =='<'){
            b.push(str[i]);
            continue;
        }else if(!b.empty() && str[i] == '>'){
            char x = b.top();
            if(x == '<'){
                b.pop();
                c++;
            }
        }
    }
    cout << c << "\n";
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    while(n--){
        string s;
        cin >> s;
        solve(s);
    }
    return 0;
}