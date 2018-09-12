package LevalⅠ;

import java.util.Scanner;

public class AcPat1006{
//少了个千数位
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if(n%1000!=0){
			  int n0=n/1000;
			  int n1 = n / 100;
				int n3 = n % 10;
				int n2 = n / 10 % 10;
				for(int i = 0; i < n0; i++) {
				  System.out.print("Q");
				}
				for (int i = 0; i < n1; i++) {
					System.out.print("B");
				}
				for (int i = 0; i < n2; i++) {
					System.out.print("S");
				}
				for (int i = 0; i < n3; i++) {
					System.out.print(i + 1);
				}
			}
			else if (n % 100 != 0) {
				int n1 = n / 100;
				int n3 = n % 10;
				int n2 = n / 10 % 10;
				for (int i = 0; i < n1; i++) {
					System.out.print("B");
				}
				for (int i = 0; i < n2; i++) {
					System.out.print("S");
				}
				for (int i = 0; i < n3; i++) {
					System.out.print(i + 1);
				}
			} else if (n % 10 != 0) {
				int n3 = n % 10;
				int n2 = n / 10 % 10;
				for (int i = 0; i < n2; i++) {
					System.out.print("S");
				}
				for (int i = 0; i < n3; i++) {
					System.out.print(i + 1);
				}
			} else if (n % 1 != 0) {
				for (int i = 0; i < n; i++) {
					System.out.print(i + 1);
				}

			}
			System.out.println();
		}
	}
}

		