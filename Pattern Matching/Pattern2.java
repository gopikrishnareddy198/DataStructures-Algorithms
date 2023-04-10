/*

*
**
***
****

*/

class Pattern2{

 public static void main(String[] t){
    int n = 4;
    int rows = n;
    int columns = n; 

    for(int i=0;i<rows;i++){

       for(int j=1;j<=i+1;j++){
         System.out.print("*");
       } 
         System.out.println();
    }

 }
}