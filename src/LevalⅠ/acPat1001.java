package Leval¢ñ;

import java.util.Scanner;

public class acPat1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=0;
		if(n==0){
			return;
		}
		while(n!=1){
			if(n%2==0){
				n=n/2;
				i++;
			}
			else {
				n=3*n+1;
				n=n/2;
				i++;
			}
			  
		}
		System.out.println(i);
	
	}
}
