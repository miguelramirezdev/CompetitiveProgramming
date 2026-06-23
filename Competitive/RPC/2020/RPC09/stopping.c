#include "stdio.h"

int gcd (int a, int b);
int lcm (int a, int b);

int main(){
	int m, g, f, x;
	scanf("%d", &m);
	scanf("%d", &g);
	scanf("%d", &f);
	m--;
	x = m/g + m/f - m/lcm(f, g);
	printf ("%d\n", x);
	return 0;
}
int gcd (int a, int b){
	if (b == 0)
		return a;
	return gcd(b, a%b);
}
int lcm (int a, int b){
	return b / gcd(a,b) * a;
}
