package com;

import java.util.HashMap;
import java.util.Map;

public class Bills {
	public static void main(String[] args) {
		int[] arr = {5, 5, 5, 10, 20, 10};
		System.out.println(Bills.settlements(6, 3, arr));
	}
	
	public static int settlements(int N, int K, int[] bills) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(5, 0);
		map.put(10, 0);
		map.put(20, 0);
		int count = 0;
		
		for(int i=1; i<=N; i++) {
			if(bills[i-1] == 5) {
				int fives = map.get(5);
				fives += 1;
				map.put(5, fives);
			}
			else if(bills[i-1] == 10) {
				int fives = map.get(5);
				int tens = map.get(10);
				if(fives > 0) {
					fives -= 1;
					tens += 1;
					map.put(5, fives);
					map.put(10, tens);
				}else {
					return count;
				}
			}else if(bills[i-1] == 20) {
				int fives = map.get(5);
				int tens = map.get(10);
				int twenties = map.get(20);
				if(fives > 0 && tens > 0) {
					fives -= 1;
					tens -= 1;
					twenties += 1;
					map.put(5, fives);
					map.put(10, tens);
					map.put(20, twenties);
				}else if(fives >= 3) {
					fives -= 3;
					twenties += 1;
					map.put(5, fives);
					map.put(20, twenties);
				}else {
					return count;
				}
			}
			
			if(i == K) {
				int fives = map.get(5);
				if(fives > 0) {
					fives -= 1;
					map.put(5, fives);	
				}else {
					return count;
				}
			}
			
			count += 1;
		}
		
		return count;
	}
}
