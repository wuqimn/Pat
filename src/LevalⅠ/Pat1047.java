package Leval¢ñ;

import java.util.Scanner;

public class Pat1047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String num[]=new String[N];
		int fs[]=new int[N];
	    String dw[]=new String[N];
	    int sum[]=new int[N];
		for(int i=0;i<N;i++){
			num[i]=in.next();
			String sj[]=num[i].split("-");
			dw[N]=sj[0];
			fs[i]=in.nextInt();
			sj[0]=null;
		}
		for(int i=0;i<dw.length;i++){
			sum[i]=fs[i];
			for(int j=i+1;j<dw.length;j++){
				if(dw[i].equals(dw[j])){
					sum[i]=fs[i]+fs[j];
				}
			}
		}
		for(int i=0;i<sum.length;i++){
		System.out.println(sum[i]);	
		}
		
	}

}
