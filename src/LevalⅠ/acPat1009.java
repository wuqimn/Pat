package Leval¢ñ;

import java.util.Scanner;

public class acPat1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String k=in.nextLine();
		String[] l=k.split("\\s+");
		for(int j=l.length-1;j>=0;j--) {
			if(j==0) {
				System.out.print(l[j]);
			}else {
			System.out.print(l[j]+" ");
		}
		}
	}
}
