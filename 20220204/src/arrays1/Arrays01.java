package arrays1;

import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		//���� Ž��(binary search)�� Ž�� �˰��� ��
		//�������� ������ �����ִ� �˰����Դϴ�.
		//�ٸ�, ���࿡ �ռ� ������������
		//1. �迭���ο� �ߺ��Ǵ� ���� ���� ��
		//2. �迭�� ��������(���� �����ϼ��� 0���ε����� ������)�־�� ��.
		
		//������ �� �� ������ �迭 ���θ� Ž���� ���� ã�� ����.
		int[] arr1 = {5,7,6,1,3,9,0,12};
		
		//���� Ž�� ���� ��ɾ� : Arrays.binarySearch(�迭��, ã�� ��);
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
	
		//������ �� ������ �迭 arr2�� ���� ����Ž���� ������
		// �� ����Ǵ��� Ȯ���غ�����.
	
		int[] arr2 = {0,1,3,5,6,7,9,12};
		
		//���� Ž�� ���� ��ɾ� : Arrays.binarySearch(�迭��, ã�� ��);
		int b = Arrays.binarySearch(arr2, 9);
		System.out.println(b);
	}
	
}
