package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		//���縦 �ϳ� ����� ����� 3�� ���ּ���.
		Warrior w1 = new Warrior("�ڱ⵵");
		//public ��Ҵ� �ܺ��������� ������� ���� ������ �� ����.
		//private ��Ҵ� �ܺ����������� ����� ���� ��ȸ�ϰų� ������ �� ����.
		w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}
}