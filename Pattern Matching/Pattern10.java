/*
 
 5432*
 543*1
 54*21
 5*321
 *4321

*/
class Pattern10{
 public static void main(String[] args){
   int n = 5;
  
   for(int i=1;i<=n;i++){
      for(int j=n;j>0;j--){
        if(i==j)
         System.out.print("*");
        else
         System.out.print(j);
      }
         System.out.println();
   } 
  
 }
}