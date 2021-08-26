package days11;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double ave;
		String gra;
		kor = myInput(1); //점수입력 //1은 전달인수
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor, eng, mat); //총점 계산
		ave = avg(kor, eng, mat); //평균계산
		gra = grade(ave); // 평균 90 이상 A학점, 90 이상 A학점, 80 이상 B 학점, 70 이상 C학점, 60이상 D학점, 나머지 F
		prn(tot, ave, gra);  //총점, 평균, 학점계산
	}
	public static int myInput(int k) {
	int inputValue = 0 ;
	Scanner sc = new Scanner(System.in);	
	if(k ==1) System.out.println("국어 점수를 입력하세요");
	else if(k ==2) System.out.println("영어 점수를 입력하세요");
	else System.out.println("수학 점수를 입력하세요");
	inputValue = sc.nextInt();
	return inputValue;
   }
	
   public static int sum(int k, int e, int m) {
   int total = 0;
   total = k +  e + m;   
   return total;
   }
   
   public static double avg(int k, int e, int m) {
   double average = 0.0;
   average  =(int)(sum(k, e, m)/3.0*100)/100.0;
   // 메서드는 반드시 main메서드에서만 호출할 수 있는 것이 아닙니다.
   // 만들어진 메서드들 간에 필요하다면 서로를 호출하여 결과를 활용할 수 있습니다.
   // 메서드 호출의 결과로 리턴된 값은 위와 같이 다른 연산에도 참여시킬 수 있습니다.
   // t = sum(k,m,e);   a = sum(k,m,e) /3.0;
   return average;
   }
   
   public static String grade(double a) {
	   String g = null;
	   if(a>=90) g = "A학점";
	   else if(a>=80 && a<=90) g = "B학점";
	   else if(a>=70 && a<=80) g = "C학점";
	   else if(a>=60 && a<=70) g = "D학점";
	   else g = "F학점";
	   return g;
	   }
   
   public static void prn(int t, double a, String g) {
	   System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s", t , a , g);
   }
		
   }
