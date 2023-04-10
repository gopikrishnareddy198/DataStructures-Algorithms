import java.util.Scanner;

class SumOfNNumbers{

  public static void main(String[] args){
 
      int num=0;
      Scanner scanner=null;
      scanner = new Scanner(System.in);
      System.out.print("Enter a natural number: ");

      num=scanner.nextInt();

      System.out.print(calculate(num));   
 
  }

  public static int calculate(int num){
     int sum=0;
     for(int i=1;i<=num;i++){
         sum += i;
     }

     return sum;
  }
}

 

