package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		//map�ڷ����� �̿��� �Ĵ� �޴����� �����ڽ��ϴ�.
		//key�� �����̸�, value�� ����(����)�� �������ּ���.
		//�޴��� 5�� �̻� ����־��ּ���.
		//�޴��� 3�� ��ȸ�ؼ� ȭ�鿡 ������ּ���.
		Map<String, Integer>menu = new HashMap<>();
		
		menu.put("��������ũ����Ʈ", 34900);
		menu.put("Ƽ��&������", 35900);
		menu.put("���۽�����", 34900);
		menu.put("��ȭ�Ұ��", 24900);
		menu.put("����ġ�� Ƽ��������ũ", 21900);

		System.out.println("��������ũ����Ʈ ���� : " + menu.get("��������ũ����Ʈ"));
		System.out.println("Ƽ��&������ ���� : "+ menu.get("Ƽ��&������"));
		System.out.println("��ȭ�Ұ�� ���� : " + menu.get("��ȭ�Ұ��"));
	}
}
