package samm;

public class occurencyInON {

	public static void main(String[] args) {
		String input="gopiFMmM";
		String str=input.toLowerCase();
		
		int[] count=new int[26];
		for(int i=0;i<str.length();i++)
	{
			count[(int) str.charAt(i)-97]++;
			}
		for(int i=0;i<26;i++) {
			if(count[i] != 0)
			System.out.println((char) (i+97) +" "+count[i]);
		}
		

	}

}
