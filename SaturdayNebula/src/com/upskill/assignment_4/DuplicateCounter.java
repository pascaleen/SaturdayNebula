package com.upskill.assignment_4;

import java.util.LinkedHashMap;

public class DuplicateCounter {
	
	public static int countDuplicates(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int duplicateCount = 0;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int count : map.values()) {
            if (count > 1) {
                duplicateCount++; // Count how many numbers have duplicates
            }
        }
        return duplicateCount;
    }


	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 2, 3, 5, 1, 6, 1};
        System.out.println("Count of duplicate values: " + countDuplicates(numbers));
		// TODO Auto-generated method stub

	}

}
