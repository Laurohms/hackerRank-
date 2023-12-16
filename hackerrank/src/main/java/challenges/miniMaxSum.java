package challenges;

import java.util.Collections;
import java.util.List;

public class miniMaxSum {

	public static void miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		long minSum = 0;
		long maxSum = 0;

		for (int i = 0; i < 4; i++) {
			minSum += arr.get(i);
		}
		for (int i = 1; i <= 4; i++) {
			maxSum += arr.get(i);
		}
		System.out.println(minSum + " " + maxSum);

	}
}
