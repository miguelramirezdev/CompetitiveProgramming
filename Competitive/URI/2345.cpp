#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int main()
{
    int vec[4];
    for (int i = 0; i < 4; i++) {
        cin>>vec[i];
    }
	sort(vec,vec+4);
	int a = vec[0]+vec[3];
    int b = vec[1]+vec[2];
    cout <<abs(a-b)<< endl;
    return 0;
}