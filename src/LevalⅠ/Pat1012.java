package Leval¢ñ;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pat1012 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A1 = new ArrayList<Integer>();
		int sum1 = 0;
		String f1;
		String f2;
		String f3;
		String f4;
		String f5;
		List<Integer> A2 = new ArrayList<Integer>();
		int sum2 = 0;
		List<Integer> A3 = new ArrayList<Integer>();
		int sum3 = 0;
		List<Integer> A4 = new ArrayList<Integer>();
		Double sum4 = 0.0;
		List<Integer> A5 = new ArrayList<Integer>();
		int sum5 = 0;
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] s = str.split("\\s");
		String fin = "N";
		for (int i = 0; i < s.length; i++) {
			int k = Integer.valueOf(s[i]);
			if (k % 10 == 0) {
				sum1 = sum1 + k;
			} else {
				switch (k % 5) {
				case 1:
					A2.add(k);
					break;
				case 2:
					A3.add(k);
					break;
				case 3:
					A4.add(k);
					sum4 = sum4 + k;
					break;
				case 4:
					A5.add(k);
					break;
				}

			}
		}
		for (int u = 1; u <= A2.size(); u++) {
			if (u % 2 == 0) {
				sum2 = sum2 - A2.get(u - 1);
			} else {
				sum2 = sum2 + A2.get(u - 1);
			}
		}
		sum3 = A3.size();
		DecimalFormat df = new DecimalFormat("#.0");
		sum4 = sum4 / A4.size();
		String s4=df.format(sum4);
		for (int i = 0; i < A5.size(); i++) {
			if (sum5 < A5.get(i)) {
				sum5 = A5.get(i);
			}
		}
		sum5 = A5.get(0);
		if (sum1 == 0) {
			f1 = fin;
		} else {
			f1 = String.valueOf(sum1);
		}
		if (sum2 == 0) {
			f2 = fin;
		} else {
			f2 = String.valueOf(sum2);
		}
		if (sum3 == 0) {
			f3 = fin;
		} else {
			f3 = String.valueOf(sum3);
		}
		if (s4 ==null) {
			f4 = fin;
		} else {
			
			f4 = String.valueOf(s4);
		}
		if (sum5 == 0) {
			f5 = fin;
		} else {
			f5 = String.valueOf(sum5);
		}
		System.out.println(f1 + " " + f2 + " " + f3 + " " + s4 + " " + f5);
	}

}
