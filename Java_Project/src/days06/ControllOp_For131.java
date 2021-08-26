public class ControllOp_For131 {

	public static void main(String[] args) {
		// i가 1일때 j가 1~10까지 반복실행
		// i가 1일때 j가 1~10까지 반복실행
		// i가 1일때 j가 1~10까지 반복실행
		
		/*for(int i = 1; i <=10; i++) { //10번 반복한 안의 구조를 다시 10번 반복
			
			for(int j=1; j<=10; j++) {
				System.out.printf("%dx%d= %d ", i, j, i*j);  // 10번 반복
			}
			System.out.println();
		}*/
		
            for(int i=1; i <=9; i++) { 
			
			for(int j=2; j<=9; j++) {
				System.out.printf("%dx%d= %2d  ", j, i, i*j);  
			}
			System.out.println();
		}
	}

}
