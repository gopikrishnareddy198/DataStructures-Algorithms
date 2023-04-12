import java.util.Arrays;



class BubbleSort{

 public static void main(String[] args){
       int array[]={5,2,1,4,3,6,8,21,39};

       for(int i=0;i<array.length;i++){

          for(int j=i+1;j<array.length;j++){
              if(array[i]>array[j]){
                 int temp1 = array[i];
                 int temp2 = array[j];
                 array[i] = temp2;
                 array[j] = temp1;
              }
          }
       }

       System.out.println(Arrays.toString(array));
 }
}