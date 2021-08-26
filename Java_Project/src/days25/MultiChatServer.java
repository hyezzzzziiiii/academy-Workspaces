package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer {

	HashMap clients; // 접속중인 클라언트와 연결들을 관리한 리스트
	// key : 클라이언트의 이름 - 클라이언트 접속과 함께 전달된 이름: 숫자로 구성됨
	// value : 클라이언트에 연결된 이름(key값) 으로 생성된 out객체, key값의 클라이언트 전용 전속객체
	MultiChatServer(){
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// 멀티 쓰레드 환경에서 단일 해쉬맵에 멀티스레드가 동시에 접근하여 값을 변경하는 것을 막는 동기화도구
	}

    class ServerReceiver extends Thread{  // 접속된 사람당 하나씩 만들어짐
		Socket s;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.s = socket;
			try {
				in = new DataInputStream(s.getInputStream());
				out = new DataOutputStream(s.getOutputStream());		
			}catch (IOException e) {
				System.out.println("송수신 객체 생성에 실패했습니다.");
			}
		}// 송수신을 위한 객체 생성
			public void run() {
				String name = "";
				try {
				name = in.readUTF();  //접속과 함께 전달된 이름을 저장
				clients.put(name, out);  // 해쉬맵에 클라이언트 한명 추가(키: 이름, 밸류 : out객체)
				sendToAll("#" + name + "님이 들어오셨습니다."); //이름을 출력(모든 클라이언트에게)
				System.out.println("현재 서버접속자 수는 " + clients.size()+ "입니다.");
				while(in != null) sendToAll(in.readUTF());
			}catch (IOException e) { e.printStackTrace();	
			} finally {
					sendToAll("#" + name  + "님이 나가셨습니다");
					clients.remove(name); //
					System.out.println("["+ s.getInetAddress() + ":" + s.getPort() + "]"+ "에서 접속을 종료하였습니다.");
					System.out.println("현재 서버접속자 수는 " + clients.size() +"입니다.");
				}
		}// 각클라이언트 한명당 하나의 ServerReceiver가 new ServerReceiver()로 만들어져 start실행
		// 만들어진 ServerReceiver 객체 안에서는 접속 Client의 이름. in과 out객체 등이 들어있습니다.
    }

	void sendToAll(String msg) {  //모두에게 보내주는 동작
		// 해쉬맵의 키들에 차례로 접근할 수 있는 이터레이터 생성
		Iterator it = clients.keySet().iterator();  
		while(it.hasNext()) {  //다음 키값이 있다면 true로 반복, 키값의 마지막까지 다다를때까지 반복실행
			try {
				// 클라이언트에서 (next)키 값으로 얻어낸 Value(클라이언트 전용 out객체)를 꺼내서 out에 저장
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg); //해쉬맵에서 꺼내온 out객체를 통해 메세지 전송	
			}catch(IOException e) {
			}
		}
		// clients 해쉬맵에 있는 각 클라이언트의 OutStream을 각각 꺼내어 현재 메세지를 전송
	}
	public void sijack()  {
		ServerSocket ss = null; 
		Socket s = null;
		
		try {
			while (true) {
			ss = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			s = ss.accept();
			System.out.println("[" + s.getInetAddress() + ":" + s.getPort()+ "]" + "에서접속하였습니다.");
			//아이피와 포트 번호로 접속 알림(서버화면)
			ServerReceiver th = new ServerReceiver (s);
			//연결된 소켓을 전달인수로 쓰레드 생성, 매 접속하는 클라이언트 마다 새로운 소켓과 쓰레드가 
			th.start(); //쓰레드 시작
			}
		} catch (IOException e) {
			System.out.println("서버 소켓 생성에 실패하였습니다. 서버를 종료합니다.");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		MultiChatServer k = new MultiChatServer();
		k.sijack();
	}
    }
		
