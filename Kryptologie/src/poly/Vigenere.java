package poly;

public class Vigenere {
	

  public static char shift(char c, int k) {
    return (char) ((( c - 65 + k ) % 26 ) + 65 );
  }
  
  public static String caeser(String arg, int key) {
    String res = "";
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);
      res += shift(c, key);
    }
    return res;
  }
  
  public static String vigenere(String arg, String keyword) {
    String res = "";
  
    
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);

       keyword = "BRUTUS";

      // c = arg.charAt(i);
      res += shift(c, keyword.charAt(i) -65);
      
      // c = arg.charAt(i);
      // res += shift(c, 'R'-65); 

      // c = arg.charAt(i);
      // res += shift(c, 'U'-65); 
    
    }
    
    return res;
  }
  
  public static void main(String[] args) {
    String plain = "VENIVI";

    String cipher = caeser(plain, 3);
    System.out.println( cipher );
    
    System.out.println( caeser( cipher, 23 ) );
    
    System.out.println( vigenere ( plain, "BRUTUS" ));
  }

}
