package abstract1;

public class Main01P304 {
	public static void main(String[] args) {
		//new Ű����δ� �߻�Ŭ������ ������ �� �����ϴ�.
		//Parent p1 = new Parent();
		
		//��, Parent�� ��ӹ޾� getAge()�޼���� ��üȭ��Ų
		//ChildŸ�����δ� ��ü ���� �� ����� �����մϴ�.
		Parent c = new Child();//������ ����
		c.getAge();//�������̵� �޼���
		
		//���� �������̵��� ���� �ʾҾ �θ��� �Ϲ� �޼����
		//���� ȣ�� ����
		c.gitInfo();
	}
}
