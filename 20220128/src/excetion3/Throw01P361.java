package excetion3;

public class Throw01P361 {
	public static void main(String[] args) {
		//throw�� ���ܻ�Ȳ�� �ƴ����� ���ܸ� ������ �߻���ŵ�ϴ�.
		//Math.random()�� 0 <= ���� <1�� ������ ������ ������ �߻���ŵ�ϴ�.
		//������ 0~9�� ����� �ʹٸ�? * (���� �� + 1);
		int randomNum = (int)(Math.random() * 10);
		System.out.println("���� ������ : " + randomNum);
		
		try {
			if(randomNum > 3) {
				//�߻������� ���� ArryIndexOutOfBoundsException �����
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("���� ������ ���� �߻�");
			}
		}catch(Exception e) {
			System.out.println("���� ���ܸ� ��������ϴ�.");
			//�ֿܼ� �� ���������� ������ printStackTrace();�� ȣ���մϴ�.
			e.printStackTrace();
		}
		
	}
}
