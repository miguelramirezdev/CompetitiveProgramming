#include <vector>
#include <string>
#include <iostream>
using namespace std ;
int main() {
   int n ;
   cin >> n ;
   vector<string> vec(n) ;
   for (auto &v : vec)
      cin >> v ;
   int aux = 1 ;
   for (int i=0; i<n; i++) {
      int sr=0, sc=0 ;
      for (int j=0; j<n; j++) {
         sr += (vec[i][j] == 'B') ;
         sc += (vec[j][i] == 'B') ;
      }
      for (int j=0; j+2<n; j++) {
         if (vec[i][j] == vec[i][j+1] && vec[i][j] == vec[i][j+2])
            aux = 0 ;
         if (vec[j][i] == vec[j+1][i] && vec[j][i] == vec[j+2][i])
            aux = 0 ;
      }
      if (sr + sr != n || sc + sc != n)
         aux = 0 ;
   }
   cout << aux << endl ;
}
