package fridaytask;

import java.util.Scanner;

public class PrimesInArray {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		int[] ar= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
				System.out.println(ar[i]);
		}
		sc.close();
	}
	public static boolean isPrime(int n)
	{
		int fctors=0;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
				fctors++;
		}
		if(fctors==0)
			return true;
		else
			return false;
	}
}
