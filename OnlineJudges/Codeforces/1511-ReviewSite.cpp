#include <bits/stdc++.h>
using namespace std;
 
int solve(){
	int cases,reviewer, upvote = 0, downvote = 0;
	cin >>cases;
	while(cases--){
		cin >> reviewer;
		if(reviewer == 1 || reviewer == 3){
			upvote++;
		}else {
			downvote++;
		}
	}
	cout << upvote << "\n";
	
	return 0;
}
 
 
int main(int argc, char** argv) {
	int t;
	cin >> t ;
	while(t--){
		solve();
	}
	return 0;
}