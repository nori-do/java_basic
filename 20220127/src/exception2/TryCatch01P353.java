package exception2;

import java.util.Scanner;

public class TryCatch01P353 {

	public static void main(String[] args) {
		//try~cath ������ ũ�� ���ܰ� �߻��� ���ɼ��� �ִ� ������ ����δ�
		//try ����, ���ܰ� ������ �߻����� �� ��ó�� �ڵ带 �����ϴ�
		//catch ������ �����ϴ�.
		
		//��ĳ�ʷ� int a, b�� ������ �Է¹޴� �κб����� �ۼ����ּ���.
		Scanner scan = new Scanner(System.in);
		System.out.println("1��° ������ �Է����ּ���.");
		int a = scan.nextInt();
		System.out.println("2��° ������ �Է����ּ���.");
		int b = scan.nextInt();
		//if~else ��� try~catch�� �ۼ��մϴ�.
		try {
			//try ������ ���ܰ� �߻��� ���ɼ��� �ִ� ������ ���� �����ֽ��ϴ�.
			System.out.println("�������!");
			System.out.println(a/b);//���ܰ� �� ���ɼ��� �����ϴ� �ٽ� ����
			System.out.println("��� ��!");
		}catch(Exception e) {
			//catch ��Ͽ��� (Exception e)�� �⺻���� ����.
			//Exception e �� ���� ��� ���� ������ �����ϰ� ���� ó�� �����ϴ�.
			//���Ŀ� Ư���� ������ ���ܸ� ���� ó���ϰ� ���� ���� �ٸ� ���ܸ��� ������ �ȴ�.
			System.out.println("������ ���ڴ� 0�� �� �� �����ϴ�.");
		}finally {
			//��� try~catch ������ ������ ������ ���� ������ �ڵ�
			System.out.println("�ڵ� ��!");
		}
	
	
		
		
		scan.close();
	}
}
