package days11;

import java.util.Scanner;

public class Method16 {

	public static void main(String[] args) {
		 // 다수의 학생들의 다수 과목의 성적을 저장하는 배열 생성
		  int [][] scores;
		  //int s=getStudentNumber();
		  //int k=getSubjectNumber();
		  //scores = new int[s][k];
		  scores = new int[ getStudentNumber() ][ getSubjectNumber()+1 ]; 
		  // getStudentNumber() : 학생수를 입력 받아서 리턴하는 매서드
		  // getSubjectNumber() : 과목수를 입력 받아서 리턴하는 매서드
		  // getSubjectNumber() + 1 : 총점을 저장할 공간 하나를 추가로 생성
		  input(scores);
		  output(scores);  
		 }
		 public static void input(int [][] s) {
		  Scanner sc = new Scanner(System.in);
		  for(int i=0; i<s.length; i++) {  //  학생수만큼 반복(행의 갯수)
		   for(int j=0; j<s[i].length-1; j++) {  // 과목수 만큼 반복(열의 갯수)
		    System.out.printf("%d번 학생 %d 과목 점수 : ", i+1, j+1);
		    s[i][j] = sc.nextInt();
		    s[i][ s[i].length-1 ] += s[i][j];  // 매반복마다 입력된 점수 누적 : 총점 계산
		   }
		  }
		 }
		 public static void output(int [][] s) {
		  double ave = 0.0;
		  int k = s[0].length; // 배열의 열갯수를 k 변수에 저장
		  System.out.println("\t\t###성적표###");
		  System.out.println("---------------------------------------------------------------");
		  System.out.printf("번호\t");
		  for(int i=0; i<k-1; i++) System.out.printf("%d과목\t", i+1);
		  System.out.printf("총점\t평균\t\n");
		  System.out.println("---------------------------------------------------------------");
		  // 1과목 2과목 3과목 ....  총점 평균   
		  for(int i=0; i<s.length; i++) {
		   System.out.printf("%d\t", i+1);
		   for(int j=0; j<k-1; j++)  System.out.printf("%d\t", s[i][j]); //과목 점수들 출력
		   ave = s[i][k-1]/(double)(k-1);
		   System.out.printf("%d\t%.1f\n", s[i][k-1], ave); //총점 평균 출력
		  }
		  System.out.println("---------------------------------------------------------------");
		 }
		 public static int getStudentNumber() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("학생수를 입력하세요");
		  return sc.nextInt();
		 }
		 public static int getSubjectNumber() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("과목수를 입력하세요");
		  return sc.nextInt(); 
}
}
