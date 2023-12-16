package challenges;

import java.util.Arrays;
import java.util.List;

public class breakingRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		int maxScore = scores.get(0);
		int minScore = scores.get(0);
		int higher = 0;
		int lower = 0;

		for (int s : scores) {
			if (s > maxScore) {
				maxScore = s;
				higher++;
			} else if (s < minScore) {
				minScore = s;
				lower++;
			}
		}
		return Arrays.asList(higher, lower);
	}
}
