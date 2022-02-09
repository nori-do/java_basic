package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01P458 {

	public static void main(String[] args) {
		//Map �������̽��� ��ǥ ����ü�� HashMap�Դϴ�.
		//���׸� ���ο����� <key�ڷ���, Value�ڷ���>���� �ۼ��մϴ�.
		Map<String, String>map = new HashMap<>();
		
		// �ڷ��߰��� .put(Ű��, ������);�� �̿��մϴ�.
		map.put("ä����", "�ڹ�");
		
		System.out.println(map);
		
		map.put("�ڱ⵵", "���ػ�");
		map.put("���", "��");
		System.out.println(map);
		
		// �ڷ���ȸ�ô� .get(key��)���� ��ȸ�մϴ�.
		//map�� Ű�� ������ ��ȸ�ϴ°� ����������, ������ ������ Ű�� ��ȸ�ϴ� �� �Ұ����մϴ�
		// ���� Ű������ ��ȸ�ϸ� null�� ���ɴϴ�.
		//�ε��� ��ȣ�ε� ��ȸ�� �� �����ϴ�.
		System.out.println(map.get("�ڱ⵵"));
		System.out.println(map.get("��"));
		
		// remove�� key�� �̿��ؼ� key ==value �� ���� �������ݴϴ�.
		map.remove("�ڱ⵵");
		System.out.println(map);
		
		// .size()�� ũ�⸦ �˷��ݴϴ�. ������ ��� key=value����
		// ����Ǿ����� Ȯ���� �� �ֺ�ϴ�.
		System.out.println(map.size());
	}
}
