import java.util.*;

//https://leetcode.com/problems/product-of-array-except-self/submissions/
class ProductOfArrayExceptSelf{
  public static void main(String[] args){
	ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
     
      int result[] = p.productExceptSelf(new int[]{-1,1,0,3,-3});

      System.out.println(Arrays.toString(result));
  }


  public int[] productExceptSelf(int[] nums) {
      int j= nums.length - 1;
      int suffixProduct[]= new int[nums.length];
      int prefixProduct[]= new int[nums.length];
      int productArray[]= new int[nums.length];

      for(int i=0;i<nums.length;i++){
		 if(i == 0){
         prefixProduct[i]= nums[i];
       }else{
         prefixProduct[i] = prefixProduct[i-1] * nums[i];
       }

       if(j==0){
         suffixProduct[j] = suffixProduct[j+1];
       }else if(j == nums.length-1){
         suffixProduct[j] = nums[j];
       }else{
         suffixProduct[j] = suffixProduct[j+1] * nums[j]; 
       }

        j--; 
 
     }      
 
       for(int i=0;i<nums.length;i++){
         if(i==0){
           productArray[i] = suffixProduct[i+1];
         }else if(i==nums.length-1){
           productArray[i] = prefixProduct[i-1];    
         }else{
           productArray[i] = prefixProduct[i-1] * suffixProduct[i+1];
         }

       }

      return productArray;        
  }
}

