package Leval¢ñ;

import java.util.Scanner;

public class acpat1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				if(j==i){
					continue;
				}
				else {
					sum=sum+num[i]*10+num[j];
				}
			}
		}
		System.out.println(sum);
	}

}
