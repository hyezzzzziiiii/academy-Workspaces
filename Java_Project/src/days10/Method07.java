package days10;

public class Method07 {
    // 정수하나를 전달받아서 받은 정수의 구구단을 출력하는 메서드를 생성하세요
	
	public static void main(String[] args) {
		
        for(int i =1; i<=9; i++) {
        	gugudan(i);
        	System.out.println();
        }
		
	}
    public static void gugudan(int n) {
    	for(int i = 2; i<=9; i++) 
    	System.out.printf("%dx%d =%d  ", i, n, n*i );
    }
}
