/*
A triangle is a valid triangle, If and only If, the sum of any two sides of a triangle is greater than the third side. For Example, let A, B and C are three sides of a triangle. Then, A + B > C, B + C > A and C + A > B.
*/

class ValidTriangle{

  public static void main(String[] args){
     int a = 4, b = 6, c = 5;

     if(a+b > c && b+c > a && a+c > b){
			System.out.println("Valid Triangle");           
     }else{
			System.out.println("Invalid Triangle");           
     }

  }
}