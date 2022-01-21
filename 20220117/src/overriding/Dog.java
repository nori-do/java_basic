package overriding;

public class Dog extends Animal{
 //여러분이 overriding 패키지 내부에 추가적으로 동물을 하나 자율적으로
//만들어주세요.
//Horse처럼 생성한 동물은 자신만의 특성 하나를 가지고
// Animal을 상속합니다.
//상속해서 받은 메서드 howl(), getInfo()는 자식 클래스 특성에 맞춰서
//재정의합니다
	
	//코드 전송 -> main쪽에 하나 더 생성 -> 그림 캡쳐
	
	public String size; // 크기
	
	public void howl(){
		System.out.println("멍멍멍");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name +
				", 나이 : " + age + ", 크기 : " + size);
	}
}

