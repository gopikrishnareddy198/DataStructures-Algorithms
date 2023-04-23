
import java.util.*;


class Shift_K_Elements_To_Right_And_SearchForItem{

  public static void main(String[] args){
     int[] numbers = {1,2,3,4,5,6,7,8};
     int k = 4;
     int element = 5;

     for(int i=0;i<k;i++){
        int temp = numbers[0];

        for(int j=0;j<numbers.length;j++){
           if(j==numbers.length-1){
              numbers[j]=temp;
           }else{
              numbers[j] = numbers[j+1];
           }
        }
     }
     
    int low = 0;
    int high = k-1;
    int elementPresentAtIndex = 0 ;

    while(low <= high){
       int mid = (low+high)/2;

       if(numbers[mid] == element){
           elementPresentAtIndex = mid;  
           break;
       }else if(numbers[mid] > element){
            high = mid - 1;
       }else{
           low = mid + 1;
       }    
    }   
    

    low = k;
    high = numbers.length - 1;

    while(low<=high){
       int mid = (low+high)/2;

       if(numbers[mid] == element){
           elementPresentAtIndex = mid;    
           break;
       }else if(numbers[mid] > element){
           high = mid - 1;
       }else{
           low = mid + 1;
       }    
    }

    System.out.println(numbers[elementPresentAtIndex]);

  }
} 