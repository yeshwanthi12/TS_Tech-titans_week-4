package Arrays;

public class MaxMin {
	public static void main(String[] args) {

		int[] number = {20, 30, 40, 50, 60, 70};
		int max, min;

		max = number[0];
		min=number[0];
		for (int i = 1; i < number.length; i++) {

		if (max < number[i]) {
		max = number[i];
		}
		}

		System.out.println(max);
		
		for (int i = 1; i < number.length; i++) {

			if (min >number[i]) {
			min = number[i];
			}
			}

			System.out.println(min);
		}

}
