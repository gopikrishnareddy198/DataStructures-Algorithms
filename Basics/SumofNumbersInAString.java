//

class SumofNumbersInAString{

   public static void main(String[] args){
     String numbers="148123";
     int sum = 0;

     for(int i=0;i<numbers.length();i++){
          char oneDigit=numbers.charAt(i);
          int num=oneDigit-48;
          sum += num; 
     }

     System.out.println(sum);
   }

}