package samm;

public class OneTimeOncesFirstnext {

	public static void main(String[] args) {
		String input = "tirupurrrrrr";
		String lowercase = input.toLowerCase();
		int[] arr = new int[26];
		for (int i = 0; i < lowercase.length(); i++) {
			arr[lowercase.charAt(i) - 97]++;
		}
		boolean printed=false;
		for(int i=1;i<=26;i++) {
			
		for(int j=0;j<26;j++) {
				 if(arr[j] == i) {
					    printed=true;
						System.out.print((char)( j + 97)+" ");
						
					}}
		if(printed) {
					System.out.println(" ");
				}
			}
			
	}}
		
	
