

import java.util.Scanner;

public class MyCalender2 {

	public static void main(String[] args) {
		// ����ϰ��� �ϴ� �޷��� ��� ���� �Է¹޽��ϴ�.
		Scanner sc = new Scanner(System.in);
		int y, m, days=0, t,i;// ���α׷��� �ʿ��� ��������
		// t: 7�� ���� �������� ������ ����, i : �ݺ����� �������� �ݺ��� ������ ����
		
		System.out.printf("�� �Է� :  ");
		y= sc.nextInt();
		System.out.printf("�� �Է� :  ");
		m= sc.nextInt();
		// System.out.printf("�� �Է� :  ");
		// d= sc.nextInt();
		
		// �Է��� �⵵�� ���⵵���� ������ ��¥ �� ���
		days = 365*(y-1); // ���⵵���� ��¥ �� 365*���⵵
		for(i=1;i<y; i++)
			if((i%4==0) && (i%100==00) || (i%400==0))
	          days++;  // ���� 1�� ���� �Է��� �⵵�� ���⵵ ���� �������鼭 �־��� ���⸶�� 1���� ���մϴ�.
		
		// �Է��� ���� �������� ������ ��¥���� ����մϴ�.
		switch(m) {
		case 12: days = days +30;
		case 11: days = days +31;
		case 10: days = days +30;
		case 9: days = days +31;
		case 8: days = days +31;
		case 7: days = days +30;
		case 6: days = days +31;
		case 5: days = days +30;
		case 4: days = days +31;
		case 3: 
			if((y%4==0) && (y%100!=00) || (y%400==0)) days = days +29;
			else days = days +28;  //�Է��� �⵵�� �����̸� 2�� 29��, �ƴϸ� 28��(**�����ؼ� �� �ۼ�)
		case 2: days = days +31;
		case 1: days = days +0;		
		}
		
		days = days +1;  // �Է��� ���� 1���ڰ� ���� �������� �Ǵ��ϱ� ���� 1�� ���մϴ�. 
		//���� ������ �ٸ��� ���� �Է¹��� ����(1�ϸ� ��������)
		t = days%7; // t�� �Ͽ���: 0, ������: 1, ȭ���� : 2, ������: 3......����� : 6 
	    // t������ 1���� ������ ��ĭ���� ä��ϴ�
		for(i = 0; i < t; i++) System.out.printf("\t"); 
		int end = 0;
		switch(m) {
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		    	end = 31; break;
		    case 4: case 6: case 9: case 11: 
		    	end = 30; break;
		    case 2 : 
		    	if((y%4==0) && (y%100!=00) || (y%400==0)) end = 29;
				else end = 28; 
		}//�� ���� ���� ��¥ �����Ͽ����Ƿ� �ι�°for�� i<=31���� i<=end�� ����
		
		// �޷������ ����
		System.out.println();
		System.out.println(y + "�� " + m + "�� ");
		System.out.println("-----------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("-----------------------------------------------");
		
		int cnt =0; //cnt�� ��ĭ���� ī��Ʈ�� ���� �ι�° for���� ����
		// t������ 1���� ������ ��ĭ���� ä��ϴ�
		for(i = 0; i < t; i++) {
			cnt++;  
			System.out.printf("\t");  
		}
				
		for(i=1; i<=end; i++) { //1���� �ٽý��� (��¥���)
			cnt++; 
			System.out.printf("%2d\t", i);
			if(cnt%7==0)  System.out.println();
			
		}
		
	}

}
