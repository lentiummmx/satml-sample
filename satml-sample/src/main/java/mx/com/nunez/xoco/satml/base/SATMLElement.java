/**
 * 
 */
package mx.com.nunez.xoco.satml.base;

import java.io.Serializable;
import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 * @author Jose Daniel Morales Rios
 *
 */
public abstract class SATMLElement implements Serializable {

	/**
	 * 
	 */
	public SATMLElement() {
		// TODO Auto-generated constructor stub
	}
	
	private static final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static String byteArrToHexString(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_CHARS[v >>> 4];
			hexChars[j * 2 + 1] = HEX_CHARS[v & 0x0F];
		}
		return new String(hexChars);
	}
	
	public static String strToHexString(String string, Charset... charset) {
		if (string.trim().isEmpty() || string.trim().equals("")) {
			return "";
		}
		return charset != null && charset.length > 0 ?
				String.format("%x", 
						new BigInteger(1, string.getBytes(charset[0]))) :
				String.format("%x",
						new BigInteger(1, string.getBytes(/* YOUR_CHARSET? */)));
	}
    
    public static String int_to_hex(int param, int min) {
    	String intHexCode = String.format("%0" + (min * 2) + "x", param);
    	System.out.println("int_hex: " + intHexCode);
    	return intHexCode.replaceAll(" ", "").toUpperCase();
    }
    
    public static int length_code(String hexCode) {
    	int length = hexCode.replace(" ", "").length() / 2;
    	System.out.println("length_code: " + length);
    	return length;
    }
    
    public static String complete_code(String hexCode, int... padding) {
    	String completeHexCode = "00";
    	int length = length_code(hexCode);
    	int tmpPadding = padding != null && padding.length > 0 ? padding[0] : 1;
    	
    	if(length <= 127 || tmpPadding == 2) {
    		completeHexCode = String.format("%s %s", new String[] {int_to_hex(length, tmpPadding), hexCode});
    	} else if(length > 127 && length <= 255) {
    		completeHexCode =  String.format("81 %s %s", new String[] {int_to_hex(length, tmpPadding), hexCode});
    	} else if(length > 255) {
    		completeHexCode = String.format("82 %s %s", new String[] {int_to_hex(length, 2), hexCode});
    	}
    	return completeHexCode.replaceAll(" ", "").toUpperCase();
    }
	
	public abstract String toByteCode();
	
	private String bytecodeTag;
	
	private String length;
	
	private String attributeBytes;
	
	private String value;

}
