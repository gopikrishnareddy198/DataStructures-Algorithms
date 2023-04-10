/*
    Fibonacci Series: Sum of two succeeding numbers is equal to third number
         
    0, 1, 1, 2, 3, 5, 8, 13, 20
    0+1 = 1
    1+1 = 2
    1+2 = 3
    2+3 = 5 
    3+5 = 8 and so on...
    
    How to solve:

        Get first element from array and store in a variable 'a'
        Get second element from array and store in a variable 'b'
        Add a and b, store the sum in 'c'

        In For loop:
          compare c with the third element in array
          Assign b value to a
          Assign c value to b
     
          Add a and b and store in c
  
        
  
*/

class FibonaciSeries{


  public static void main(String[] args){
       boolean flag= false;
       int[] fibbonaciSeries = {0, 1, 1, 2, 3, 5, 8, 13, 20};

       int a= fibbonaciSeries[0];
       int b= fibbonaciSeries[1];  

       int c= a+b;
 
       for(int i=2;i<fibbonaciSeries.length;i++){
                if(c!=fibbonaciSeries[i]){
                      flag=true;
                      break;
                }
                a=b;
                b=c;

                c=a+b;
       }
       
       if(flag)
             System.out.println("The given array is not Fibonacci Series");
       else
             System.out.println("The given array is a valid Fibonacci Series");

  }

}