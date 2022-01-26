package interaction;

public class Buyer {
	//�����ڴ� money(������), mango(������������)�� ��� ������ �����ϴ�.
	private int money;
	private int mango;
	private int MANGO_PRICE;
	//�����ڿ��� ���� �޾� �������� �ʱ�ȭ���ְ� ������ 0���� �ʱ�ȭ�մϴ�.
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.MANGO_PRICE = 5000;
	}
	//showBuyer()�� �̿��� ��������, �������� �� �� �ֽ��ϴ�.
	public void showBuyer() {
		System.out.println("---------������ ����-------");
		System.out.println("���� ������ : " + this.money +
					", ���� ���� ���� : " + this.mango);
	}
	// ������ ���忡�� ������ �����ϴ� buyMango�� ����ϴ�.
	// �����ڰ� buyMango�� ȣ���� �� ���ÿ� �Ǹ����� sellMango�� ���ÿ� ȣ��Ǿ�� �մϴ�.
	//                    ��������          ��� �������� �����ϴ�.
	public void buyMango(Seller seller, int m) {
		// �Ǹ����� ������ ���� �����Ϸ��� �������� ���� ���
		// "���� ����� �����մϴ�."��� �˸��� �޼��带 �������Ѿ��մϴ�.
		// Seller���� ���� ����� Buyer�ʿ��� �̸� �ƴ� �����
		// getMango()�� Seller�ʿ� ������ִ� �� �ۿ� �����Ƿ�
		// getMango()�� Seller�ʿ� �������༭ buyer�ʿ���
		// ���������� ��ȸ�� �� �ֵ��� ���ֽð�, �� ����� ����
		// ��������� �����ϴٸ� return;���� buyMango�� ������� �ʰ� ���ּ���.
		/*if (getMango(seller) < m) {
			System.out.println("------------------");
			System.out.println("���� ����� �����մϴ�.");
			return;
		}*/	
		if(seller.getMango() < m) {
		System.out.println("----------------");
		System.out.println("���� ����� �����մϴ�.");
		return;
		}else if(m * this.MANGO_PRICE > this.money) {
			System.out.println("-----------------");
			System.out.println("�������� �����մϴ�.");
			return;
		}
		// �� �ݾ��� �����ǰ� ������ �þ�� ������ �ۼ����ּ���.
		this.money -= m * this.MANGO_PRICE;
		this.mango += m;
		// �Ǹ����� sellMiango ȣ��
		seller.sellMango(m);
	}

}