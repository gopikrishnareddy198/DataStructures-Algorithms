/*

1
23
456
78910
1112131415


*/


class Pattern6{
 public static void main(String[] a){
  int n=6;
  int i=0;

  for(int r=0;r<n;r++){
   for(int c=0;c<r+1;c++){
    System.out.print(++i);
   }
    System.out.println();
  }
 }

}