import java.util.*;
public class RunLengthEncoding {

	public static void main(String[] args) {
		String s = "BBBAAAAAAIIIIDDJUUUUMMMWWWWXXXXAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		String encs = encode(s);
		String decs = decode(encs);
		//System.out.println(decs);
		System.out.println(s+"\n"+encs+"\n"+decs);
	}

	public static String encode(String s) {
		char c = s.charAt(0);
		int count = 1;
		StringBuilder strb = new StringBuilder();
		for(int i = 1; i<s.length(); i++) {
			if(c == s.charAt(i)){
				count += 1;
			} else {
				strb.append(count);
				strb.append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
		strb.append(count);
		strb.append(c);
		return strb.toString();
	}

	public static String decode(String s) {
		StringBuilder strb = new StringBuilder();
		int num = 0;
		char c = ' ';
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) < 58) {
				num *= 10;
				num += s.charAt(i) - '0';
			} else {
				c = s.charAt(i);
				for(int j = 0; j<num ; j++) {
					strb.append(c);
				}
				num = 0;
			}
			//System.out.println(num);
			//System.out.println(c);
		}
		return strb.toString();
	}



}