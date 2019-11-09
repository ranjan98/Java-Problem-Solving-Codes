import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int minimumSwaps(int[] arr) {
        int first = 0, last = arr.length - 1;
        int swaps = 0;
        while (first < last) {
            while (arr[first] == first + 1 && first < last)
                first++;
            if (first < last) {
                int temp = arr[arr[first] - 1];
                arr[arr[first] - 1] = arr[first];
                arr[first] = temp;
                swaps++;
            }
        }
        return swaps;
        /*
        int len=arr.length;
        int count=0;
        int temp=0;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i;j<len;j++)
            {
                if((i+1)==arr[j] && (i+1)!=arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                    break;
                }
            }
        }
        return count;
        */
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
