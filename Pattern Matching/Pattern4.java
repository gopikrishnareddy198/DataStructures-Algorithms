/*
    1
   12
  123
 1234


*/


class Pattern4{

 public static void main(String[] args){
   int n=4;
   
   for(int r=1;r<=n;r++){

    for(int ws=n-r;ws>0;ws--){
      System.out.print(" ");
    }

    for(int c=1;c<r+1;c++){
      System.out.print(c);
    }

      System.out.println();

   }

 }
}