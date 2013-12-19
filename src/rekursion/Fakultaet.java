package rekursion;

public class Fakultaet {
	
	public static long fakultaet(int n){
		if(n == 1) return 1;
		return n * fakultaet(n - 1);
	}
	
	public static void main(String[] args){
		System.out.println(fakultaet(4));
	}

}
