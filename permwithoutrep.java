import java.io.*;
import java.util.*;
class GFG {
    static ArrayList<String> al=new ArrayList<String>();
    static ArrayList<String> permutations(String str, String ans)
    {
        if(str.length()==0 && al.contains(ans)!=true)
        {
            al.add(ans);
            //System.out.println(al);
            return al;
        }
        for(int i=0;i<str.length();i++)
        {
            char s1=str.charAt(i);
            String s2=str.substring(0,i)+str.substring(i+1);
            permutations(s2,ans+s1);
        }
        return al;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		ArrayList<String> ansal=permutations(str,"");
		for(int i=0;i<al.size()-1;i++)
		    System.out.print(ansal.get(i)+ " ");
		System.out.print(ansal.get(al.size()-1));
	}
}
