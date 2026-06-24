#include <iostream>
#include <queue>
#include <bitset>
#include <vector>
using namespace std;
const int N=1e4 +9;
bitset<N>visited;
int n,m;
int BFS(int x,vector<int>G[]){
	int c=0;
	visited[x]=1;
	queue<int>Q;
	Q.push(x);
	while(!Q.empty()){
		c++;
		int u=Q.front();
		Q.pop();
		for(int i=0;i<G[u].size();i++){
			int k=G[u][i];
			if(!visited[k]){
				Q.push(k);
				visited[k]=1;
			}
		}
	}
	return c;
}
void solve(){
	int u,v;
	vector<int>G[N];
	for(int i=0;i<m;i++){
		scanf("%d %d",&u,&v);
		G[u].push_back(v);
		G[v].push_back(u);
	}
	for(int i=1;i<=n;i++){
		if(!visited[i]){
			int x=BFS(i,G);
			printf("%d %d\n",i,x );
		}
	}
}
int main() {
	while(cin>>n>>m){
		solve();
		visited.reset();
	}
	return 0;
}
