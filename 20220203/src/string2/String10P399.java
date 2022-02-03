package string2;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		//로그인 로직을 만들어보겠습니다.
		//먼저 Sting id에 여러분이 설정한 임의의 아이디를
		String id = "";
		//String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		String pw = "";
		//다음, 사용자에게 Scanner를 이용해
		Scanner sc = new Scanner(System.in);
		//uId 변수에는 아이디를(사용자가 입력한 아이디)
		System.out.println("사용자 아이디를 입력해주세요.");
		String uId = sc.nextLine();
		id = uId;
		
		//조건문을 이용해서 기본 id가 입력받은 자료와 일치하면
		if(uId.equals(id)) {
			System.out.println("비밀번호를 입력해주세요.");
			String uPw = sc.nextLine();
			if(uPw.equals(pw)){
				//uPw변수에는 비밀번호를(사용자 입력) 받아서 XX님 로그인에 성공했습니다.
				System.out.println(id + "님 환영합니다.");
			}else {
				//id는 일치하나 비밀번호가 틀리면 "비밀번호가 틀렸습니다."
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			//id가 일치하지 않으면 "그런 아이디는 없습니다."
			System.out.println("그런 아이디는 없습니다.");
		}
	}
}
