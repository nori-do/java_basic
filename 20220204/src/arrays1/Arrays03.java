package arrays1;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//Arrays.copyOfRange()�� copyOf()�� ����������
		//������ 0�� �ε����� �����Ǵ� copyOf�� �޸�
		//copyOfRange(���۹�ȣ, ����ȣ +1);
		//�� ���� ���������� �������� �� �� ������ �� �ֽ��ϴ�.
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7); // 3~6(3,4,5,6,)7�� ����X
		System.out.println(Arrays.toString(arrCopy));
		
		//�� �ε��� ������ ����� �����غ�����.
		
		int[] arrCopy2 = Arrays.copyOfRange(arrCopy, 0, 15);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
