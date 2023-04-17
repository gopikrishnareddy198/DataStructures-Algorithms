import java.util.*;

class MissingCharacterInString{

 public static void main(String[] args){
   int counter = 0;
   String s ="acdedfghijklmoqrstuvwxyz";
   char[] chars = s.toCharArray();
   char[] allChars={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   char[] missingChars = new char[26];

   for(char ch:allChars){
      boolean flag=true;
      for(int j=0;j<chars.length;j++){       
        if(chars[j]==ch) flag = false;
      }

       if(flag) 
         missingChars[counter++] = ch;
   }
 
   System.out.println(Arrays.toString(missingChars));  
 }
}