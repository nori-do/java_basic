package accessmodifier;

public class Dog {//정의부
	//강아지의 정보를 자율적으로 3개 부여주세요.
	// String name은 고정입니다.
	public String name;
	private int age;
	private String color;
	
	//생성자로 강아지 정보를 처리하시되
	//이름은 무조건 입력받게 해주세요.
	public Dog(String n, String c) {
		name = n;
		age = 1;
		color = c;
		
	}
	//수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void newyear(){
		age += 1;
	}
	public void getInfo() {
		System.out.println("강아지의 이름 : " + name +
						", 나이 : " + age +
						", 색 : " + color);
	}
}
