package rekursion;

public class EuklidAlgo {
	
	public static int ggt(int a, int b){
		if(a == b) return a;
		if(a > b) return ggt(a-b, b);
		return ggt(a, b-a);
	}
	
	public static void main(String[] args){
		
	}

}
