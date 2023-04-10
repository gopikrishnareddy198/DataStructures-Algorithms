
class BinarySearch{

 public static void main(String[] args){

   int[] numbers={1,3,7,9,10,13,15,18,19,20,21,26,28,30,33,45,55,67,79,109};
       System.out.println(binarySearch(numbers,67));
 }   
   
  
   public static int binarySearch(int[] array, int key){
      int low = 0, high = array.length-1;
      int mid = (low+high)/2;
            
      while(low<=high){

        if(key==array[mid]){ 
           return mid;
        }else if(key>array[mid]){
           low = mid+1;
           mid = (low+high)/2;
        }else if(key<array[mid]){
           high =  mid-1;
           mid = (low+high)/2;
        }
      }

           return -1;
    }
}