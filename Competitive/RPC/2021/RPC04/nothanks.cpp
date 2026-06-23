#include <iostream>
#include <bitset>
using namespace std;
const int N = 1e5;
#define ll long long int
int main() {
    int n;
    cin>>n;
    bitset<N>visited;
    int lim = -1;
    int a;
    while(n--){
        cin>>a;
        lim = max(lim,a);
        visited[a]=1;
    }
    ll c =0;
    for (int i =1; i<=lim+1; i++) {
        if (visited[i]==1 && visited[i-1]==0) {
    		c += i;
        }
    }
    cout<<c<<endl;
}

