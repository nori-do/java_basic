package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {
	public static void main(String[] args)throws IOException {
		//�ܺο� �ؽ�Ʈ������ ����� ���ؼ� FileOutputStream�� ����մϴ�.
		//������ ����� �ű⿡ ���� ��θ� �����ϴ٤�.
		//main�޼��忡 �ݵ�� throws IOException�� �ۼ��ؾ��մϴ�.
		//FileOutputStream output =
		//		new FileOutputStream("C:/io/test.text");
	
		//������ ����� ���� FileOutputStream�ڷ��� ���
		//Filewrtier �ڷ����� �� ���� �ֽ��ϴ�.
		FileWriter output = new FileWriter("C:/io/test.text");
		
		//.write("����")�� �̿��� �޸��� ���ο� �ʱ��� �� �ִ�.
		//��, �ٹٲ��� �ڵ����� �� �Ǳ� ������ �ٹٲ��� �ʿ��� �κп�
		// \n�� �߰��� �ٿ��ֽø� �˴ϴ�.
		output.write("�ȳ��ϼ���\n �� �̸��� �ڱ⵵ �Դϴ�.\n �ߺ�Ź�帳�ϴ�.");
		
		//�ش� �ؽ�Ʈ�� ���Ͽ� �ݿ��Ϸ���.close()�� �������ָ� �˴ϴ�.
		output.close();
	
	}
}
