package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {

	public static void main(String[] args) {
		//�ζ� ���� ��÷�⸦ �����ڽ��ϴ�.
		//�ζǺ��� ��÷��� 1~45 �������� ��ġ�� ���� ����
		// 6���� ���ڸ� �̽��ϴ�.
		//������ �����ؼ� �ֿܼ� ����ֵ��� ������ּ���.
		//ArrayList�� ������ .sort()���
		//Collections.sort(ArrayList)�� ����մϴ�.
		
		//Integer�� ����޴� �� ArrayList�����
		List<Integer> lotto = new ArrayList<>();
		
		//�ζǹ�ȣ�� ���� �� �ִ� ���� ���� �� 0���� �ʱ�ȭ
		int getNum = 0;
		
		//while�� ������ ��ȣ�� ���� ArrayList�� ���� ��� ������ 6�� �Ǹ� ����ǵ���
		while(lotto.size() != 6){
			//��ȣ �̱�
			getNum = (int)(Math.random()*45)+1;
			//��ȣ�� ���� ������ ���� ��ȣ ��Ͽ� ���ԵǾ����� �ʴٸ�
			if(!lotto.contains(getNum)) {
				//�߰��ϱ�
				lotto.add(getNum);
			}
		}	
		//�� ���� �����ϱ�
		Collections.sort(lotto);
	
		//��÷��ȣ �����ֱ�
		System.out.println("��÷�� ��ȣ : " + lotto); 
		
		//getNum�� ����� ��ȣ�� ���� lotto ����Ʈ�� ����Ǿ��ִ� ����Ʈ���(�ݺ���)
		while(lotto.contains(getNum)) {
			//���ο� ��ȣ�� �ٽ� getNum�� ����
			getNum = (int)(Math.random()*45)+1;
		}
		//�ݺ��� Ż���� 2�� ��÷��ȣ ȭ�鿡 ���
		System.out.println("2�� ��û��ȣ : " + getNum);
	}
}

