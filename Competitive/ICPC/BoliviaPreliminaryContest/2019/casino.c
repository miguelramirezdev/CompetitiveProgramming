#include <stdio.h>
#include <stdlib.h>

int main()
{
    long t =0,a=0,b=0;
    scanf("%d",&t);
    while(t-->0)
    {
        scanf("%d",&a);
        scanf("%d",&b);
        if(b==1)
        {
            printf("0\n");
        }
        else
        {
             printf("1\n");
        }
    }
    return 0;
}
