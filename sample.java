package samm;

import java.util.Arrays;

public class sample {

	public static void main(String[] args) {
		String str="vimalv";
		String str2="vimavl";
		
		String s=str.toUpperCase();
		String s2=str2.toUpperCase();
		int c=0;
		char[] arr=s.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr2.length;j++)
		if(arr.equals(arr2)) {
			System.out.print("yes");
	}
		System.out.print(arr+" "+arr2);

}}
