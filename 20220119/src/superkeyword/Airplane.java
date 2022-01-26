package superkeyword;

public class Airplane {
	// ������ �ӵ��� 
	protected int speed;
	// �����ڴ� �ӵ��� �Է¹޾� �������ݴϴ�.
	public Airplane(int speed){
		this.speed = speed;
	}
	//fly()�޼��带 �����ϴµ� �ӵ��� 500�� �ٽ��ϴ�.
	// ��, �Ϲݺ����� �ӵ��� 900 �ʰ��� �� �����ϴ�.
	public void fly() {
		//�ӵ��� ���ǽ����� üũ�Ͽ� ó��
		if((this.speed + 500) > 900) {
			this.speed = 900;
		}else {
			this.speed += 500;
		}
		System.out.println("���� ������ �ü� " + this.speed + "km/h�� ���� ���Դϴ�.");
	}
	
	// breakSpeed()�޼��带 �����ϸ� �ӵ��� 100�� �����մϴ�.
	// ��, �극��ũ ������ ���� �ӵ��� 0�Դϴ�.
	protected void breaksPeed(){
		// �ӵ��� ���ǽ����� üũ�ؼ� 0�̸����� ������ �� ���� 100�� ����
		if(this.speed - 100 < 0) {
			this.speed = 0;
		}else {
			this.speed -=100;
		}
		System.out.println("���Ӱ�� " + this.speed + "km/h�� ���� ��.");
	}
	
}