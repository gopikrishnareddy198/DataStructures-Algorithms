/*

 *
 **
 ***
 ****
 ***
 **
 *
 
*/


class Pattern8{
 public static void main(String[] a){
   int n=4;
   int m=0;

   int rows = (n+n)-1;

   for(int i=1;i<=rows;i++){
       
    for(int j=1;j<i+1&&i<=4;j++){
		System.out.print("*");
    }
       
       System.out.println();
      if(i==4) m=3;
    for(int k=m;k>0;k--){
		System.out.print("*");       
    }
      m--; 
   }
 }
}