#include<bits/stdc++.h>
#include <algorithm>
#include <math.h>

using namespace std;
#define SORT(v) sort(v.begin(),v.end())
#define REP(i, a, b) for (int i = a; i >= 0; i--)
#define si(n) scanf("%d",&n)
#define sii(n, m) scanf("%d %d",&n,&m)
#define sl(n) scanf("%lld",&n)
#define sll(n, m) scanf("%lld %lld",&n,&m)
#define ss(cad) scanf("%s",cad)
#define PB push_back
#define fst first
#define scn second
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

char cad[100];

int main() {
    int c = 0;
    si(c);
    while (c--) {
        ss(cad);
        REP(i, sizeof(cad) - 1, 0) {
            int a = (int) cad[i];
            if (a >= 97 && a <= 122)
                printf("%c", cad[i]);
        }
        printf("\n");
    }
    return 0;
}