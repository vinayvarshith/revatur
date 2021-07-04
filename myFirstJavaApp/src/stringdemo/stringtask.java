package stringdemo;
//Convert last character of every word to uppercase an
//print back the whole sentence


public class stringtask {
	public static void main(String[] args) {
		String s="hello hai good evening everyone hope you are enjoying programming in java";
		StringBuffer sb=new StringBuffer();
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
//hell