#include<bits/stdc++.h>
#include <algorithm>

using namespace std;
#define SORT(v) sort(v.begin(),v.end())
#define REP(i, a, b) for (int i = a; i < b; i++)
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
    int x, y, n, t = 0;
    int vec[1001];
    sii(x, y);
    si(n);
    REP(i, 0, n) {
        si(vec[i]);
        if (vec[i] <= 1000) {
            t = vec[i] * x;
        } else {
            t = 1000 * x + (vec[i] - 1000) * y;
        }
        printf("%d %d\n", vec[i], t);
    }
    return 0;
}
