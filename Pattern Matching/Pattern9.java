/*

 ****
 *  *
 *  *
 ****

*/

class Pattern9{

 public static void main(String[] args){

  int n=4;

  for(int r=1;r<=n;r++){

    for(int c=1;c<=n;c++){ 
       if(r == 2 && c == 2 || r == 2 && c == 3 || r == 3 && c == 2 || r == 3 && c == 3)
          System.out.print(" ");
       else
          System.out.print("*");
    }
      System.out.println();
  }
 }
}