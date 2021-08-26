package days02;

public class Print03 {

	public static void main(String[] args) {
        System.out.printf("\t\t###성적표###\n");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\n");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n",
        		1,"홍길동", 85, 56, 78, 85+56+78,(85+56+78)/3.0);
        // (;) 전에 나온 모든 내용은 하나의 명령을 인식되므로, 여러줄에 나누어 작성해도 무방합니다.
        // %f 사이에(.2)와 같이 넣어서 소수점 표시 자릿수를 제한 할 수 있습니다.
        // %.2f 소수점 둘째 자리까지 표시(셋째자리에서 반올림됩니다.)
        System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n",
        		2,"Gildong", 85, 56, 78, 85+56+78,(85+56+78)/3.0);
        System.out.printf("----------------------------------------------------\n");


	}

}
