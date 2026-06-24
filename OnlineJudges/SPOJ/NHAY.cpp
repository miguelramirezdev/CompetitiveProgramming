#include <bits/stdc++.h>
 
using namespace std;
 
 
const int MAX_N = 1e6 + 10;
 
char T[MAX_N], P[MAX_N];                         // T = text, P = pattern
int n, m;
 
int b[MAX_N];
 
 
void kmpPreprocess() {                                  // call this first
    int i = 0, j = -1;
    b[0] = -1;                                          // starting values
    while (i < m) {                                     // pre-process P
        while ((j >= 0) && (P[i] != P[j])) j = b[j]; // different, reset j
        ++i;
        ++j;                                    // same, advance both
        b[i] = j;
    }
}
 
int kmpSearch() {                               // similar as above
    int freq = 0;
    int i = 0, j = 0;                              // starting values
    while (i < n) {                                // search through T
        while ((j >= 0) && (T[i] != P[j])) j = b[j]; // if different, reset j
        ++i;
        ++j;                                    // if same, advance both
        if (j == m) {                                // a match is found
            ++freq;
            printf("%d\n", i - j);
            j = b[j];                                  // prepare j for the next
        }
    }
    return freq;
}
 
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int x;
    while (scanf("%d", &x) == 1) {
        scanf("%s%s", P, T);
        n = (int) strlen(T);
        m = (int) strlen(P);
        if (x > n) {
            puts("");
        } else {
            kmpPreprocess();
            kmpSearch();
        }
    }
    return 0;
}