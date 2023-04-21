/*
import java.util.*;

class SlidingWindowOptimized2{

 public static void main(String[] args){
     int[] array = {1,2,3,3,4,5,2,6,3,4,1,2,2,2,12,2,1};
     int k= 3;
     int counter = 0;
     HashMap<Integer,Integer> hashMap = new HashMap<>();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
     for(int i=0;i<array.length;i++){
         int key = array[i];

         if(!hashMap.contains(key)){
             hashMap.put(key,1);  
         }

         if(hashMap.contains(key)){
            int value= hashMap.get(key);
            hashMap.put(key,value+1);
         }
		

     }
 }
}



*/

package dsalgo.practice.slidingwindow; 

 

import java.util.HashMap; 

import java.util.HashSet; 

 

public class SlidingWindowOptimized2{

public static void main(String[] args) { 

int ar[] = { 1, 2, 3, 1, 3, 2, 4 };// 100-3=>97 i=90 

// 0,1,2,3,4,5,6 7-k => 4 

// i=0 1 2 3(0,1,2) 

// i=1 2 3 1(1,2,3) 

// i=2 3 1 3(2,3,4) 

// 0 1 2 3 

// 3 1 3 4 

// 3 1 3 :-(1) :- 2(0,1,2) 

// (1 ,4) : -2 (1,2,3) 

int k = 3; 

HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

 

for (int i = 0; i < k; i++) { 

int key = ar[i]; 

if (map.containsKey(key)) { 

int value = map.get(key); 

map.put(key, value + 1);//10 

} else { 

map.put(key, 1); 

} 

} // 0,1,2  // K*logn 

System.out.print(map.size() + " "); 

for (int i = k; i < ar.length; i++) { 

// 0 1 2 

// 1 2 3 

// 2 3 4 

int key = ar[i]; // 3 

int key1 = ar[i - k]; // 0//Key which you want to remove 

// [0,1,2] 

// [1,2,3] 

// [1,2,3,4] 

// [2,3,4] 

if (map.containsKey(key)) { 

int value = map.get(key); 

map.put(key, value + 1); 

} else { 

map.put(key, 1); 

} 

// System.out.println(i+" "+map); 

int freq = map.get(key1); 

if (freq == 1) { 

map.remove(key1); 

} else { 

map.put(key1, freq - 1); 

} 

System.out.print(map.size() + " "); 

 

} //[N-k]*1 

 

//N-k+k==>N 

} 

} 
























