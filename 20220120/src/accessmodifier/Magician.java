package accessmodifier;
//Commoner�� ����մϴ�.
public class Magician extends Commoner {

	//�����ڸ� ������ּ���.
	//Magician������ �����ϴ� ������ �߰��� ������
	//�����ڴ� ��ӵ��� �����Ƿ� �θ��� �����ڸ�
	// ó���� �� �ֵ��� ������ּ���.
	
	public Magician(String name) {
		super(name);
	}
	
	//��� �޼��带 ����ڽ��ϴ�.
	public void hunt() {
		System.out.println("---------------------");
		System.out.println("�����簡 ����� �����մϴ�.");
		//hp -= 2; //private ��Ҵ� �ڽ��ʿ����� ��Ʈ�� �Ұ���
		//public�� setter�� ������ setHp()�� ��� Ȱ���Ѵ�.
		//setHp(5)�� ���, ������ �� ��� hp ������ 5�� ��ü�ش޶�� ��û�̴�.
		//���� ���ϴ� ���� ���� hp������ 2�� ���� ���� ���ο� hp�� ����Ǵ� ���̴�.
		//setter�� getter(setHp(), getHp()�� ������ Ȱ����
		//������ ������ ü���� 2�� ���̵��� ������ �ۼ����ּ���.
		setHp(getHp() - 2);
		//����ġ�� ����������
		// exp += 10; �� ���� ������ �� �����Ƿ�
		// setExp()�� Ȱ���մϴ�.
		// ���� ���ϴ� ����, �� exp������ ��ɽø��� 10�� ����ġ�� �����ϴ� ���Դϴ�.
		setExp(getExp() + 10);
	}
	public void getInfo() {
		//������ private�� ������ �ȵǴ°� �ƴ϶� ��ȸ�� �Ұ����մϴ�.
		// ���� getter�� �̿��� ���¸� ��ȸ�� �� �ְ� ���ּ���.
		System.out.println("--------------------");
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getLv());
		System.out.println("ü�� : " + getHp());
		System.out.println("���� : " + getMp());
		System.out.println("����ġ : " + getExp());
	}
	//fireball ����� �߰����ּ���
	//������ 3 �ٰ�, ����ġ�� 20 �����մϴ�.
	public void fireball() {
		System.out.println("-------------------");
		System.out.println("���̾!!!!");
		setMp(getMp() - 3);
		setExp(getExp() + 20);
	}
}