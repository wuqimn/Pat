package Leval¢ñ;

import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list3 = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int n = scanner.nextInt();
			list.add(n);
			list3.add(n);
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					map.put(n, count);
				} else {
					n = 3 * n + 1;
					n = n / 2;
					map.put(n, count);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			Set<Integer> keys = map.keySet();
			for (Integer key : keys) {
				if (key == list.get(i)) {
					list3.remove(list3.indexOf(key));
					break;
				}
			}
		}
		Collections.sort(list3);
		for (int i = list3.size()-1; i>=0 ; i--) {
			if (i ==0) {
				System.out.print(list3.get(i));
			} else {
				System.out.print(list3.get(i) + " ");
			}
		}
	}
}