package Leval¢ñ;

import java.util.Scanner;


public class AcPat1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int M=scanner.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=scanner.nextInt();
		}
		int K=M%N;
		for(int i=A.length-K;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		for(int i=0;i<A.length-K;i++) {
			if(i==A.length-K-1) {
				System.out.print(A[i]);
			}else {
			System.out.print(A[i]+" ");
			}
		}
	}

}
