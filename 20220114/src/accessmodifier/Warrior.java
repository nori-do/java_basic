package accessmodifier;

public class Warrior {//���Ǻ�, ������ Main���� �� ������.
	
	//�������� ���ǿ����� Ư���� ��ü�� ����� ���°��� ���� �ٲ��� �����Ƿ�
	//�ܺο��� ���� �Ժη� ��ĥ �� ������ public ��� private���� ��Ĩ�ϴ�.
	//public : ��� �������� ����/��ȸ ����, private : �ڱ��ڽɸ� ����/��ȸ����
	//protected : ���� ��Ű��/�ڱ��ڽ��� ����/��ȸ ����
	protected int hp;
	protected int strangth;
	public String name;
	protected int lv;
	protected int money;
	
	// �����ڸ� ������ֽõ�, name�� ����ڿ��� �Է¹ް�
	// �������� hp 20, stangth 3, lv 1, money 0
	// �ڵ����� �Է¹޵��� ���ּ���.
	
	public Warrior(String n) {
		hp = 20;
		strangth = 3;
		name = n;
		lv = 1;
		money = 0;
	}
	// hunt(����ϱ�) �޼��带 �����ڽ��ϴ�.
	// �� �޼���� ����� ����� �ϴ� ��Ȳ�� �����ϸ�
	// ü���� 2���̰� ���� 10�� ȹ���մϴ�.
	// ��ɰ�� ü���� X�� �Ǿ���, �������� Y�Դϴ�. ��� ����Ѵ�.
	// �����ڸ� ����� �޼���� "�ൿ"�� ��Ÿ����
	// �̷� �ൿ�� ����/ ���� ���δ� ������ ����(����)�� ���� �����Ǹ�
	// �õ���ü�� ���ؼ��� ������ ���� �ʴ´�.
	public void hunt() {
		hp -= 2;
		money += 10;
		System.out.println("��ɰ�� ü���� " + hp +
						"�Ǿ���, �������� " + money + "�Դϴ�.");
	}
}
