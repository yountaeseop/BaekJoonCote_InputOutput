package java11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());// 최대힙만들기
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return - Integer.compare(o1,o2);
			}
		});// 최대힙만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 // 입력 개수 읽기
        int n = Integer.parseInt(br.readLine().trim());
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int a = 0; a < n; a++) {
			String s = br.readLine();
			
			int nt = Integer.parseInt(s);
			if(nt != 0) {
				maxHeap.add(Integer.parseInt(s));				
			} else {
				if(maxHeap.isEmpty()) {
					result.add(0);
				} else {
					int maxValue = maxHeap.poll();
					result.add(maxValue);
				}
			}
		}
		
		for(int a = 0; a < result.size(); a++) {
			System.out.println(result.get(a));
			
		}
		
	}

}
