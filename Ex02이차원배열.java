package 이차원배열;

public class Ex02이차원배열 {

	public static void main(String[] args) {

		int array[][] = new int[5][5];

		// 아래방향으로 1씩 증가
		for (int j = 0; j < array.length; j++) {
			int count = -4;
			count = count + j;
			for (int i = 0; i < array[j].length; i++) {
				count += 5;
				array[j][i] = count;
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

		// 아래방향으로 1씩 증가 2
		int num = 1;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num++;
			}
		}
		// 출력문장
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// 스네이크 모양으로 출력하기
		int num1 = 1;

		for (int j = 0; j < 5; j++) {

			if (j % 2 == 1) {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num1++;
				}
			} else {

				for (int i = 0; i < 5; i++) {
					array[j][i] = num1++;
				}
			}
		}
		// 출력문장
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}

		// if 없이 스네이크 모양으로 출력하기
		int num2 = 0;

		for (int j = 0; j < 5; j += 2) {
			for (int i = 0; i < 5; i++) {
				array[j][i] = ++num2;
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
			num2 += 5;
			for (int i = 0; i < 5; i++) {
				array[j][i] = num2--;
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
			num2 += 5;
		}

		// 위에꺼 더 쉽게 하는 법
		int num3 = 0;
		int start = 0;
		int end = 4;
		int temp = 0;
		int reverse = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = start; j != end + reverse; j += reverse) {
				array[i][j] = ++num3;
			}
			temp = start;
			start = end;
			end = temp;
			reverse *= -1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}