#include <iostream>

using namespace std;

int main() {
	int y;
	cin >> y;
	int a = 2018;
	int b = 3;
	while (a < y) {
		b += 26;
		while (b >= 12) {
			a++;
			b -= 12;
		}
	}
	if (a == y)
		cout << "yes" << endl;
	else
		cout << "no" << endl;
}
