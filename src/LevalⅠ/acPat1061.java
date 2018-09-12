package Leval¢ñ;

import java.util.Scanner;

public class acPat1061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int sum=0;
		int fs[]=new int [M];
		int da[]=new int [M];
		for(int i=0;i<fs.length;i++){
			fs[i]=in.nextInt();
		}
		for(int i=0;i<da.length;i++){
			da[i]=in.nextInt();
		}
		int[][] a=new int[N][M];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]==da[j]){
					sum=sum+fs[j];
				}
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
