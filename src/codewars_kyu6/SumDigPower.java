package codewars_kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
	
	
	public static List<Long> sumDigPow(long a, long b) {

		List<Long> init = new ArrayList<Long>();
		List<Long> answer = new ArrayList<Long>();

		for (int i = (int) a; i <= b; i++) {

			init.add((long) i);

		}
		for (Long i : init) {

			String s = Long.toString(i);
			if (s.length() < 2) {
				answer.add(Long.parseLong(s));
			} else {
				long sum = 0;
				for (int j = 0; j < s.length(); j++) {
					ArrayList<Long> arrayl = new ArrayList<Long>();
					String sub = s.substring(j, j + 1);
					Long l = Long.parseLong(sub);
					sum += Math.pow(l, (j + 1));
					// System.out.println(sum);
					if (sum == i) {
						answer.add(sum);
					}
				}

			}

		}
		// System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		
		sumDigPow(1, 10);
		

	}

}
