#include <bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums) {
	int l = 1;
	for (int r = 1; r < nums.size(); r++) {
		if (nums[r] != nums[r-1]) {
			nums[l] = nums[r];
			l++;
		}
	}
	return l;
}

int main() {

	vector<int> numbers = {0,0,1,1,1,2,2,3,3,4};
	int result = removeDuplicates(numbers);
	cout << result << endl;
}
