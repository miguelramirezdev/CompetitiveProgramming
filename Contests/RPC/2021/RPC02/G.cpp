#include <iostream>
#include <vector>

using namespace std;

bool Binary_Search(vector<long long>& sequence, long long val){
  int low = 0;
  int high = sequence.size()-1;
  while(low <= high){
    int mid = (low+high)/2;
    int x = sequence[mid];
    if(sequence[mid] == val)
      return true;
    if(sequence[mid] < val)
      low = mid+1;
    else
      high = mid-1;
  }
  return false;
}

int main(){
  long long n,m,a,c,x0;
  cin >> n >> m >> a >> c >> x0;
  vector<long long> sequence(n);
  
  for(int i =0; i < n; i++){
    sequence[i] = (x0*a + c) % m;
    x0 = sequence[i];
    //   cout << x0 << " ";
  }

  //  cout << endl;
  int num_found = 0;
  for(int i = 0; i < n; i++){
    //if(i == 3124)
    //  cout << "hi" << endl;
    if(Binary_Search(sequence, sequence[i])){
      //  cout << i << endl;
      num_found++;
    }
  }
  cout << num_found << endl;
  return 0;
}

  
