/*Sherlock considers a string to be valid if all characters of the string appear the same number of times. 
It is also valid if he can remove just 1 character at 1 index in the string, and the remaining characters will occur the same number of times.
Given a string , determine if it is valid. If so, return YES, otherwise return NO.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int check[]=new int[26];
        //for(int i=0;i<check.length;i++)
        //{
            for(int j=0;j<s.length();j++)
            {
                int pos=Character.getNumericValue(s.charAt(j));
                check[pos-10]++;
            }
        //}
        int flag=0;
        for(int i=0;i<check.length;i++)
        {
            System.out.print(check[i]+ " ");
        }
        for(int i=0;i<check.length-1;i++)
        {
            if(check[0]!=check[i+1] && check[i+1]!=0)
                flag++;
        }
        
        if(flag>1)
            return "NO";
        else
            return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
