#include <stdio.h>
#include <iostream>

using namespace std;

int main()
{
    int n, x , y , sum;
    cin >> n;
    while(n--){
        sum = 0;
        cin >> x >> y;
        int  aux = x;
        while(y != 0){
            if(aux % 2 !=0){
                sum += aux;
                y--;
            }
            aux +=1 ; 
        }
        cout<<sum<<"\n";
    }
    return 0;
}