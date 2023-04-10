import java.util.Scanner;


class NarcissisticNumber{
 
 public static void main(String[] args){
    int result=0;
    Scanner scanner;
     System.out.print("Enter a number: ");
     scanner=new Scanner(System.in);
    
	 result = isNumberNarcissistic(scanner.nextLine());
    System.out.println(result);       
}
  
 public static int isNumberNarcissistic(String num){

   char[] chars=null;
   int lengthOfNum=0; 
   int result=1;
   int resultSum=0;

   lengthOfNum=num.length();
   
   chars=num.toCharArray();

   for(int i=0;i<chars.length;i++){
      int exponent = lengthOfNum;
      char zero='0';
      int c=chars[i]-zero;
	   
      while(exponent!=0){	
          result*=c; 
          exponent--;            
      } 
       
      resultSum += result;
	   result=1;
   }  
     return resultSum; 
 } 
}