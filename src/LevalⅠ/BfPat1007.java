package Leval¢ñ;

import java.util.ArrayList;
import java.util.Scanner;

public class BfPat1007 {

	public static boolean Boolean(int num) {
		boolean f= true;
		if(num<2) {
			return f=false;
		}
		else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					f=false;
					break;
				}
			}
		}
		return f;
	}
	public static ArrayList< Integer>  INT(int num2){
		ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0;i<=num2;i++){
	      if(Boolean(i)){
	        list.add(i);
	      }
	    }
	    return list;
	}
	public static int numOfPriPairs(ArrayList<Integer> ArrList){
	    int count=0;
	    for(int i=0;i<ArrList.size()-1;i++){
	      if(ArrList.get(i+1)-ArrList.get(i)==2){
	        count++;
	      }
	    }
	    System.out.println(count-1);
	    return count;
	  }
	  
	  public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    numOfPriPairs(INT(scan.nextInt()));  
	  }
	}