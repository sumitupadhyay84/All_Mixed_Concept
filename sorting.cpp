// Bubble Sort
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void bubbleSort(vector<int>v){
    int n=v.size();
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(v[j]>v[j+1]){
                swap(v[j],v[j+1]);
            }
        }
    }
}
int main()
{
    vector<int> v={1,5,4,3,0};
    bubbleSort(v);
    for(auto i:v){
        cout<<i<<" ";
    }
    return 0;
}

// selection sort

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void selectionSort(vector<int>&v){
    int n=v.size();
    int min;
    for(int i=0;i<n-1;i++){
      min=i;
      for(int j=i+1;j<n;j++){
        if(v[j]<v[min]){
          min=j;
          swap(v[i],v[min]);
        }
      }
    }
  }
int main()
{
    vector<int> v={1,5,4,3,0};
    selectionSort(v);
    for(int i:v){
      cout<<i<<" ";
    }
    return 0;
}

// insertion sort

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void insertionSort(vector<int>&v){
    int n=v.size();
    for(int i=1;i<n;i++){
      int key=v[i];
      int j=i-1;
      while(v[j]>key && j>=0){
        v[j+1]=v[j];
        j--;
      }
      v[j+1]=key;
    }
  }
int main()
{
    vector<int> v={1,5,4,3,0};
    insertionSort(v);
    for(int i:v){
      cout<<i<<" ";
    }
    return 0;
}
