//Remove Duplicates from Sorted Array
import java.util.*;

class RemoveDuplicatesFromSortedArray{
  
  public static void main(String[] args){
     int arr[]={0,1,2,3,4,1,1,1,5,5,0};
    removeDuplicates(arr);
    System.out.println(Arrays.toString(arr));
  }


  public static int removeDuplicates(int num[]){
       int length=num.length;

       for(int i=0;i<length;i++){
 
         for(int j=0;j<length;j++){
           if(i!=j)
            if(num[i]==num[j]){
              for(int k=j;k<length-1;k++){
                    num[k]=num[k+1];
              }

             num[--length]=0;
             j=j-1;
           }
            
         }


       }
       return length;
  }
}