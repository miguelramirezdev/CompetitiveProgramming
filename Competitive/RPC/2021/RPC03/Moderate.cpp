#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin>>n;
	int M[3][n];
	int a;
	for(int i=0;i<3;i++){
		for(int j=0;j<n;j++){
			cin>>M[i][j];
		}
	}
	for(int i=0;i<n;i++){
		vector<int>A;
		for(int j=0;j<3;j++){
			A.push_back(M[j][i]);
		}
		sort(A.begin(),A.end());
		if(i==0)
			cout<<A[1];
		else{
			cout<<" "<<A[1];	
		}
	}
	cout<<endl;
	return 0;
}
