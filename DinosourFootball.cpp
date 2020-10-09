#include <iostream>
#include <math.h>
using namespace std;
 
 int main(){
    int t;
    cin>>t;
    while(t--!=0){
       int n,k;
   cin>>n>>k;
    int temp=k; 
       while(k>=0){
          int r = n - k;
          cout<<r<<" ";
          k--;
       }
       for(int i=1;i<(n-temp);i++){
          cout<<i<<" ";
       }
    }
    
 }
   
   

