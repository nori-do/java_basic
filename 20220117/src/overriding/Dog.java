package overriding;

public class Dog extends Animal{
 //�������� overriding ��Ű�� ���ο� �߰������� ������ �ϳ� ����������
//������ּ���.
//Horseó�� ������ ������ �ڽŸ��� Ư�� �ϳ��� ������
// Animal�� ����մϴ�.
//����ؼ� ���� �޼��� howl(), getInfo()�� �ڽ� Ŭ���� Ư���� ���缭
//�������մϴ�
	
	//�ڵ� ���� -> main�ʿ� �ϳ� �� ���� -> �׸� ĸ��
	
	public String size; // ũ��
	
	public void howl(){
		System.out.println("�۸۸�");
	}
	
	public void getInfo() {
		System.out.println("�̸� : " + name +
				", ���� : " + age + ", ũ�� : " + size);
	}
}

