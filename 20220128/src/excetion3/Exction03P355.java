package excetion3;

public class Exction03P355 {
	
	public static void main(String[] args) {
		// ���� catch�� �� ���ο��� ���� ������ ���ܰ� �߻��� �� ���� ��
		// ���� ���������� �ٸ��� ó���� �� ����Ѵ�.
		//�� �� catch ������ ������ ����� �� �ֽ��ϴ�.
		int[] number = {1,2,3,4,5,0};
		
		//���ܰ� �߻������� �𸣴� �ڵ���� try ���� �ֽ��ϴ�.
		try {
			for(int i = 0; i < 6; i++) {//ArrayIndexOutOfBoundsException
				System.out.println(number[i]);
			}
			System.out.println("0���� ������ �õ��غ��ڽ��ϴ�.");
			System.out.println(number[4] / number[5]);//ArithmeticException
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException ai) {
			System.out.println("������ ��� �ε��� ��ȣ�� �Է��߰ų� 0���� ���ڸ� ���� �� �����ϴ�..");
		}/*catch(ArithmeticException ae) {
			System.out.println("0���� ���ڸ� ���� �� �����ϴ�.");
		}*/catch(Exception e) {
			//Exception e�� ����ó���������� � ���ܵ� �� �ϰ�ó���մϴ�.
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
	}
}
