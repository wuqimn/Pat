package Leval¢ñ;


import java.util.ArrayList;
import java.util.Scanner;

public class AcPat1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<String> list3 = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			list.add(n.substring(i, i + 1));
		}
		for (int i = 0; i < list.size(); i++) {
			list2.add(Integer.valueOf(list.get(i)));
		}
		for (int i = 0; i < list2.size(); i++) {
			sum = sum + list2.get(i);
		}
		String string = String.valueOf(sum);
		for (int i = 0; i < string.length(); i++) {
			list3.add(string.substring(i, i + 1));
		}
		for (int i = 0; i < list3.size(); i++) {
			if (i == list3.size() - 1) {
				if (Integer.valueOf(list3.get(i)) == 1) {
					System.out.print("yi");
				}
				if (Integer.valueOf(list3.get(i)) == 2) {
					System.out.print("er");
				}
				if (Integer.valueOf(list3.get(i)) == 3) {
					System.out.print("san");
				}
				if (Integer.valueOf(list3.get(i)) == 4) {
					System.out.print("si");
				}
				if (Integer.valueOf(list3.get(i)) == 5) {
					System.out.print("wu");
				}
				if (Integer.valueOf(list3.get(i)) == 6) {
					System.out.print("liu");
				}
				if (Integer.valueOf(list3.get(i)) == 7) {
					System.out.print("qi");
				}
				if (Integer.valueOf(list3.get(i)) == 8) {
					System.out.print("ba");
				}
				if (Integer.valueOf(list3.get(i)) == 9) {
					System.out.print("jiu");
				}
				if (Integer.valueOf(list3.get(i)) == 0) {
					System.out.print("ling");
				}
			} else {
				if (Integer.valueOf(list3.get(i)) == 1) {
					System.out.print("yi" + " ");
				}if (Integer.valueOf(list3.get(i)) == 2) {
					System.out.print("er" + " ");
				}if (Integer.valueOf(list3.get(i)) == 3) {
					System.out.print("san" + " ");
				}if (Integer.valueOf(list3.get(i)) == 4) {
					System.out.print("si" + " ");
				}if (Integer.valueOf(list3.get(i)) == 5) {
					System.out.print("wu" + " ");
				}if (Integer.valueOf(list3.get(i)) == 6) {
					System.out.print("liu" + " ");
				}if (Integer.valueOf(list3.get(i)) == 7) {
					System.out.print("qi" + " ");
				}if (Integer.valueOf(list3.get(i)) == 8) {
					System.out.print("ba" + " ");
				}if (Integer.valueOf(list3.get(i)) == 9) {
					System.out.print("jiu" + " ");
				}if (Integer.valueOf(list3.get(i)) == 0) {
					System.out.print("ling" + " ");
				}
			}
		}
	}
}
