#include <bits/stdc++.h>
using namespace std;

int main(){
  int n; int64_t m; cin>>n>>m;
  vector<int64_t> vec(n);
  for (auto &i: vec)
    cin>>i;
  sort(vec.begin(),vec.end());

  int x = 0, i = n - 1, j = 0;
  while (i > j) {
     if (vec[j] > (m - vec[i])) {
         x++;
         i--;
     } else {
         j++;
         i--;
         x++;
        }
    }
    if (i == j)
        x++;

  cout<<x<<endl;
}
