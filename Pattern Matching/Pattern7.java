/*

10101
01010
10101
01010

*/

class Pattern7{

 public static void main(String[] args){
   int n=4, num=1;

   for(int i=0;i<n;i++){
     
    for(int j=0;j<n+1;j++){
       
       System.out.print(num); 
       if(num==1) num=0;
       else num=1;
    }
      System.out.println();
   }  
 }
}