package arrays1;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//Arrays.copyOf()�� Ư���� �迭�� ���ۺ��� n���� ©�� �����մϴ�.
		int[] arr = { 1,2,3,4,5};
		
		int[] arrCopy = Arrays.copyOf(arr, 3);//0���� 3�� {0,1,2};
		System.out.println(arrCopy);
		System.out.println(Arrays.toString(arrCopy));
	
		// ���� �������� ��� �����ϸ� �������� 0���� ä�����ϴ�.
		int[] arrCopy2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arrCopy2));
	
	
	}
}
