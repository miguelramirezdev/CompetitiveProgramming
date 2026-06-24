#include <bits/stdc++.h>
using namespace std;
#define MAXN 210
const int N=1e4+5;
map<string,int> h;
struct ss
{
    int u,v,next;
 }edge[N];
  
 int head[N],sum_edge=1,n;
  
 void addedge(int u,int v)
 {
     edge[sum_edge]=(ss){u,v,head[u]};
     head[u]=sum_edge++;
 }
 bool dfs(int now,int t)
 {
     if(now==t) //如果t可达 返回true
     {
         return true;
     }
     for(int i=head[now];i!=-1;i=edge[i].next)
     {
         if(dfs(edge[i].v,t)) 
         return true;
     }
     return false;
 }
 char str1[20],str2[20],te[20];
 int main()
 {
     int m,j=1;
     scanf("%d%d",&n,&m);
     memset(head,-1,sizeof(head));
     for(int i=0;i<n;i++)
     {
         scanf("%s",str1);
         if (h[str1]== 0) 
         h[str1]=j++;
         
         scanf("%s",te);scanf("%s",te);scanf("%s",te);
         
         scanf("%s",str2);
         if (h[str2]== 0)
         h[str2]=j++;
         addedge(h[str1],h[str2]);
     }
     while(m--)
     {
        scanf("%s",str1);
         scanf("%s",te);scanf("%s",te);scanf("%s",te);
         scanf("%s",str2);
         if(h[str1]==0||h[str2]==0) 
         {
             printf("Pants on Fire\n");
             continue;
         }
         if(dfs(h[str1],h[str2]))
             printf("Fact\n");
         else if(dfs(h[str2],h[str1]))
             printf("Alternative Fact\n");
        else
            printf("Pants on Fire\n");
    }
     return 0;
 }
  