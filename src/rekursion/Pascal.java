package rekursion;

public class Pascal {
	
	public static int getPascalWert(int i, int j){
		if(j == 0|| j == i) return 1;
		return getPascalWert(i - 1, j) + getPascalWert(i - 1, j - 1);
	}
	
	public static void main(String[] args){
		System.out.println(getPascalWert(4, 2));
	}

}
