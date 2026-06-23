#include <iostream>
#include <bits/stdc++.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

int main(int argc, char** argv) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);	
	long long n;
	cin >> n ;
	while(true){
		cout << n << " ";
		if (n == 1) break;
		if( n % 2 == 0 ) n /=2 ;
		else n = n * 3 + 1 ;
	}
	cout << "\n";
	return 0;
}
