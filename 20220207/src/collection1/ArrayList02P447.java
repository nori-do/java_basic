package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02P447 {
	public static void main(String[] args) {
		//�������� ���� String �ڷḦ ���������� ���� �� �ִ�
		//ArrayList�� ������ֽð� ���ʿ� �ڷ��
		//"���", "����", "����", "��纣��", "���ξ���"�� �־��ּ���.
		//�ڷᰡ ����� ArrayList�� �ֿܼ� ����ּ���.
		
		List<String> list1 = new ArrayList<>();
		
		//�����ڷ����̹Ƿ� �߰��ϰ� ���� ��ŭ �ڷ� �߰� ����
		list1.add("���");
		list1.add("����");
		list1.add("����");
		list1.add("��纣��");
		
		System.out.println(list1);
		list1.add("���ξ���");
		System.out.println(list1);
		
		
		// .contains("�ڷ�")�� ����Ʈ ���� ã�� �ڷᰡ ������ true
		//���ٸ� false�� ������ش�.
		System.out.println(list1.contains("���"));
		System.out.println(list1.contains("������"));
	
		// .get(��ȣ)�� �־��� �ε����� ����Ǿ� �ִ� �ڷḦ ��ȸ���ݴϴ�.
		System.out.println(list1.get(1));
		//���� �ε��� ��ȣ�� �Է��غ�����.
		//System.out.println(list1.get(8));
		
		// .size()�� ���� ��� ������ Ȯ���� �� �ֽ��ϴ�.
		System.out.println(list1.size());
		
		//.isEmpty()�� ����ִ��� ���θ� üũ���ݴϴ�.
		System.out.println(list1.isEmpty());
		
		// �� ����Ʈ list2�� �������� ���� �����ؼ�, isEmpty()�� .size()�� ��ȸ���ּ���.
		List<String> list2 = new ArrayList<>();
		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
	
	}
}
