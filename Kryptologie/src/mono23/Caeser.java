package mono23;

public class Caeser {
	
	public static String decrypt (String s, int z) {
		
		while (z > 26) z = -26;
		
		z = 26 - z;
		
		String text="";
		
		for(int i = 0; i < s.length(); i++) {
			
			if ( Character.isLetter(s.charAt(i) ) ) {
				
				int c = (int) s.charAt (i);
				c += z;
				if( c > 90 ) {
					 c = c - 26; 
					 
				 }
			
				text += (char) c;
				
			}
		}
		
			return text;
		
	}
									

	public static void main(String[] args) {
		
		for(int i=0; i<26; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println(text);
		
	}

}
