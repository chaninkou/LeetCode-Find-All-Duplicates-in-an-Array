package leetcode442;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] nums = {4,3,2,7,8,2,3,1};
	
	System.out.println("Input: " + Arrays.toString(nums));
	
	FindAllDuplicatesOfArrayFunction solution = new FindAllDuplicatesOfArrayFunction();
	
	System.out.println("Solution: " + solution.findDuplicates(nums));
}
}
