#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int n,sum=0,a;
	cin>>n;
	while(n--){
		cin>>a;
		sum+=a;
	}
	if(sum%3==0){
		cout<<"yes"<<endl;
	}
	else{
		cout<<"no"<<endl;
	}
	return 0;
}
