package math1;

public class Math04P480 {

	public static void main(String[] args) {
		//Math.random()�� 0�̻� 1�̸��� ������ �����ݴϴ�.
		double a = Math.random();
		System.out.println(a);
		
		//15% Ȯ���� "��ȭ�� �����߽��ϴ�", 85%Ȯ���� "��ȭ�� �����߽��ϴ�."��� ����ϴ�
		//�ڵ带 20�� �ݺ��ϴ� �ڵ带 �Ʒ��� �ۼ����ּ���.
		// 20�� �ݺ��ϴ� for�� ���ο� if~else ���� �ۼ��ؼ� �����մϴ�.
		
		for(int i = 0; i <= 20; i++) {
			if(Math.random()<=0.15) {
				System.out.println("��ȭ�� �����ϼ̽��ϴ�.");
				}else {
					System.out.println("��ȭ�� �����߽��ϴ�.");
				}
			}
		
		
		
		//������ �����ϴ� ���(���� 0�̻� 6�̸�)
		//int b = 0;
		//System.out.println(Math.random()*6);
		int b = (int)(Math.random() * 6);
		System.out.println(b);
	}
}