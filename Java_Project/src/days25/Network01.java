package days25;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network01 {

	public static void main(String[] args) {
		// IP주소 : 네트워크에 접속되어 있는 (또는 인터넷에 연결되어있는) 각 컴퓨터들이 
		// 서로를 구분하기 위해 지정된 숫자로 된 숫자로 된 위치의 정보(주소)  114.205.210.29 : 밖에서 볼때 아이피(네이버검색시 나오는 아이피)
		InetAddress ip  = null;

		try {
			ip = InetAddress.getByName("www.naver.com");

			System.out.println("getHostName() : " +  ip.getHostName());
			System.out.println("getHostAddress() : " +  ip.getHostAddress());
			System.out.println("toString() : " +  ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		 try {
			ip = InetAddress.getLocalHost(); // LocalHost: 내컴퓨터

			 System.out.println("getHostName() : " +  ip.getHostName());
				System.out.println("getHostAddress() : " +  ip.getHostAddress());
				// 로컬 호스트 대표 아이피 : 127.0.0.1
				// http://localhost 그걸 영문으로 쓰면    //http://127.0.0.1 내가 나를 볼떄  http://192.168.0.20 다른사람이 나를 볼떄 아이피
				
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
