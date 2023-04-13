import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, int[] ar) {
                   //1,2,3,4,5,6
                   
                   int remainders[]=new int[k];
                   int j = remainders.length - 1;
                   
             for(int in:ar){
                  int modulus = in % k;
                  remainders[modulus]++;
             }
               
 
             int pairsCount = (remainders[0]*(remainders[0]-1))/2;  //(n*(n-1))/2

             int i=1;
             while(i<j){
                   
                    if(i+j == k){
				         pairsCount += remainders[i] * remainders[j];    
                    }
                   i++; 
                   j--;
             }
 
        return pairsCount;
 
    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {


          int result = Result.divisibleSumPairs(5, 3, new int[]{1,2,3,4,5,6});
          System.out.print(result);
    }
}
