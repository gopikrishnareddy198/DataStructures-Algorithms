/*

*****
*  *
* *
**
*

*/


class Pattern11{

 public static void main(String[] args){
    
   int n = 5;
 
   for(int r=1;r<=n;r++){
 
      for(int c=n;c>0;c--){
        if(r==1 || c==n)
          System.out.print("*");
        else if(r==c)
          System.out.print("*");
        else  
          System.out.print(" ");
      }
       System.out.println();
   }

   
 }
}