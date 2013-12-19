package rekursion;

public class Spiegeln {
	
	public static String umkehren(String s){
		if(s.length() == 1) return s;
		return s.charAt(s.length() - 1) + umkehren(s.substring(0, s.length() - 1));
	}

	public static void main(String[] args){
		System.out.println(umkehren("abcde"));
	}
	
}
