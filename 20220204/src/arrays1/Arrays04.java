package arrays1;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//Arrays.sort(�迭);�� �迭 ���� ������
		//���� �����ϼ��� 0�� ������, ū �����ϼ��� �������� ������ ��ġ�մϴ�.
		int[] arr = {21,60,32,44,1,69,99,89,36};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
