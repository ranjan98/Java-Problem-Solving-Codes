import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int i,j;
        int sum=0;
        int prevsum=-1000;
        int a,b,c,d,e,f,g;
        for(i=1;i<5;i++)
        {
            for(j=1;j<5;j++)
            {
                a=arr[i-1][j-1];
                b=arr[i-1][j];
                c=arr[i-1][j+1];
                d=arr[i][j];
                e=arr[i+1][j-1];
                f=arr[i+1][j];
                g=arr[i+1][j+1];
                sum=a+b+c+d+e+f+g;
                if(sum<prevsum)
                {
                    sum=prevsum;
                }
                else
                {
                    prevsum=sum;
                }

            }
        }
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
