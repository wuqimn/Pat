package Leval¢ñ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcPat1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String number = scanner.next();

			String number1 = number.substring(0, number.length() - 1);
			String number2 = number.substring(number.length() - 1, number.length());
			int sum;
			int ys;
			if (number1.matches("[0-9]+")) {
				String num[] = number1.split("");
				sum = Integer.valueOf(num[0]) * 7 + Integer.valueOf(num[1]) * 9 + Integer.valueOf(num[2]) * 10
						+ Integer.valueOf(num[3]) * 5 + Integer.valueOf(num[4]) * 8 + Integer.valueOf(num[5]) * 4
						+ Integer.valueOf(num[6]) * 2 + Integer.valueOf(num[7]) * 1 + Integer.valueOf(num[8]) * 6
						+ Integer.valueOf(num[9]) * 3 + Integer.valueOf(num[10]) * 7 + Integer.valueOf(num[11]) * 9
						+ Integer.valueOf(num[12]) * 10 + Integer.valueOf(num[13]) * 5 + Integer.valueOf(num[14]) * 8
						+ Integer.valueOf(num[15]) * 4 + Integer.valueOf(num[16]) * 2;
				ys = sum % 11;
				switch (ys) {
				case 0:
					if (!number2.equals("1")) {
						list.add(number);
					}
					break;

				case 1:
					if (!number2.equals("0")) {
						list.add(number);
					}
					break;

				case 2:
					if (!number2.equals("X")) {
						list.add(number);
					}
					break;

				case 3:
					if (!number2.equals("9")) {
						list.add(number);
					}
					break;

				case 4:
					if (!number2.equals("8")) {
						list.add(number);
					}
					break;

				case 5:
					if (!number2.equals("7")) {
						list.add(number);
					}
					break;

				case 6:
					if (!number2.equals("6")) {
						list.add(number);
					}
					break;

				case 7:
					if (!number2.equals("5")) {
						list.add(number);
					}
					break;

				case 8:
					if (!number2.equals("4")) {
						list.add(number);
					}
					break;
				case 9:
					if (!number2.equals("3")) {
						list.add(number);
					}
					break;
				case 10:
					if (!number2.equals("2")) {
						list.add(number);
					}
					break;

				}
			} else {
				list.add(number);
			}
		}
		if (list.size() == 0) {
			System.out.println("All passed");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

}

