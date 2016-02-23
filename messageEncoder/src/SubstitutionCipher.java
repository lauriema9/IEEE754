
public class SubstitutionCipher implements MessageEncoder { 
    private int shift;
	public SubstitutionCipher(int shift){
		this.shift = shift;
	}
	public String encode(String plainText) {
		char list[] = new char[plainText.length()];
	    for(int i = 0; i< plainText.length(); i++){
	    	list[i]=(char)(plainText.charAt(i) + this.shift);
	    }
		
	    
		// TODO Auto-generated method stub
		return new String(list);
	 }
	public String decode(String plainText) {
		char list[] = new char[plainText.length()];
	    for(int i = 0; i< plainText.length(); i++){
	    	list[i]=(char)(plainText.charAt(i) - this.shift);
	    }
		
	    
		// TODO Auto-generated method stub
		return new String(list);
	}
  
}
