package excetion3;

public class Throws01P361 {
	
	public static void doIt(String[] s, int i)throws ArrayIndexOutOfBoundsException{
		//���ΰ� �ε��� ��ȸ�̹Ƿ�, �������� ArrayIndexOutOfBoundsException �߻��� ������
		System.out.println(s[i]);
	}
	
	public static void main(String[] args) {
		//Ư�� �޼��� �������� �߻��ϴ� �ڵ�� ������ ���ϸ� try�� �ܺ���
		//���ܹ߻����� ���ֵ˴ϴ�.
		//���� ���������δ� try�� �ۿ� ������ �����δ� try���� ���� ��ó�� ó���ϱ� ����
		//throws�� ����� ���� �޼��� �ڿ� �ٿ��ݴϴ�.
		String[] greetings = {"�ȳ�", "hi", "���Ͽ�", "�ο͵�İ"};
		int i = (int)(Math.random() * 5);// ���� 0,1,2,3,4 �� �ϳ�
		
		try {
			doIt(greetings, i);
		}catch(Exception e) {
			System.out.println("main�������� ó���߽��ϴ�.");
		}
	}
}
