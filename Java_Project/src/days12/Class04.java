package days12;
class Std{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
		
	public void init(int bunho, String stdName, int stdKor, int stdEng, int stdMat) {
		bun = bunho; // 필드와 매치
		name = stdName;
		kor = stdKor;
		eng = stdEng;
		mat = stdMat;
		tot = kor + mat + eng; 
		ave = tot/3.0;								
	}
	void prn() { // 출력메서드
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t\t", bun, name);
		System.out.printf("%d\t%d\t%d\t%d\t%.1f", kor, eng, mat, tot, ave);
    }
}
public class Class04 {

	public static void main(String[] args) {
        Std std1 = new Std();
        std1.init(1, "홍길동", 56, 87, 98); // 멤버필드에 각 값을 저장, 총점 평균계산
        std1.prn(); // 제목에 맞춰 출력
        std1.kor = 100; 
	}

}
