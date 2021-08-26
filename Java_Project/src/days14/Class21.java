package days14;
//static 키워드
// 클래스, 멤버변수, 멤버메서드에 적용할 수 있는 키워드입니다.
// 정적변수(멤버변수), 정적메서드를 선언할 때 사용합니다

// 자바프로드램의 구동과정
// 1. JVM에 의해서 실행할 모든 클래스 중, static메소드, static 멤버필드를 수집해서 메모리에 로딩
// 프로그램의 시작(main메소드의 실행) 전에 메모리 적재
// 2. 메모리에 로딩된 static메소드 중 main이름을 검색
// 3. main메소드가 검색되었다면 JVM 해당 main메소드를 호출하여 프로그램을 시작

// static필드 /메소드의 특징
// 프로그램의 구동 전부터 메모리를 확보하고 있는 멤버필드 및 메서드!!!
class StaticA{
	int num; //멤버변수선언 - 동적 변수
	static int number = 100;  //멤버변수선언 - 정적 변수
}
// 동적변수와 정적변수의 구분 기준은 생성 시기로 나뉩니다
// 위에 선언한 동적 변수는 StaticA클래스 형태의 객체가 생성될떄(= new StaticA();) 생성되는 변수이고
// 정적변수는 main()메서드 실행전에 자동으로 미리 생성되는 변수입니다.

public class Class21 {

	public static void main(String[] args) {
		// main메서드 실행 전에 static 변수는 이미 생성되있습니다. /'객체와 상관 없이 생성' - 멤버메서드는 객체 만들어져야함
        System.out.println(StaticA.number);
        // 다만 클래스 외부에서 static변수에 접근하려면 위와 같이 '클래스이름과 함께 사용'합니다.
        // 동적변수와 마찬가지로 private으로 보호 되지 않았다면 임의 접근이 가능합니다.
        StaticA.number = 10;
        System.out.println(StaticA.number);
        // private으로 보호된 static변수는 static메서드를 사용하여 값을 저장하거나 얻어냅니다.
        // 그 예는 다음단원에서 살펴봅니다.
        
        // '동적변수(멤버변수)'는 객체가 생성되지않으면 사용할 수 가 없습니다.
        StaticA a = new StaticA();
        a.num = 200;
        System.out.println(a.num);
        
        // 객체 생성전에 꼭 동적변수를 사용하고자 한다면 아래와 같이 사용은 가능합니다.
        new StaticA().num = 500; //저장된 곳 없음
        // 다만 위의 같은 사용은 new StaticA()를 저장할 참조변수가 없기 때문에 이후에 다시 접근 
        // 및 재활용이 안됩니다.
        
        // 정적(static)변수는 객체 갯수와 상관없이 '단 한개만 생성'되어 계속 값이 유지 됩니다.
        StaticA.number = 1;
        StaticA a1 = new StaticA();
        StaticA a2 = new StaticA();
        StaticA a3 = new StaticA();
        a1.num = StaticA.number++;
        a2.num = StaticA.number++;
        a3.num = StaticA.number++;
        System.out.println(a1.num);
        System.out.println(a2.num);
        System.out.println(a3.num);
        System.out.println(StaticA.number);
        
	}

}
