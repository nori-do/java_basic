package construcotor;

public class Car {
	//�ڵ����� ����(�Ӽ�)�� ��Ÿ���� ������
	public int gas; // ���ᷮ
	public int speed; // �ӵ�
	public String owner; // ����
	
	// ������ ����
	// �����ڴ� ����Ÿ���� ������ �ʰ�, Ŭ�������� �״�� �޼�������� ����.
	// new Ű����� ������ �� �� �� ���� ����ȴ�.
	public Car(String o) {
		gas = 100;// ���� ����
		speed = 0;// ���� 0
		owner = o;
	}
	
	// ���� ���ᷮ, ���ָ� ��ȸ�Ͽ� �ܼ�â�� ����� �� �ִ�
	// �޼��带 ���� �ڵ带 ������ �ۼ����ּ���.(����� ����)
	public void getInfo(){
		System.out.println("���� : " + gas +
							", �ӵ� : " + speed +
							", ������ : " + owner);
	}
	// �ڵ����� ��������� �߰��غ��ڽ��ϴ�.
	// ��������� accelSpeed()�̸�
	// �� ����� ����Ǹ� ���Ḧ 2 �����ϰ�
	// �ӵ��� 10 ������Ų��.
	public void accerlSpeed() {
		gas -= 2;
		speed += 10;
	}
		//�ڵ����� ���ӱ���� �߰��غ��ڽ��ϴ�.
		//breakSpeed()�̸�
		//�� ����� ����Ǹ� �ӵ��� 10 �����մϴ�.
	public void breakSpeed() {
		speed -= 10;
	}
		// ��������� �߰��غ��ڽ��ϴ�.
		// ��������� reFuel()�̸�
		// �� ����� ����Ǹ� ���Ḧ 50 ä���ݴϴ�.
	public void reFuel() {
		gas += 50;
	}
}
