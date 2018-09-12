package Leval¢ñ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pat1022 {
//runTimeError
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int d=scanner.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		int sum=a+b;
		while(sum!=0) {
			int k=sum%d;
			list.add(k);
			sum=sum/d;
		}
		for (int i = list.size()-1; i >=0; i--) {
			System.out.print(list.get(i));
		}
	}

}
