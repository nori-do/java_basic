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
		
		
		// .contains("�ڷ�")�� ��4��Ʈ ���� ã�� �ڷᰡ ������ true
		//���ٸ� false�� ������ش�.
		System.out.println(list1.contains("���"));
		System.out.println(list1.contains("������"));
	}
}
