#include<bits/stdc++.h>
#include <algorithm>
#include <math.h>
#include <iomanip>
using namespace std;
int main() {
    double pi=acos(-1),alpha=(5*pi)/6,betha=(pi/12);
    double r;
	cin>>r;
	double ans=pow(2*r+ ((2*r)*(sin(alpha))/sin(betha) ),2);
	cout <<fixed <<setprecision(5) << (double) ans << "\n";
    return 0;
}

