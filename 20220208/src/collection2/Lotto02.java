package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		//List ���� ������ �����̱� ������ �ּҰ����� ���մϴ�.
		//���� �ܼ� == �񱳿����ڷ� ���� �񱳸� �ϴ°� �ƴ϶�
		//����Ʈ1.equals(����Ʈ2)�� �̿��� �ּҰ��� �ƴ�
		//���� ���� ����� ������ �񱳸� �� ���
		// �ζ� ���� ����Ʈ ���� ���ڰ� ��ġ�ϴ��� ���� �� �ֽ��ϴ�.
		//equals�� ���� ����� �������� ���� ���մϴ�.
		
		List<Integer> l1 =new ArrayList<>();
		List<Integer> l2 =new ArrayList<>();
	
		System.out.println("�ּҰ� �� : " + (l1 == l2));
		//�� �� �� ����Ʈ�̹Ƿ� ���ο� �� �ڷ᳢���� ���������� true��
		System.out.println(""+ l1 + l2);
		System.out.println("���ο� �� �ڷ᳢�� �� : " + l1.equals(l2));		
		// l1�� l2�� ���� ��Ҹ� �Է��ϵ�, ������ ���� ��� Ȯ���ϱ�
		// l1�� l2�� �����е��� ���� �ڷḦ �־��ּ���. ��� ������ �ٸ��� �־����.
		
		//�ڷ� �ֱ�
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(2);
		l2.add(3);
		l2.add(1);
		
		//���ؼ� true, false���� Ȯ���ϱ�
		System.out.println("" + l1 + l2);
		System.out.println("���ο� �� �ڷ᳢�� �� : " + l1.equals(l2));
	}
}
