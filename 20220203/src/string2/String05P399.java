package string2;

import java.util.Scanner;

public class String05P399 {

	public static void main(String[] args) {
		//.length()�� charAt()�� Ȱ���� �Էµ� ��ü ���ڿ���
		// �� ���ھ� �� �پ� ó���ϴ� ������ �ۼ����ּ���.
		
		//���ڿ��� Scanner�� �Է¹޽��ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���.");
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		sc.close();
	}
}
