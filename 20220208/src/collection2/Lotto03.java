package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		//�ζ� ���� ��÷ �ùķ����͸� ������ּ���.
		//�� ���� ��� ��÷�Ǵ��� �ùķ��̼� �غ��ڽ��ϴ�.
		
		List<Integer> lotto =new ArrayList<>();
		
		
		int getNum = 0;
		
		while(lotto.size() != 6) {
			getNum = (int)(Math.random()*45)+1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		//�� ���� �����ϱ�
		Collections.sort(lotto);
		//2. ��÷��ȣ 6���� �̽��ϴ�.
		List<Integer> lotto1 =new ArrayList<>();
		int count = 0;
		int getNum2 = 0;
		while(!lotto.equals(lotto1)) {
			lotto1.clear();
			count++;
			while(lotto1.size() != 6) {
				getNum2 = (int)(Math.random()*45)+1;
				if(!lotto1.contains(getNum2)) {
					lotto1.add(getNum2);
				}
				Collections.sort(lotto1);
				System.out.println(""+lotto+lotto1);
				while(lotto.equals(lotto1)) {
					System.out.println("������ �ζǺ����� ���� : " + count);
					break;
				}
				
			}
			
			}
		}
	/*Collections.sort(lotto1);
	System.out.println(""+lotto+lotto1);
	count++;
	System.out.println("������ �ζǺ����� ���� : " + count);*/
		}
		//3. ��÷��ȣ�� ��÷��ȣ�� ���ؼ� ��ġ�ϸ� �ݺ� ����
		
		//4. 3���� ��ġ���� ������ �ݺ�ȸ���� 1 ���ϰ� �ٽ� ��÷��ȣ 6�� �̰�
		//�̾ ���ؼ� ��ġ���� �˻�


