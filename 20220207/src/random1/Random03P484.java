package random1;

import java.util.Random;

public class Random03P484 {

	public static void main(String[] args) {
		//Random Ŭ������ nextInt()�� ���� ���� ������ ������ �� �ֽ��ϴ�.
		// �ٷ� ������ ������ ������ �ڵ尡 �� �� ���������ϴ�.
		Random random = new Random();
		
		//���� �Է��� ���ϸ� int���� -21�� ~ +21�� ������ ���ڰ� �����ϰ� ���ɴϴ�
		int result = random.nextInt();
		System.out.println(result);
		
		//���� ���� ���� �ϳ�(n)�� �Ķ���ͷ� �־���� 0 <= ����� < n�� ���ɴϴ�.
		int result2 = random.nextInt(5); // 0,1,2,3,4 �� �ϳ��� ����
		System.out.println(result2
				);
	}
}
