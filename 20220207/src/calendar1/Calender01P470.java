package calendar1;

import java.util.Calendar;

public class Calender01P470 {

	public static void main(String[] args) {
		//Calendar�� ���� �ð��� �Ϲ����� ����� �ƴ� ����, ����/���� ������
		//�޷±������� ǥ�����ִ� ����Դϴ�.
		//Calender.getInstance();�� �̿��� ����մϴ�.
		//�߻�Ŭ�������� newŰ����� ���� ������ �� �� �����ϴ�.
		
		//Calendar now = new Calender(); �̰� �ƴ϶�
		Calendar now = Calendar.getInstance();
		
		// now.get(Calendar.���ϴ�����); gudtlrdmfh whghlgkqslek.
		System.out.println("�⵵ : " + now.get(Calendar.YEAR));
		//���� ��ȸ�غ�����. ���� 0���� ���ϴ�.(0�� 1��, 11�� 12��)
		System.out.println("�� : " + (now.get(Calendar.MONTH) + 1));
		//���� DAY_OF)MONTH�Դϴ�.
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));//DATE�ε� ��ü������
		//���ϵ� ���� �� �ִµ�, ������ 1�� �Ͽ���, 7�� ������Դϴ�.(0�� ����)
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK));
		//���� 0, ���� 1
		System.out.println("����, ���� ���� : " + now.get(Calendar.AM_PM));
		System.out.println("�� : " + now.get(Calendar.HOUR));
		System.out.println("�� : " + now.get(Calendar.MINUTE));
		System.out.println("�� : " + now.get(Calendar.SECOND));
	}
}
