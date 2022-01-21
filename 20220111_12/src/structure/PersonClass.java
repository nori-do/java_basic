package structure;

public class PersonClass {
	//사람 정보를 Person과 동일하게 만들어주시되
	//여러분이 추가하고 싶은 특성 하나를 더 추가해보세요.
	
	public String name;
	public String gender;
	public int age; 
	public String pNum; 
	public int uNum; 
	//public boolean glasses; //안경 착용 여부 /착용 true, 미착용 false
	
	//getInfo 메서드도 같이 PersonClass 안에 정의한다.
	//클래스 내부에 생성할때는 public 오른쪽에 오던 static키워드를 뺀다.
	//자기와 같은 지역 내의 요소는 소속 명시 없이 조회가 가능하다.
	public void getInfo() {
		System.out.println("이름 : " + name +
							", 성별 : " + gender +
							", 나이 : " + age +
							", 연락처 : " + pNum +
							", 회원번호 : " + uNum);
	}


}
