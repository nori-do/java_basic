package arrays1;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		//sort�� ���ڻӸ� �ƴ϶� ������ ���� �� �ִ� �ٸ� �ڷ������� �۵��մϴ�.
		//�̸��׸� ����(A =65, a =97)�� �����ϴ� ���ڸ� ������ ������
		//���ڵ� ������ �����մϴ�.
		//ASCII �ڵ� ��Ģ�� ���� ���ĵ˴ϴ�.
		//���ڿ��� �� �ձ����� ASCII�ڵ� ��ȣ�� ��Ұ��踦 �̿��� ���ĵ˴ϴ�.
		String[] arr = {"apple", "Apple", "banana", "giraffe", "Zet", "�����ٶ�", "������", "���̷�"};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
