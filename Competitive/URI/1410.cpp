#include <iostream>
#include<bits/stdc++.h>
#include <cmath>
using namespace std;
#define SORT(v) sort(v.begin(),v.end())
#define si(n) scanf("%d",&n)
#define sii(n,m) scanf("%d %d",&n,&m)
#define siii(n,m,o) scanf("%d %d %d",&n,&m,&o)
#define sl(n) scanf("%lld",&n)
#define sll(n,m) scanf("%lld %lld",&n,&m)
#define ss(cad) scanf("%s",cad)
#define PB push_back
#define fst first
#define scn second
#define DBG(x) cerr<< #x << "=" << (x) <<endl
#define M (__int128)4300000013
#define N_MAX 1000010

typedef long long ll;
typedef vector<int> vi;
typedef vector<bool> vb;
typedef vector<ll> vll;
typedef pair<int,int> pi;
typedef pair<ll,ll> pll;
typedef vector<pi> vp;


int main()
{
    int A,D,B,C;
    while(sii(A,D))
    {
        if(A == 0 && D == 0)
        {
            break;
        }
        int atacantes[100],defensores[100];

        int i=0,j=0;
        for(i=0;i<A;i++)
            cin>>atacantes[i];
        sort(atacantes,atacantes+A);

        for(j=0;j<D;j++)
            cin>>defensores[j];
        sort(defensores,defensores+D);

        if(atacantes[0]>=defensores[0]&&atacantes[0]>=defensores[1])
            cout<<"N\n";

        else if(atacantes[0]>=defensores[1])
            cout<<"N\n";

        else
            cout<<"Y\n";
    }
    return 0;
}
