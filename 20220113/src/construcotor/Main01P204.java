package construcotor;

public class Main01P204 {

	public static void main(String[] args) {
		// �ڵ����� �� �� �����ڽ��ϴ�.
		// ���ᷮ�� 100
		// �ӵ��� 0
		// ������ ���� �̸����� ������ּ���.
		Car c1 = new Car("�ڱ⵵");
		//c1.gas = 100;
		//c1.speed = 0; // �⺻�� ������ ���� �����ڸ� Ȱ���Ѵ�.
		//c1.owner = "�ڱ⵵";
		c1.getInfo();
		c1.accerlSpeed();
		c1.accerlSpeed();
		c1.accerlSpeed();
		c1.accerlSpeed();
		c1.accerlSpeed();
		c1.breakSpeed();
		c1.reFuel();
		c1.getInfo();
	}
	
}
