class MinAndMaxElementInArray{

  public static void main(String[] args){
      int numbers[]={1,7,3,8,9,10,12,13,19};
      int min=numbers[0];
      int max=numbers[0];
      
      for(int i=1;i<numbers.length;i++){
           if(numbers[i]<min){
               min=numbers[i];
           }
           else if(numbers[i]>max){
               max=numbers[i];
           }

      }

      System.out.println("The smallest number in array: "+min);
      System.out.println("The biggest number in array: "+max);

  }
}