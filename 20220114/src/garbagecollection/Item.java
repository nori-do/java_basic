package garbagecollection;

public class Item {

	public int num;
	
	//�����ڸ� ������ּ���.
	// int n�� �޾� num�� �������ݴϴ�.
	public Item(int n) {
		num = n;
		System.out.println(num + "�� ��ü ����.");
	}

	// �Ҹ��� finalize()
	// �����ڴ� ������ �ݵ�� 1ȸ ȣ��ǰ�
	// �Ҹ��ڴ� �Ҹ�� �ݵ�� 1ȸ ȣ��ȴ�.
	protected void finalize() {
		System.out.println(num + "��ü ����");
	}


}
