package math1;

public class Math06P480 {

	public static void main(String[] args) {
		//���������� ������ �����ڽ��ϴ�.
		//Math.random()�� �̿��� 1/3Ȯ���� ����, ����, ���� �ο�������
		//���� > ��, ����> ����, ��> ������ ���� �����ϴ�.
		//���� ��Ұ� ������ ���º��Դϴ�.
		//��Ʈ) ��ǻ�Ͱ� �̱�� ���, ���� �̱�� ���, ���� ��츦 ������
		//���ǽ� ||�� ����մϴ�.
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		// 0= ����, 1= ���� 2=��
		// 0 > 2, 1 > 0, 2 > 1
		
		//����� ó���ϴ� �κ�
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
	
		if((myValue == SCISSORS && comValue ==PAPER)||
				(myValue == PAPER && comValue == ROCK)||
				(myValue == ROCK && comValue == SCISSORS)) {
			System.out.println("���� �̰���ϴ�.");
		}else if((myValue == PAPER && comValue == SCISSORS)||
				(myValue == ROCK && comValue ==PAPER)||
				(myValue == SCISSORS && comValue ==ROCK)) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}else if(myValue == comValue) {
			System.out.println("���º��Դϴ�.");
		}
		
		//���� �� �Ͱ� ��ǻ�Ͱ� �� ���� ���ڿ��� ���ڷ� ġȯ���ִ� �迭
		String[] items = {"����", "����", "��"};
		
		//���� �� �Ͱ� ��ǻ�Ͱ� �� ���� ������ִ� �κ�
		System.out.println("���� �� �� : " + items[myValue]);
		System.out.println("��ǻ�Ͱ� �� �� : " + items[comValue]);
	}
	
	
}
