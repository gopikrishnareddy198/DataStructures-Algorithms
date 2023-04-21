package dsalgo.practice.slidingwindow;


/*
  Given an array {1,2,3,3,4,5,2,6,3,4}
*/
import java.util.*;

class SlidingWindow{

  public static void main(String[] args){
     int[] array= {1,2,3,3,4,5,2,6,3,4};
     int[] uniqueElementsCount=new int[array.length];
     int k=3;
     
     for(int i=0;i<array.length-k;i++){
      HashSet<Integer> hashSet=new HashSet<>();
       for(int j=0;j<k;j++){
           int key = array[i+j];
           hashSet.add(key);
       }
       uniqueElementsCount[i] = hashSet.size();
       
     }

     System.out.println(Arrays.toString(uniqueElementsCount));
  }
}