/*
Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int makeAnagram(String a, String b) {
        int x[]=new int[26];
        int sum=0;
        int pos=0;
        int alen=a.length();
        int blen=b.length();
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        for(int i=0;i<alen;i++)
        {
            pos=Character.getNumericValue(ch1[i]);
            x[pos-10]++;
        }
        for(int i=0;i<blen;i++)
        {
            pos=Character.getNumericValue(ch2[i]);
            x[pos-10]--;
        }
        for(int i=0;i<26;i++)
        {
            if(x[i]<0)
                sum+=-x[i];
            else
                sum+=x[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
