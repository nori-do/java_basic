package static2;

public class Asean {
	//출석점수(check), 중간고사(midTerm), 기말고사(fianlTerm)
	//변수를 설정해주세요.
	//위 변수들은 개별 객체가 따로따로 과리합니다.
	private int check;
	private int midTeram;
	private int fianlTeram;
	
	//공용 발표점수 presentationScore를 static으로 만들어주세요.
	//이 점수는 19점입니다.
	private static int presentationScore = 19;
	//생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만
	//받아서 수치를 입력해주십니다.
	public Asean(int check, int midTeram, int fianlTeram) {
		this.check = check;
		this.midTeram = midTeram;
		this.fianlTeram = fianlTeram;
		//this.presentationScore = 19;
	}
	
	// 일반 메서드 showAseanInfo()를 생성해주시되
	//성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : xx점, 기말고사 : yy점 ...
	public void showAseanInfo() {
		System.out.println("중간고사 : " + this.midTeram + 
				 ", 기말고사 : " + this.fianlTeram + ", 출석점수 : " + this.check +
				 ", 발표점수 : " + presentationScore);
	}
	
	//presentationScore는 private으로 전환될 경우
	//main 지역에서 다이렉트로 조회가 불가능합니다.
	//Asean을 new키워드로 만들지 않고도
	//private presentationScore를 콘솔에 조회가능하도록
	//조치를 취해보세요
	public static int getPresentationScore() {
		return presentationScore;
	}
}
