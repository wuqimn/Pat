package Leval¢ñ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ACPat1043 {
	public static int appearNumber(String srcText, String findText) {
		int count = 0;
		Pattern p = Pattern.compile(findText);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;

	}

	public static int appearNumber2(String srcText, String findText2) {
		int count = 0;
		Pattern p = Pattern.compile(findText2);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;

	}

	public static int appearNumber3(String srcText, String findText3) {
		int count = 0;
		Pattern p = Pattern.compile(findText3);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;

	}

	public static int appearNumber4(String srcText, String findText4) {
		int count = 0;
		Pattern p = Pattern.compile(findText4);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;

	}

	public static int appearNumber5(String srcText, String findText5) {
		int count = 0;
		Pattern p = Pattern.compile(findText5);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;

	}

	public static int appearNumber6(String srcText, String findText6) {
		int count = 0;
		Pattern p = Pattern.compile(findText6);
		Matcher m = p.matcher(srcText);
		while (m.find()) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String srcText = scanner.next();
		String findText = "P";
		String findText2 = "A";
		String findText3 = "T";
		String findText4 = "e";
		String findText5 = "s";
		String findText6 = "t";
		int num = appearNumber(srcText, findText);
		int num2 = appearNumber2(srcText, findText2);
		int num3 = appearNumber3(srcText, findText3);
		int num4 = appearNumber4(srcText, findText4);
		int num5 = appearNumber5(srcText, findText5);
		int num6 = appearNumber6(srcText, findText6);
		List<Integer> list=new ArrayList<>();
		list.add(num);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		list.add(num5);
		list.add(num6);
		int max=Collections.max(list);
		for (int i = 0; i < max; i++) {
			if (i<num) {
				System.out.print(findText);
			} 
			if (i<num2) {
				System.out.print(findText2);
			} 
			if (i<num3) {
				System.out.print(findText3);
			} 
			if (i<num4) {
				System.out.print(findText4);
			} 
			if (i<num5) {
				System.out.print(findText5);
			} 
			if (i<num6) {
				System.out.print(findText6);
			} 
		}
	}

	
}
