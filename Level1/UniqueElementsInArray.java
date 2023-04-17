import java.util.*;

class UniqueElementsInArray{

 public static void main(String[] args){
     int counter= 0;
     int array[]={1,7,9,10,4,1,3,12,5,6};
    
     int uniqueElements[]=new int[array.length];

     for(int i=0;i<array.length;i++){
       boolean flag= true;

       for(int j=0;j<array.length;j++){
              if(i!=j)
                if(array[i]==array[j])
                   flag=false;
       }
            if(flag){
               uniqueElements[counter++] = array[i];                
            }       
       }  

			
      System.out.println(Arrays.toString(uniqueElements));
 }
}