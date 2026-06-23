#include<bits/stdc++.h>
#include <algorithm>
using namespace std;
#define SORT(v) sort(v.begin(),v.end())
#define REP(i, a, b) for (int i = a; i <= b; i++)
#define REP2(i, a, b) for (int i = a; i <= b; i++)
#define si(n) scanf("%d",&n)
#define sii(n, m) scanf("%d %d",&n,&m)
#define sl(n) scanf("%lld",&n)
#define sll(n, m) scanf("%lld %lld",&n,&m)
#define ss(cad) scanf("%s",cad)
#define PB push_back
#define MP make_pair
#define F first
#define S second
#define DBG(x) cerr<< #x << "=" << (x) <<endl
#define M 1000000007
#define N_MAX 1000010
typedef long long ll;
typedef vector<int> vi;
typedef vector<bool> vb;
typedef vector<ll> vll;
typedef pair<int, int> pi;
typedef pair<ll, ll> pll;
typedef vector<pi> vp;

int main() {
    int a,b;
    sii(a,b);
    cout << (a%b) << "\n";
    return 0;
}
