package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		//Random객체를 생성한 다음 nextBoolean() 기능을 이요해서
		//동전던지기 카운팅 프로그램을 만들어주세요.
		//n회 던졌을 때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		//프로그램이 다 끝났을 때 앞면 몇 회, 뒷면 몇 회 인지
		//콘솔창에 출력해주세요.
		//실행 횟수 n회는 스캐너로 입력받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = sc.nextInt();
		int front = 0;
		int back = 0;
		Random random = new Random();
		
		//00바퀴를 돌린 결과 값 :
		//앞면 front :
		//뒷면 back:
		for(int i=0; count>i; i++) {
			if(random.nextBoolean()) {
				front++;
			}else{
				back++;
			}
		}
		
		System.out.println(count + "바퀴를 돌린 결과값");
		System.out.println("앞 면 : " + front);
		System.out.println("뒷 면 : " + back);
		
	}
}
