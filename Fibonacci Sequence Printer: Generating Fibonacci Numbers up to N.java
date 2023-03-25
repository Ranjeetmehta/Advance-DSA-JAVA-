https://course.acciojob.com/idle?question=af8f5e47-c24d-474a-87e8-fd7ed1d062f0

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<n;i++){
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}
