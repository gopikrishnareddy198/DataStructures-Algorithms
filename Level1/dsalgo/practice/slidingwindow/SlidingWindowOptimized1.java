package dsalgo.practice.slidingwindow;

import java.util.*;

public class SlidingWindowOptimized1{

 public static void main(String[] args){
    int[] array = {1,2,3,3,4,5,2,6,3,4,1,2,2,2,12,2,1};
    int length= array.length;   
    int k=3;
    int[] uniqueElementsCount = new int[length-3];
 
   for(int i=0;i<length-k;i++){
      TreeSet<Integer> treeSet=new TreeSet<>();

     for(int j=0;j<k;j++){
         int key = array[i+j];
         treeSet.add(key);
     }
   
      uniqueElementsCount[i]=treeSet.size(); 
 }

  System.out.println(Arrays.toString(uniqueElementsCount));
 }
}