package interaction;

public class Seller {
	//������ int money(����), int mango(���)�� �����ϴ�.
	private int money; // �����
	private int mango; // ���(����)
	// �������� ���̱� ���� ���ڴ�� ���� ������
	//ī�����̽��� �ۼ����� �ʽ��ϴ�.
	private int MANGO_PRICE;
	
	
	// �����ڿ��� money�� �ʱⰪ�� 0�̰�, mango�� �Է¹޵��� ���ּ���
	public Seller(int m) {
		this.money = 0;
		this.mango = m;
		this.MANGO_PRICE = 5000;
	}

	//showSeller()�� �̿��ؼ� ���� ������, ���������� ��ȸ�ϵ��� �޼��带 �ۼ����ּ���.
	public void showSeller() {
		System.out.println("---------��������-------");
		System.out.println("���� ������ : " + this.money +
					", ���� ���� ��� : " + this.mango);
	}
	//sellMango(int mango)�� �̿��ؼ� ���������� �Է¹�����
	// �ڽ��� ������ �Է¹��� ����������ŭ �����ϰ�, this.money��
	// �������� * �������ݸ�ŭ �����ϰ� ���ּ���.
		
	public void sellMango(int m) {
		//int sellMango = 5000;
		//������ ���ڶ��� "������ ���ڶ��ϴ�"��� �ϰ� �޼��带
		//return;�� ���� ���� ��������ּ���.
		if(this.mango < m) {
			System.out.println("---------------");
			System.out.println("������ ���ڶ��ϴ�. ���� ��� : " +
							this.mango);
			return;
		}
			this.mango -= m;
			this.money += m * this.MANGO_PRICE;
		
	}
	public int getMango() {
		return this.mango;
	}
	
}