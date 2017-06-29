package com.max;

import java.util.Scanner;

class PALIN {
 
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			int l=s.length();
			int a[]=new int [l+1];
			a[0]=0;
			int i;
			for( i=1;i<l+1;i++)
				a[i]=s.charAt(i-1)-'0';
			
			while(true)
			{
				a[l]++;
				for(int j=0;j<l;j++)
				{
					if(a[l-j]==10)
					{
						a[l-j]=0;
						a[l-j-1]++;
					}
					else
						break;
				}
				if(a[0]==0)
				{	
				for(i=1;i<(l/2)+1;i++)
				{
				 if(a[i]!=a[l-i+1])
					 break;
				}
				if(i==l/2+1)
				 {
					for(i=1;i<l+1;i++)
						System.out.print(a[i]);
					System.out.println();
					break;
				 }
				}
				else
				{
					for(i=0;i<(l+1)/2;i++)
					{
					 if(a[i]!=a[l-i])
						 break;
					}
					if(i==(l+1)/2)
					 {
						for(i=0;i<l+1;i++)
							System.out.print(a[i]);
						System.out.println();
						break;
					 }	
				}
				
			}
		}sc.close();
	}
}
 