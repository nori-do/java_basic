package construcotor;

public class BasketballPlayer {
	//�������(Ư��)
	//Ű height
	//������ jumpHight�� �������ֽð�
	
	public int height;
	public int jumpHeight;
	
	//������ ����
	//int h, int j�� �޾ƾ� ȣ��ǵ���
	//������ height, jumpHeight��
	//�޾ƿ� ������ ����ް� ������ּ���.
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("������ �󱸼����� Ű :" + height +
				", ������ : " + jumpHeight);
	}
	
	// ��ũ���ϱ� ��� �߰�
	// height + jumpHeight �� 300�� �ѱ�� ����
	// ��ũ�� �����߽��ϴ�
	// �� ����ϰ�
	// �׷��� �ʴٸ�
	// ��뿡 ���� �ʾҽ��ϴ� ���
	// ����ϵ��� ����� �߰����ּ���.
	// dunkShoot() �Դϴ�.
	public void dunkShoot() {
		int dunkHeight = height + jumpHeight;
		//���� �̸��� ������ �� Ȯ���ϰ� ������ 
		//� ������ �����ϴ����� ���� ���ϴ� ���� �߿��ϴ�.
		//�� ȥ�ڼ� �ϴ� ������� ��������� �ٸ� ����� ������ ��
		// ������ �� ���� ����.
		if(dunkHeight>300) {
			System.out.println("��ũ�� �����߽��ϴ�.");
		}else {
			System.out.println("��뿡 ���� �ʾҽ��ϴ�.");
		}
	
	}
	
}



