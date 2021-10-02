package arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] heights = { 4, 3, 2, 1, 4 };
		int answer = bruteForceSoln(heights);
		System.out.println(answer);
	}

	private static int bruteForceSoln(int[] heights) {
		// Time Complexity: O(N^2)
		// Space Complexity: O(1)

		// Two-pointer technique
		int maxArea = 0;
		for (int p1 = 0; p1 < heights.length; p1++) {
			for (int p2 = p1 + 1; p2 < heights.length; p2++) {
				int height = Math.min(heights[p1], heights[p2]);
				int width = (p2 - p1);
				int area = height * width;
				maxArea = Math.max(maxArea, area);
			}
		}
		return maxArea;
	}

}
