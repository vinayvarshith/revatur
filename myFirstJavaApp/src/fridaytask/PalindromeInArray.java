package fridaytask;
import java.util.*;
public class PalindromeInArray {
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
			if(isPalindrome(ar[i]+""))
				System.out.println(ar[i]);
		}
		sc.close();
	}
	public static boolean isPalindrome(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if (sb.toString().equals(s))
		{
			return true;
		}
		else
			return false;
	}

}
