package interaction;

public class Main01 {

	public static void main(String[] args) {
		//�Ǹ��� �ϳ� ����
		Seller s1 = new Seller(1);
		// �Ǹ��� ���� ��ȸ
		s1.showSeller();
		// ������ �ϳ� ����
		Buyer b1 = new Buyer(1);
		//������ ���� ��ȸ
		b1.showBuyer();
		//�����ڰ� �Ǹ��ڸ� ������ ���� ����
		b1.buyMango(s1, 1);
		//���� �� �Ǹ��� ���� ��ȸ
		s1.showSeller();
		//���� �� ������ ���� ��ȸ
		b1.showBuyer();
	}
}
