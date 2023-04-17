
class MissingCharacterInString2{
 
 public static void main(String[] args){
   String s= "acdefghijklmnopqrstuvwxy";

   char[] chars = s.toCharArray();
   int[] missingCharsArray = new int[26];

   for(int i=0;i<chars.length;i++){
        int x = chars[i] - 97;    
        missingCharsArray[x]++;
   }

   for(int i=0;i<missingCharsArray.length;i++){

       if(missingCharsArray[i]==0){
           int asciiNumber = 97 + i;
           char c = (char)asciiNumber ;
          System.out.print(c+" ");
       }
   }
 }
}