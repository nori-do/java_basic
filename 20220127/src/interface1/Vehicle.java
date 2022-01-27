package interface1;
//�������̽��� interface ������ ����մϴ�.
//���ο��� ����� ���� �߻�޼��常 ������ �� �ֽ��ϴ�.
//���ʿ� ����(implements)�� ������ ����Ǳ� ������
//�Ϲ� ����, �޼��带 ���ο� ������ �� �����ϴ�.
//������������ �������̽��� �θ�Ŭ����ó�� ���� Ŭ������ ���Թ��� �� �ֽ��ϴ�.
public interface Vehicle {
	//1. ��� ���� ���
	//2. �ڵ����� �ִ� ���ᷮ�� �����غ��ڽ��ϴ�.
	int MAX_GAS = 70;
	int MIN_GAS = 0; // ���� �ּҰ��� ����� ���� ��� �ϴ� ������⸸ �غý��ϴ�.
	int MAX_SPEED = 200; // �ְ� �ӷ�
	int MIN_SPEED = 0; // ���� �ӷ�
	int INCREASE_SPD = 10;
	int DECREASE_SPD = 10;
	int REFUEL_GAS = 30;
	int DECREASE_GAS = 1;
	//3. �ڵ����� ��� ����� �����ڽ��ϴ�.
	//���ȭ ��ų ������ �ִ� �͵��� ���� ���ȭ �����ֽð�, Car���� �������ּ���.
	
	
	//4. �ڵ����� �̾� ������ �����ڽ��ϴ�.
	// Train Ŭ������ ������ֽð� ���� Vehicle�� �����մϴ�.
	//�ִ�ӵ� 400, ���������� 700��, ���� �Ҹ�� 30��, �����ӵ��� 100, ���ӽ� 50�� ���ӵ˴ϴ�.
	int TRANIN_MAX_GAS = 1000;
	int TRANIN_MAX_SPEED = 400; // �ְ� �ӷ�
	int TRANIN_MIN_SPEED = 0; // ���� �ӷ�
	int TRANIN_INCREASE_SPD = 100;
	int TRANIN_DECREASE_SPD = 50;
	int TRANIN_REFUEL_GAS = 700;
	int TRANIN_DECREASE_GAS = 30;
	
	//Ż ���̶�� ���������� ������ ������ ����� ���� �߻�޼���� �ۼ�
	//{
	//	���๮...
	//}
	//�� ���� ���๮ �κ�(�޼����� ��ü, body��� �θ�)���� ���� ���ּ���.
	
	public void accel(); // ����
	public void breakSpeed(); // ����
	public void reFuel(); // ����
	public void showStatus(); // ����� ��ȣ
	
}
