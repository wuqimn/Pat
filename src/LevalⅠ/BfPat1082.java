package Leval¢ñ;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BfPat1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<String> list1=new ArrayList<String>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<Integer>();
		List<Integer> list4=new ArrayList<Integer>();
		int i=in.nextInt();
		for (int j = 0; j < i; j++) {
			list1.add(in.next());
			list2.add(in.nextInt());
			list3.add(in.nextInt());
		}
		for (int j = 0; j < list1.size(); j++) {
			list4.add((int) (Math.pow(list2.get(j), 2)+Math.pow(list3.get(j), 2)));
		}
		int max=Collections.max(list4);
		int min=Collections.min(list4);
		int a=list4.indexOf(max);
		int b=list4.indexOf(min);
		System.out.println(list1.get(b)+" "+list1.get(a));
	}
}
