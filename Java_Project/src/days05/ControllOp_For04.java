package days05;

public class ControllOp_For04 {

	public static void main(String[] args) {
       //Q. 1부터 10까지의 합계
		int sum =0;
		int i;
		for( i=1 ; i<=10000 ;i++) {
			sum= sum+i;
			System.out.println("1부터 " +(i-1)+"까지의 합은" + sum +"입니다."); //괄호 안에 작성시 식보여줌
		}
	}

}
