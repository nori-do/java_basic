package overloading;

public class Parttimer {
	//��ƮŸ�̸��� ����
	//��������(afternoon), �ñ�(pay), ���Ը�(shopName),
	//�����̸�(name)
	private boolean afternoon; // true�� ����, �ƴϸ� ����
	private int pay; // �ñ�
	private String shopName; // ���Ը�
	private String name; // �����̸�

	// ������ �����ε���, �����ڵ� �޼����̴� �����ڸ� ���� �� �����ε� �������� ����� ���Դϴ�.
	// afternoon, pay, shopName, name�� ��� �Է� �޾� �������ִ� �����ڸ� ������ּ���.
	// ���� �����ڴ� public �Դϴ�.
	
	public Parttimer(boolean a, int p, String s, String n) {
		// �ñ��� 9160�� �̸��̶�� ������ 9160�� ����ְ�
		//�ƴϸ� �Է¹��� �ݾ��� �״�� �Է��ϵ��� �����غ�����.
		/*if(P<9160) {
			pay = 9160;
		}else {
			pay = p;
		}*/			
		// �̷������� ���������ϴ� ����� �ξ� ���� �� ���´ٰ� �� �� �ִ�.
		afternoon = a;
		pay = p;
		if(pay<9160) {
			pay = 9160;
		}
		shopName = s;
		name = n;
		//���� ������ Ȯ��
		System.out.println("�˹ٰ� �����Ǿ����ϴ�.");
		System.out.println("���ľ˹� : " + afternoon);
		System.out.println("�ñ� : " + pay);
		System.out.println("���Ը� : " + shopName);
		System.out.println("�˹ٻ� �̸� : " + name);		
	}
	
	//�����ε��� �̸��� ������ �Ķ���Ͱ��� ������ ������ �ٸ��� �ߺ� �ۼ��� ����մϴ�.
	//afternoon, shopName, name�� �Է¹޴� �����ڸ� �ϳ� �� �ߺ� �ۼ����ּ���
	//pay�� �Է¹��� �ʰ� �ٷ� ���� �ñ����� �ֽ��ϴ�.
	public Parttimer(boolean a, String s, String n) {
		afternoon = a;
		pay = 9150;
		if(pay<9160) {
			pay = 9160;
		}
		shopName =s;
		name = n;
		//���� ������ Ȯ��
		System.out.println("�˹ٰ� �����Ǿ����ϴ�.");
		System.out.println("���ľ˹� : " + afternoon);
		System.out.println("�ñ� : " + pay);
		System.out.println("���Ը� : " + shopName);
		System.out.println("�˹ٻ� �̸� : " + name);
	}
	

}
