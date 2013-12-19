package rekursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Geldautomat {

	public static void geldautomatA(int betrag) {
		if (betrag < 5)
			return;
		if (betrag >= 500) {
			System.out.println("500EUR");
			geldautomatA(betrag - 500);
		} else if (betrag >= 200) {
			System.out.println("200EUR");
			geldautomatA(betrag - 200);
		} else if (betrag >= 100) {
			System.out.println("100EUR");
			geldautomatA(betrag - 100);
		} else if (betrag >= 50) {
			System.out.println("50EUR");
			geldautomatA(betrag - 50);
		} else if (betrag >= 20) {
			System.out.println("20EUR");
			geldautomatA(betrag - 20);
		} else if (betrag >= 10) {
			System.out.println("10EUR");
			geldautomatA(betrag - 10);
		} else if (betrag >= 5) {
			System.out.println("5EUR");
			geldautomatA(betrag - 5);
		}
	}

	public static ArrayList<Integer> geldautomatB(int betrag) {
		if (betrag < 5)
			return new ArrayList<Integer>();
		if (betrag >= 500) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(500);
			tmp.addAll(geldautomatB(betrag - 500));
			return tmp;
		} else if (betrag >= 200) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(200);
			tmp.addAll(geldautomatB(betrag - 200));
			return tmp;
		} else if (betrag >= 100) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(100);
			tmp.addAll(geldautomatB(betrag - 100));
			return tmp;
		} else if (betrag >= 50) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(50);
			tmp.addAll(geldautomatB(betrag - 50));
			return tmp;
		} else if (betrag >= 20) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(20);
			tmp.addAll(geldautomatB(betrag - 20));
			return tmp;
		} else if (betrag >= 10) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(10);
			tmp.addAll(geldautomatB(betrag - 10));
			return tmp;
		} else {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(5);
			tmp.addAll(geldautomatB(betrag - 5));
			return tmp;
		}
	}
	
	public static int[] geldautomatC(int betrag){
		if (betrag < 5)
			return new int[7];
		if (betrag >= 500) {
			int[] tmp = geldautomatC(betrag - 500);
			tmp[0]++;
			return tmp;
		} else if (betrag >= 200) {
			int[] tmp = geldautomatC(betrag - 200);
			tmp[1]++;
			return tmp;
		} else if (betrag >= 100) {
			int[] tmp = geldautomatC(betrag - 100);
			tmp[2]++;
			return tmp;
		} else if (betrag >= 50) {
			int[] tmp = geldautomatC(betrag - 50);
			tmp[3]++;
			return tmp;
		} else if (betrag >= 20) {
			int[] tmp = geldautomatC(betrag - 20);
			tmp[4]++;
			return tmp;
		} else if (betrag >= 10) {
			int[] tmp = geldautomatC(betrag - 10);
			tmp[5]++;
			return tmp;
		} else {
			int[] tmp = geldautomatC(betrag - 5);
			tmp[6]++;
			return tmp;
		}
	}

	public static void main(String[] args) {
//		geldautomatA(463);
//		System.out.println(geldautomatB(463));
		System.out.println(Arrays.toString(geldautomatC(463)));
	}

}
