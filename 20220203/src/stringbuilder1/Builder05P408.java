package stringbuilder1;

public class Builder05P408 {
	public static void main(String[] args) {
		//다음 문자열의 문자를 0부터 시작해서 3번째마다 삭제해주세요.
		//힌트 : 반복문을 쓰세요.
		//abcdefghijklmnopqrstuvwxyz
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 1; i > 26; i+=2) {
			System.out.println("i%3의결과 : " + i % 3);
			System.out.println("현재 i의 값 : " + i);
			System.out.println(a);
			System.out.println("----------------------");
			if(i%3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}
}
