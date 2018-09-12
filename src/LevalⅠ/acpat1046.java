package Leval¢ñ;

import java.util.Scanner;

public class acpat1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a1=new int[n];
		int[] a2=new int[n];
		int[] b1=new int[n];
		int[] b2=new int[n];
		int a=0;
		int b=0;
			for(int i=0;i<n;i++){
				a1[i]=in.nextInt();
				a2[i]=in.nextInt();
				b1[i]=in.nextInt(); 
				b2[i]=in.nextInt();
			}
			for(int i=0;i<n;i++){
				if(a2[i]==a1[i]+b1[i]&&a2[i]!=b2[i]){
					b++;
				}
				if(b2[i]==a1[i]+b1[i]&&a2[i]!=b2[i]){
					a++;
				}
			}
			System.out.println(a+" "+b);
		}

	}


