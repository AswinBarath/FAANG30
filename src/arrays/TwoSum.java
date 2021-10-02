package arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 7, 9, 2 };
		int target = 11;
//		int[] ans = bruteForceSoln(nums, target);
		int[] ans = optimalSoln(nums, target);
		for (int num : ans) {
			System.out.println(num);
		}

	}

	public static int[] optimalSoln(int[] nums, int target) {
		// Time Complexity: O(N)
		// Space Complexity: O(N)

		// Using HashMap
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int p = 0; p < nums.length; p++) {
			int numberToFind = target - nums[p];
			if (map.containsKey(nums[p])) {
				return new int[] { map.get(nums[p]), p };
			}
			map.put(numberToFind, p);
		}
		return new int[] { -1, -1 };
	}

	public static int[] bruteForceSoln(int[] nums, int target) {
		// Time Complexity: O(N^2)
		// Space Complexity: O(1)

		// Two-pointer technique
		for (int p1 = 0; p1 < nums.length; p1++) {
			int numberToFind = target - nums[p1];
			for (int p2 = p1 + 1; p2 < nums.length; p2++) {
				if (numberToFind == nums[p2]) {
					return new int[] { p1, p2 };
				}
			}
		}

		return new int[] { -1, -1 };
	}
}
