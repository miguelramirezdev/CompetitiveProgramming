#include <iostream>
#include <math.h>
using namespace std;
int main() {
	double a,b;
	cin >> a >> b;
	printf("%.6lf",a+b - sqrt(a*a + b*b));
	return 0;
}
