package �������迭;

public class Ex02�������迭 {

	public static void main(String[] args) {

		int array[][] = new int[5][5];

		// �Ʒ��������� 1�� ����
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

		// �Ʒ��������� 1�� ���� 2
		int num = 1;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num++;
			}
		}
		// ��¹���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// ������ũ ������� ����ϱ�
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
		// ��¹���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}

		// if ���� ������ũ ������� ����ϱ�
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

		// ������ �� ���� �ϴ� ��
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