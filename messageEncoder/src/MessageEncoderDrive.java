
public class MessageEncoderDrive {

	
	public static void main(String[] args) {
		MessageEncoder messageEncode1 = new SubstitutionCipher(3);
		MessageEncoder messageEncode2 = new ShuffleCipher(1);
		String plainText = "abcdef";
		String encodeText= messageEncode1.encode(plainText);
		String encodeText2= messageEncode2.encode(plainText);
		System.out.println(encodeText);
		System.out.println(encodeText2);
		System.out.println(messageEncode1.decode(encodeText));
		System.out.println(messageEncode2.decode(encodeText2));
	}

}
