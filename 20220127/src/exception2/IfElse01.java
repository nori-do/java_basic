package exception2;

import java.util.Scanner;

public class IfElse01 {
	public static void main(String[] args) {
		//int a, b�� ��ĳ�ʷ� ���� ������ �Է¹޾��ּ���.
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("1�� ������ �Է����ּ���");
		a = scan.nextInt();
		System.out.println("2�� ������ �Է����ּ���");
		b = scan.nextInt();
		// a / b�� ����� �ֿܼ� ����ֽõ�
		// a / b �� �����ϱ� ����
		// b�� 0���� �˻��ؼ� 0�� ����
		// a/b�� �������� ���� "0���� ���ڸ� ���� �� �����ϴ�."
		//��� ��� ��쵵�� ������ �ۼ����ּ���.
		if(b == 0) {
			System.out.println("0���� ���ڸ� ���� �� �����ϴ�.");
		}else {
			System.out.println(a / b);
		}
	scan.close();
	}
	
}
