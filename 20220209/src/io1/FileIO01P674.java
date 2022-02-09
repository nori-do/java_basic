package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {
	public static void main(String[] args)throws IOException {
		//외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		//변수를 만들고 거기에 파일 경로를 적습니다ㅣ.
		//main메서드에 반드시 throws IOException을 작성해야합니다.
		//FileOutputStream output =
		//		new FileOutputStream("C:/io/test.text");
	
		//간편한 사용을 위해 FileOutputStream자료형 대신
		//Filewrtier 자료형을 쓸 수도 있습니다.
		FileWriter output = new FileWriter("C:/io/test.text");
		
		//.write("내용")을 이용해 메모장 내부에 필기할 수 있다.
		//단, 줄바꿈이 자동으로 안 되기 때문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여주시면 됩니다.
		output.write("안녕하세요\n 제 이름은 박기도 입니다.\n 잘부탁드립니다.");
		
		//해당 텍스트를 파일에 반영하려면.close()로 종료해주면 됩니다.
		output.close();
	
	}
}
