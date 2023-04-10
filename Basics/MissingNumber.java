class MissingNumber{

   public static void main(String[] args){
        
       int n=10;
       int numbers[] = {1,10,5,3,8,4,2,7,6};
       int sumOfArray = 0;
       int sumOfN_NaturalNumbers=n*(n+1)/2;
       
       for(int i=0;i<numbers.length;i++){
           sumOfArray += numbers[i];
       }
 
       int missingNumber = sumOfN_NaturalNumbers - sumOfArray;
              
       System.out.println("The missing number is: "+missingNumber);
        
   }
}