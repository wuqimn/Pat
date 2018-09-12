package Leval¢ñ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BfPat1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		for (int i = 1; i <= 1666; i++) {
		int a1=6*i-1;
		int a3=(int) Math.sqrt(a1);
		int k1=0;
		int k2=0;
		int a2=6*i+1;
		int a4=(int) Math.sqrt(a2);
		for(int j1=2;j1<=a3;j1++) {
			if(a1%j1==0) {
				k1++; 
			}
		}
		for(int j=2;j<=a4;j++) {
			if(a2%j==0) {
				k2++;
			}
		}
		if(k1==0) {
			list.add(a1);
		}
		if(k2==0) {
			list.add(a2);
		}
		}
		for (int k=1; k <=m-n+1;k++) {
			if (k%10==0) {
				System.out.println(list.get(k+n-2));
			}
			else if (k==m-n+1) {
				System.out.print(list.get(k+n-2));
			}
			else {
				System.out.print(list.get(k+n-2)+" ");
			}
		}		
	}
}
