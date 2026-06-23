#include<bits/stdc++.h>
#include <algorithm>
#include <cmath>
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

int divSum(int num) 
{ 
    int result = 0; 
    REP2(i,2,sqrt(num)){
        if (num%i==0) 
        { 
            if (i==(num/i)) 
                result += i; 
            else
                result += (i + num/i); 
        } 
    }
    return (result + 1); 
} 

int main() {
    int n, t;
    si(t);
    while(t--)
    {
        si(n);
        if(divSum(n)<n){
            cout<<"deficient"<<"\n";
        }else if(divSum(n)==n){
            cout<<"perfect"<<"\n";
        }else if(divSum(n)>n){
            cout<<"abundant"<<"\n";
        }
    }
    return 0;
}