package abstract1;
//�߻�Ŭ����
//abstract ������ ���� Ŭ������ new�� �̿���
//���� ��ü ������ �Ұ����ϰ� ��Ӹ� �����մϴ�.
public abstract class Parent {
	private int age;
	
	public Parent() {
		this.age = 40;
	}
	
	// �߻� �޼���
	// �Ʒ��� ���� ���๮ ���� ����θ� �ۼ��մϴ�.
	//���๮�� ��� �ڽ��� ��ӹ޾��� �� �������̵��� ����˴ϴ�.
	public abstract void getAge();
	
	//�߻� Ŭ���� ������ �Ϲ� �޼���� �ٸ� Ŭ�������� �׷���
	//����ϰ� �ۼ��մϴ�.
	//�ϴ� �޼���� �߻� �޼���ʹ� �޸� �������̵��� �������Դϴ�.
	public void gitInfo() {
		System.out.println("�Ϲ� �޼����Դϴ�.");
	}
	
}
