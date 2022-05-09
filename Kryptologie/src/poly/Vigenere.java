package vigenere;

public class Vigenere {

  public static char shift(char c, int k) {
    return (char) ((( c - 65 + k ) % 26 ) + 65 );
  }
  
  public static String caesar(String arg, int key) {
    String res = "";
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);
      res += shift(c, key);
    }
    return res;
  }
  
  public static String vigenere(String arg, String keyword, boolean encrypt) {
    String res ="";
  
    
    for(int i=0; i<arg.length(); i++) {
      char c = arg.charAt(i);
      int k = keyword.charAt( i % keyword.length() ) - 65;
      
      if( encrypt) {
    	  res += shift(c, k);
      }else {
    	  res += shift(c, 26 - k);
      }

     
    }
    
    return res;
  }
  
  public static void main(String[] args) {
    String geheim ="PWTMYTBADKDGPWPFYWFGUESOTLUPNVYWAPKCSOOJWWASTLSUZUSJMJBBRSTIMGPYSXOJWWASMMZQLCHJQWGYDHKOJWWASTMFPADWIPVKLHONZWPDPWRAAGQPRKNJCNPKGPJJLTHYOWOHPGYJWCUEKUZLGAOWKHOGPESMZMRWPBKVFVZTQNLAGSFSMVWTDPWRAAGQPRKNJCNPTGTKEOMSGVLYVCHKBVKLOFOBLGNCIVXWPLYBZAAEOOWKEWEODZKZOGPWGOMSWMPWTIFFLCTUTYGUOSLZSILYOHEWEODSRVVYHSFAVVHHWGIPTGHYHCWJVLERGJWKPDHGJWTUTQNBXGZEUKTWIAZPPMOGPWGJQWGYDHKNJCNPSOVWTZPFOMNQUQFGOWPYTQNBAIVOSXNSNZNVHMSPAHCXBWVDTFJRWFLASXAGPHYHCWJVLEOANWKUPTXIYGUFFSQLLHZRKZFGPYTXIYGUOWKVAEOEAOBBCVOSXVWKUMSGVLYVCHKBOGYOSTSGGUYSTAAPKYWIPLBBRSRIKULYJUVWKUPFHMDKLMWMMFRLCGUVKQSWAGVVWYNVLZSILYROMKKJSBAZSWMOWKHMILSCKZAIRPWZHMGPYSXLWTNCIVXWPIPNOMZGUSSXIMUIPYUUEGUKICMDEOPFMZMRWPGOMYGOZSXBOKLGWKTWHYLUKVEWZDAGVEKUOSYBWPZDHKTDGUFBJEWNJSSLZSILYYUMFPAPAGVKVLWZKV"; 


    
    System.out.println( vigenere( geheim, "LOGISCH", false ) );
  }

}

