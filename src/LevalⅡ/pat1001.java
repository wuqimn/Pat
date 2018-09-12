package Leval¢ò;


import java.security.spec.DSAGenParameterSpec;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pat1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		List<String> list=new ArrayList<>();
		int ans=a+b;
		if(ans<0) {
			System.out.println(ans);
			ans=-ans;
			System.out.println(ans);
			while(ans>=1000) {
				System.out.println("aaa");
				DecimalFormat df = new DecimalFormat("000");
				int k=ans%1000;
				String f=df.format(k);
				list.add(f);
				
			}
			for(int i=list.size();i>0;i--) {
				System.out.print(","+list.get(i-1));
			}
		}
			
		}

}
