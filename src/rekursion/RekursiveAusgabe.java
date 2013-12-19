package rekursion;

public class RekursiveAusgabe {
	
	public static void rekursiveAusgabe1(int n){
		if(n == 0)return;
		System.out.println(n % 10);
		rekursiveAusgabe1(n / 10);
	}
	
	public static void rekursiveAusgabe2(int n){
		if(n == 0)return;
		rekursiveAusgabe2(n / 10);
		System.out.println(n % 10);
	}
	
	public static void main(String[] args){
		rekursiveAusgabe1(12345);
		rekursiveAusgabe2(12345);
	}

}