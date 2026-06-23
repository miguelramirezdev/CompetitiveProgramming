#include <bits/stdc++.h>
using namespace std;
 
int main(int argc, char** argv) {
	int n;
	cin >> n;
	while (n--){
		string word;
		cin >> word ;
		if(word.length()>10){
			cout << word[0] << word.size()-2 << word[word.size()-1]<<"\n";
		}else{
			cout << word << "\n";
		}
	}
	return 0;
}