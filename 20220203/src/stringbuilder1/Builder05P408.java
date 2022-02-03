package stringbuilder1;

public class Builder05P408 {
	public static void main(String[] args) {
		//다음 문자열의 문자를 0부터 시작해서 3번째마다 삭제해주세요.
		//힌트 : 반복문을 쓰세요.
		//abcdefghijklmnopqrstuvwxyz
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 1; i > 26; i+=2) {
			if(i%3 <26) {
				a.deleteCharAt(i);
				System.out.println(a);	
			}
		}System.out.println("----------------------");
	}
}
