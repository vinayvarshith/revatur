package fridaytask;

import java.util.Scanner;

public class AvgEvenOddInArray {
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
		int esum=0,osum=0,ecnt=0,ocnt=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2==0) {
				esum+=ar[i];
				ecnt++;
			}
			else {
				osum+=ar[i];
				ocnt++;
			}
		}
		System.out.println("Even Average in the array is: "+ esum/ecnt);
		System.out.println("Odd Numbers Average in the array is: "+osum/ocnt);
		sc.close();
	}

}
