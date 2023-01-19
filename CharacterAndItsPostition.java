package samm;

import java.util.Arrays;

public class CharacterAndItsPostition {

	public static void main(String[] args) {
		String input="gopiFMmM";
		String str=input.toLowerCase();
	    char k;
		int[] count=new int[26];
		for(int i=0;i<str.length();i++)
	{
			count[(int) str.charAt(i)-97]++;
			}
		
		for(int i=0;i<26;i++) {
			
			
			if(count[i] != 0)
			k=(char)(i+97);
				
			System.out.println(k +" "+count[i]);
			
		}
		}

	}
	
