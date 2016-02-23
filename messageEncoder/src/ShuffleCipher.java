
public class ShuffleCipher implements MessageEncoder{
	   private int n;
	public ShuffleCipher(int n){
		this.n = n;
	}

	public String encode(String plainText) {
		String encodedText=shuffle(plainText);
		for(int i=1; i<n; i++) {
			encodedText=shuffle(encodedText);
		}
		return encodedText;
	}

	private String shuffle(String plainText) {
		char[] indexOfPlainText = new char [plainText.length()];
	    char[] indexOfPlainTextFirstHalf = new char [plainText.length()-plainText.length()/2];
	    char[] indexOfPlainTextSecondHalf = new char [plainText.length()-plainText.length()/2];
	    for (int j =0; j < plainText.length()-plainText.length()/2;j++){
	    	indexOfPlainTextFirstHalf[j] =plainText.charAt(j);	    	
	    	indexOfPlainTextSecondHalf[j] =plainText.charAt(plainText.length()/2+j);
	    }
	  //  System.out.println(String.valueOf(indexOfPlainTextFirstHalf));
	//    System.out.println(String.valueOf(indexOfPlainTextSecondHalf));
    	int i=0;
	    
	    for (int j =0; j < plainText.length();j=i*2){
	    	indexOfPlainText[j] = indexOfPlainTextFirstHalf[i];
	  //  	System.out.println(indexOfPlainText[j]);
	    	i++;
	    }
    	i=0;
	    for (int j =1; j < plainText.length();j=(i*2)+1){
	    	indexOfPlainText[j] = indexOfPlainTextSecondHalf[i];
	    //	System.out.println(indexOfPlainText[j]);
	    	i++;
	    }
	    return new String(indexOfPlainText);
	}

	public String decode(String plainText) {
		String decodedText=deshuffle(plainText);
		for(int i=1; i<n; i++) {
			decodedText=deshuffle(decodedText);
		}
		return decodedText;
	}

	private String deshuffle(String plainText) {
		char[] indexOfPlainText = new char [plainText.length()];
	    char[] indexOfPlainTextFirstHalf = new char [plainText.length()-plainText.length()/2];
	    char[] indexOfPlainTextSecondHalf = new char [plainText.length()-plainText.length()/2];
	   

    	int i=0;
	    
	    for (int j =0; j < plainText.length();j=i*2){
	    	indexOfPlainTextFirstHalf[i] =plainText.charAt(j);

	    	i++;
	    }
    	i=0;
	    for (int j =1; j < plainText.length();j=(i*2)+1){
	     indexOfPlainTextSecondHalf[i]=plainText.charAt(j);

	    	i++;
	    }
	    
//	    for (int j =0; j < plainText.length();j++){
//	    	indexOfPlainTextFirstHalf[j] =plainText.charAt(j);	    	
//	    	indexOfPlainTextSecondHalf[j] =plainText.charAt(plainText.length()/2+j);
//	    
	    
	    return new String(indexOfPlainTextFirstHalf).concat(new String(indexOfPlainTextSecondHalf));
	}
}
