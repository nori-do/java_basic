package interface1;
// �������̽� ����(����� �ƴ�!) �ϱ� ���ؼ���
//extends ��ſ� implements�� ����մϴ�.
//�������̽� ������ �߻�޼���� ������ ���� �����ؾ� �մϴ�.
public class Car implements Vehicle{
	//�ڵ������ ������ �ϴ� ���� ����
	//���� �ӵ�, ���翬�ᷮ, ����
	private int speed;
	private int gas;
	private String name;
	
	// �����ڸ� ������ּ���. ���ָ� �Է¹ް�
	//������ ��Ҵ� ���� �ӵ� 0, ���ᷮ 100�� �ڵ����� �������ּ���.
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = MAX_GAS;
	}
	public void accel() {
		//�� �� ���ӽ� �ӵ��� 10�� �þ���� ���ּ���.
		//����� �� �� ���ӿ� 1�� �Һ��մϴ�.
		//��, �ӵ��� 200�� �ʰ��� �� �����ϴ�.
		if(speed + INCREASE_SPD > MAX_SPEED) {
			speed = MAX_SPEED;
		}else {
			speed += INCREASE_SPD;
		}
		gas -= DECREASE_GAS;
	}

	public void breakSpeed() {
		//�� �� ���ӽ� �ӵ��� 10�� �پ�鵵�� ���ּ���
		//�� �ӵ��� 0 �̸��� �� �� �����ϴ�.
		if(speed - DECREASE_SPD < MIN_SPEED) {
			speed = MIN_SPEED;
		}else {
			speed -= DECREASE_SPD;
		}
	}

	public void reFuel() {
		//����� �ٽ� ä�ﶧ���� 30�� ä��ϴ�.
		//���� �ִ뷮�� 70L�� �����ϰ� 70���� �����մϴ�.
		if(gas + REFUEL_GAS > MAX_GAS) {
			gas = MAX_GAS;
			}else {
				gas += REFUEL_GAS;
			}
	}

	public void showStatus() {
		//�ڵ����� �ӵ�, ���ᷮ, ���ְ� ������ �������� ���ݴϴ�.
		System.out.println("���� �ӵ� : " + speed);
		System.out.println("���� ���ᷮ : " + gas);
		System.out.println("������ : " + name);
		System.out.println("-------------");
	}	
}
