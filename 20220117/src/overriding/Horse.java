package overriding;

// Animal�� ��ӹް� ���ּ���.
public class Horse extends Animal{
	public int rank;
	
	//�������̵� ���
	//�̸��� �����ڷ��� ����
	//���� �θ��� �޼��带
	//�ڽ��ʿ� �ٽ� �ߺ��ؼ� �ۼ���
	public void howl() {
		System.out.println("������");
	}
	
	public void getInfo() {
		System.out.println("�̸� : " + name +
				", ���� : " + age + ", ���� :" + rank);
	}
}
