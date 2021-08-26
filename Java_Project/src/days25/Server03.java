package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	DataOutputStream out; // 메시지 전송(송신) 출력스트림
	Socket s;
	String name;
	
	Sender(Socket socket){ 
		this.s = socket; // 생성자를 통해 전달되어 온 소켓 인스턴스를 자신의 소켓 변수에 장착
		try {
		out = new DataOutputStream(s.getOutputStream());  //출력스트림 생성
		name = "["+s.getInetAddress() + ":" +s.getPort() +"j";

	}catch(IOException e) {
		e.printStackTrace();
	}
	}
		public void run() {
			Scanner sc = new Scanner(System.in);
			// out레퍼런스변수가 널값이 아니라면 : out 인스턴스가 할당되어 있는 상태라면
			while(out != null) {
				//out인스턴스는 생성자에서 최초 new 로 생성되어 프로그램 종료시까지 게속 없어지지않습니다.
				// 결국 화면 입력내용을 기다리다 입력이 들어오면 상대방에게 전송하는 작업을 계속하라는 뜻입니다.
				try {
					out.writeUTF( name + sc.nextLine() );   //화면에 입력한 내용을 만들어둔 앞머리와 함께 전송
					// String message = sc.nextLine();
					// out.writeUTF(name + message);
				} catch (IOException e) {
		         	e.printStackTrace();
				}  
				
			}
	}
}

class Receiver extends Thread{
	
	DataInputStream in; // 메세지 전송(수신)용 입력스트림
	Socket s;
	Receiver(Socket socket){
		this.s = socket;
		try {
			in = new DataInputStream(s.getInputStream());
		} catch (IOException e) {
			System.out.println("메세지 수신 객체를 생성하지 못했습니다.");
		}
	}
		public void run() {
			while(in != null) {
				try {
					System.out.println( in.readUTF() ); //입력되어 오는 메세지를 받아서 화면에 출력
				}catch (IOException e) {
					
				}
			}
	}
}

public class Server03 {

	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			s = sS.accept();  // 연결
			Sender sender = new Sender(s);  // 송신을 담당하는 역할의 클래스(쓰레드 기능 상속됨)
			Receiver receiver = new Receiver(s);  // 수신을 담당하는 역할의 클래스(쓰레드 기능 상속됨)
			sender.start(); // 스타트 안에서 모든 동작들이 독립적으로 하기 위해 쓰래드 사용 /각각 독립적으로 스타트
			receiver.start();  // 각각 독립적으로 스타트
			
		}catch (IOException e ) {
			System.out.println("서버소켓 생성에 실패했습니다.");
		}

	}

}
