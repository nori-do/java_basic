package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		//Scanner�� ���ؼ� ��ü ������ �Է¹�������.
		//�������� ���峻���� ã�� ���� �ܾ �߰��� �Է¹�������.
		//���� ���� �ִ� �ܾ���� �ε��� ��ȣ�� �� ���� ����Ǿ�����
		//������ִ� �ڵ带 �ۼ��غ�����.
		Scanner sc = new Scanner(System.in);
		System.out.println("��ü ������ �Է����ּ���.");
		String sentence = sc.nextLine();
		// �������� ���峻���� ã�� ���� �ܾ �߰��� �Է¹޴´�.
		System.out.println("���� ������ ī������ �ܾ �Է����ּ���.");
		String searchVoca = sc.nextLine();
		
		//���� ���� �ִ� �ܾ���� �ε��� ��ȣ�� �� ���� ����Ǿ�����
		//������ִ� �ڵ带 �ۼ��� ������.
		// ���� ī����
		
		int count = 0;
		//�ݺ��� �߰� ���� ����
		boolean bool = true;
		//���������� �߰ߵ� ����
		int fidx = -1;
		
		while(bool){
			//fidx�� ���������� ��ȸ�� �����̹Ƿ�
			//fidx + 1 ���� �ܾ ã�� �����ؾ���
			
			//indexOf�� �����ߴµ� -1�� ���´ٸ�
			//�� ã�� �ʿ䰡 ���ٴ� �ǹ���
			int get = sentence.indexOf(searchVoca, fidx);
			if(get == -1) {
				bool = false;
			}else {
				fidx = get;
				count++;
				System.out.println(get + "�� �ε������� " + 
						count + "��° " + searchVoca + "��(��) ����Ǿ����ϴ�.");
			}
			System.out.println(searchVoca + "�� �� ���� Ƚ���� " + count + " ȸ�Դϴ�.");
		}
	sc.close();
	}
}
