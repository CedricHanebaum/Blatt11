package rekursion;

public class RekursiveSumme {
	
	public static int summe(int anfang, int ende){
		if(anfang > ende) return 0;
		return ende + summe(anfang, ende - 1);
	}
	
	public static void main(String[] args){
		System.out.println(summe(1, 5));
	}

}
