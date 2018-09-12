package Leval¢ñ;

import java.util.Scanner;

public class acPat1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		for (int j = 0; j < i; j++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			if (c - b < a) {
				System.out.println("Case #" + (j + 1) + ": true");
			} else {
				System.out.println("Case #" + (j + 1) + ": false");
			}
		}

	}

}
