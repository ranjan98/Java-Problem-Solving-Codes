//reverse substring
import java.io.*;
import java.util.*;
class code1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int revnum=s.nextInt();
		int len=str.length();
		int pos=0;
		char ch[]=str.toCharArray(); 
		ArrayList<Character> a=new ArrayList<Character>();
		while(revnum>=len)
		{
			pos=0;
			char rev[]=new char[len];  
			for(int i=ch.length-1;i>=0;i--){  
				rev[pos++]=ch[i]; 
			}
			revnum-=len;
			System.out.printf("REV NUM: %d\n",revnum);
			for(int i=0;i<ch.length;i++)
			{
			ch[i]=rev[i];
			}
		}
		if(revnum<len)
		{
			for(int i=revnum-1;i>=0;i--)
			{
				
				a.add(ch[i]);
			}
		}
		for(int i=0;i<a.size();i++)
			ch[i]=a.get(i);
		for(int i=0;i<len;i++)
			System.out.print(ch[i]);
	}
}
