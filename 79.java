import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p=n*m;int fl=0;
		for(int i=1;i<p/2;i++)
		{
			if((i*i)==p)
			{
			fl=1;break;
			}
		}
		if(fl==1)
		System.out.print("yes");
		else
		System.out.print("no");
		
		
	}
}
