package days13;
class Student{
	private int bun;
	private String name;
	private String [] subjects = {"국어", "영어", "수학"};		
	private int [] scores;  // 성적을 저장하기위한 배열 변수
	private int tot;  // 총점을 저장하기 위한 변수
	private double avg;  // 평균을 저장하기 위한 변수
	private char grade;  // 학점을 저장하기 위한 변수
		
    Student(String name){
		name = "홍길동";
	}
    Student(String name, int k, int m, int e){
		name = "홍길남";
		k= 100;
		m = 100;
		e = 100;
   	}
    public void input() { 
    	;
    }
	public Student copy() {
		Student a  = new Student();
		a.num = this.num;
		return null;
	}
	public void output() {
		System.out.println("번호\t성명\t\t점수\t총점\t평균\t학점");
		System.out.printf("%d\t%s\t\t", bun, name);
		System.out.printf("%d\t%d\t%.1f\t%s", scores, tot, avg, grade);
    }
}
public class Class20 {


	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		s1.input();  // 이름을 홍길동으로 생성 후 점수들 입력
		Student s2 = s1.copy();
		Student s4 = new Student("홍길남", 100,100,100);  //this(이름)을 호출하는 생성자
		s1.output();  //번호 이름 점수 학점 등등을 화면에 적절히 출력
		s2.output();
		s3.output();

	}

}
