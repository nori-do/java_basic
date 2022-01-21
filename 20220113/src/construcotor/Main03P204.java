package construcotor;

public class Main03P204 {

	public static void main(String[] args) {
		//웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요
		
		Webtoon w1 = new Webtoon("코딩을 배우다"
								, "자바");
		
		w1.getInfo();
		w1.uplaoadWebtoon();
		w1.uplaoadWebtoon();
		w1.uplaoadWebtoon();
		w1.getInfo();
		w1.completeWebtoon();
		w1.getInfo();

		System.out.println("================================================================");
		
		Webtoon w2 = new Webtoon("학교에 가다", "학생");
		
		w2.getInfo();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.completeWebtoon();
		w2.getInfo();
	
	}
}
