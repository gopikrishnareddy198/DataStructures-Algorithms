class MinAndMaxSum{

  public static void main(String... args){
    int[] numbers={9,2,3,4,5,6,2};
    int min=numbers[0];
    int max=numbers[0];
    int sum=numbers[0];
 
    int maxSum, minSum=0;

    for(int i=1;i<numbers.length;i++){
          if(numbers[i]<=min){
              min=numbers[i];
          }
          if(numbers[i]>=max){
              max=numbers[i];
          }
          
          sum += numbers[i];
    }
 
    maxSum = sum - min;
    minSum = sum - max;

    System.out.println("Max sum is: "+maxSum );
    System.out.println("Min sum is: "+minSum );     
  }
}