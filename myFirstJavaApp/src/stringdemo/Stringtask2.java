package stringdemo;
//If the string is of length even then convert first char to uppercase

//if it is odd then convert middle char to uppercase

import java.util.*;
public class Stringtask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		System.out.println(check(s));
		
	}
	public static String check(String s)
	{
		int l=s.length();
		StringBuffer sb= new StringBuffer();
		//s="hello"
		if(l%2==0)
		{
			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1));
		}
		else
		{
			int m=l/2;
			sb.append(s.substring(0,m)).append(Character.toUpperCase(s.charAt(m))).append(s.substring(m+1));
		}
		return sb.toString();
	}

}
