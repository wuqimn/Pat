package LevalⅠ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BFPat1038 {
//最后一个测试口runtimeerror
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			list2.add(scanner.nextInt());
		}
		Map map = new HashMap<>();
		for (int temp : list) {
			Integer count = (Integer) map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		for (int i = 0; i < num; i++) {

			if (i == num - 1) {

				if (map.get(list2.get(i)) == null) {
					System.out.print("0");
				} else {
					System.out.print(map.get(list2.get(i)));
				}
			} else {

				if (map.get(list2.get(i)) == null) {
					System.out.print("0"+" ");
				} else {
					System.out.print(map.get(list2.get(i))+" ");
				}
			}
		}
	}

}
