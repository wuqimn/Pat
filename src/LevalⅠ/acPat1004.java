package Leval¢ñ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class acPat1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int maxnum=0;
		int minxum=0;
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<Integer> list3=new ArrayList<Integer>();
		{
		};
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			list.add(in.next());
			list2.add(in.next());
			list3.add(in.nextInt());
		}
		
		int max=Collections.max(list3);
		int min=Collections.min(list3);
		for(int i=0;i<list3.size();i++){
			if(list3.get(i)==max){
				maxnum=i;
			}
			if(list3.get(i)==min){
				minxum=i;
			}
		}
		System.out.println(list.get(maxnum)+" "+list2.get(maxnum));
		System.out.println(list.get(minxum)+" "+list2.get(minxum));

	}

}
