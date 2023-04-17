import java.util.*;

class FirstAndLastOccurance{

 public static void main(String[] args){
   int sortedNumbers[] = {0,1,2,3,4,5,5,5,5,6,7,9,10,12};
   int first = 0, last = 0;
   int low = 0, high = sortedNumbers.length-1;
   int targetElement = 5;
   int mid = 0;
   
   
   while(low<=high){       
      mid = (low+high)/2;
 
     if(sortedNumbers[mid]==targetElement){
              high = mid-1; 
              first = mid;
     }else if(sortedNumbers[mid]<targetElement){
              low = mid+1;
     }else{
              high = mid-1; 
     }

     
       

   }    
 
    low = 0; high = sortedNumbers.length - 1;

   while(low<=high){
     mid = (low+high)/2;
     if(sortedNumbers[mid]==targetElement){
              low = mid+1;     
              last = mid;
     }else if(sortedNumbers[mid]>targetElement){
             high = mid-1;   
     }else{
             low = mid+1;
     }

       

          
           

   }
  
    System.out.println("First occurance is at index: "+first+" Last occurance is at index: "+last);
 }
}




