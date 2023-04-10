/*

1
12
123
1234

*/
import java.util.Scanner;

class Pattern3{

 public static void main(String[] args){
   int n=0;
   Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number: ");
   n=scanner.nextInt();  

   int rows = n;
   int columns = n;

   for(int i=1;i<=rows;i++){
        
     for(int j=0;j<i;){ 
        System.out.print(++j);
     }  
        System.out.println();

   }
   
 }
}