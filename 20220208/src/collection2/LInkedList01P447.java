package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LInkedList01P447 {

	public static void main(String[] args) {
		//LinkedList �� �ڷ��� ������ ����� �� ����ϸ� ���� ����� �ִ�.
		//�Ϲ����� ��Ȳ������ ArrayList�� �� ���� ����
		//��������δ� �� �ڷ����� ������ ���̴� �����Ƿ� ������ �� �� ����帮�ڽ��ϴ�.
		
		List<String> list1 = new LinkedList<>();
		
		list1.add("�ڹ�");
		list1.add("JSP");
		list1.add("������");
		list1.add("��������Ʈ");
		System.out.println(list1);
		
		//.remove() �� �� ������ �ִ�.
		//.remove(��ȣ)�� ������ �ش� �ε����� �ڷᰡ �����ǰ�
		//.remove("�ڷ�")�� ������ ��ȣ�� ������� �ڷḦ �����մϴ�.
		list1.remove(0);//0�� �ε����� "�ڹ�"�� �����մϴ�.
		System.out.println(list1);
		
		list1.remove("������");// �ڷḦ �ִ� ���� �ش� �ڷḦ ��ȣ ������� �����մϴ�.
		System.out.println(list1);
		
		//����Ʈ�� ��ü������ ��ﶧ�� .clear()�� ����մϴ�.
		// �ѹ� ���� �Ἥ ��ȸ�غ�����.
		list1.clear();
		System.out.println(list1);
		
		//4�� �ڷ� �ƹ��ų� �߰��ϱ�
		list1.add("����");
		list1.add("����");
		list1.add("ȣ��");
		list1.add("����");
		System.out.println(list1);
		
		//�ڷ� ������ Collections.sort(���Ĵ��)�Դϴ�.
		Collections.sort(list1);
		System.out.println(list1);
	
	}
}
