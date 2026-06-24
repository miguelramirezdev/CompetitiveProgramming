#include <iostream>
using namespace std;
int A[] = {1,5,10,20,50,100};
int A1[] = {1,5,10,20,50,100};
int main() {
	int a;
	for(int i=0;i<6;i++){
		cin>>a;
		A[i]=A[i]*a;
	}
	int maxi=-1;
	int canti=0;
	for(int i=0;i<6;i++){
		if(A[i]>=canti){
			maxi = A1[i];
			canti = A[i];
		}
	}
	cout<<maxi<<endl;
	return 0;
}
