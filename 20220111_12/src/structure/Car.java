package structure;

public class Car {
	//������� 
	//�ڵ��� ��, ����, ����
	public String model;
	public int price;
	public String owner;
	//��� �޼���
	//getInfo()�� ��, ����, ���ο� ���� ��ȸ�ϵ��� �ۼ����ּ���.
	public void getInfo() {
		System.out.println("�𵨸� : " + model +
							", ���� :" + price +
							", ������ : " + owner);
		
	}
	
}
