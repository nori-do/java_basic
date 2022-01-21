package heapmemory;

public class ArrayComparison {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		int[] arr3 = {1,2,3,4,5};
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		// �ٽ� {1, 2, 3, 4, 5}�� ��������
		arr1[0] = 1;
		
		// arr1(arr2)�� arr3�� ���빰��
		//�� �� {1, 2, 3, 4, 5}�� ������
		System.out.println(arr1 == arr3);
		System.out.println(arr1 == arr2);
		
		//equals()�� ����ϸ� �ּҰ��� �ƴ�
		//���� ���� ����� �����Ͱ� �������� ���Ѵ�.
		// ���1.equals(���2);
		System.out.println(arr1.equals(arr2));
		
	}
}
