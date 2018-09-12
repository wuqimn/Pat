package Leval¢ñ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class BufferReader{

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] k=br.readLine().split(" ");
		int n = Integer.parseInt(k[0]);
	    int p = Integer.parseInt(k[1]);
	    String[] data = br.readLine().split(" ");
	    int[] array = new int[n];
	    for (int i = 0; i < n; i++) {
	      array[i] = Integer.parseInt(data[i]);
	    }
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		int M=Collections.max(list);
		Collections.sort(list);
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if(M*1.0/p>list.get(i)) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(n-count);
	}
}
