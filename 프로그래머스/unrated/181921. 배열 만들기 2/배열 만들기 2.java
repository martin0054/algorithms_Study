import java.util.Arrays;
class Solution {
    public int[] solution(int l, int r) {
        
        int[] answer = new int[r - l];
		int index = 0;

		for (int i = l; i <= r; i++) {

			Boolean flag = false;
			String sNum = Integer.toString(i);

			for (int j = 0; j < sNum.length(); j++) {

				int k = Integer.parseInt(Character.toString(sNum.charAt(j)));

				if (k % 10 == 0 || k % 10 == 5) {
					k /= 10;
					flag = true;

				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				answer[index++] = i;

			}
		}

		if (index == 0) {
			answer = new int[] { -1 };
		} else {
			answer = Arrays.copyOfRange(answer, 0, index);
		}

		return answer;
    }
}