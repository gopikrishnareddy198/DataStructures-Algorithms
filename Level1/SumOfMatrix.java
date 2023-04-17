import java.io.*;
import java.util.*;

class SumOfMatrix{

 public static void main(String[] args) throws Exception{
    int sum=0;
    int rows=0, columns=0;
    String inputs=null, values[]=null;
    BufferedReader bufferedReader=null;
	InputStreamReader is=new InputStreamReader(System.in);

    bufferedReader=new BufferedReader(is);
    System.out.println("Enter number of rows and number of columns separated by single space");
    inputs = bufferedReader.readLine();    

    values = inputs.split(" ");

 
    rows = Integer.parseInt(values[0]);
    columns = Integer.parseInt(values[1]);

    int[][] matrix=new int[rows][columns];
 
    
    for(int i=0;i<rows;i++){
 
        for(int j=0;j<columns;j++){
    			System.out.println("Enter the values for matrix position at \n row: "+i+" column: "+j);
            matrix[i][j]=Integer.parseInt(bufferedReader.readLine());   
            sum += matrix[i][j];
        }
    }

    System.out.println(sum);
 
 }
}