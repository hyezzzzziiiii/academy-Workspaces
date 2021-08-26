

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// 현재 제작하는 클래스 : 서버역할을 하면서.. 
// 자신에게 연결을 요청하는 클라이언트의 요처을 수락하고 연결을 완성해줄 클래스
public class TcpipServer011 {

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]"); //시간 출력 형식을 만듬
		return f.format(new Date());
	}
	public static void main(String[] args)  {
		
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7777);  // 서버소켓 객체 생성 / ss로 관리해주는 것
			// 7777: 포트 번호
			// 네트워크상의 서버소켓으로 실행할 연결은 여러역할을 있을 수 있으며, 역할을 서로 구분하기 위해
			// 포트번호를 설정합니다. 만들어지는 소켓마다 생성자에 전달하여 설정합니다. /클라이언트가 접속가능
			// 여기까지 완료되면 서버가 연갈을 받아주기 위한 준비가 완려된 것입니다.
			System.out.println(getTime() + "서버가 준비되었습니다."); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		// 서버소케은 준비 완료 이후 클라이언트의 연결 요청이 올때까지 실행을 잠시 멈추고 계속 기다립니다.
		while(true) {
		try {
			System.out.println(getTime() + "연결요청을 기다립니다."); 
			Socket s = ss.accept();  
			// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 통신용 소켓을 생성하고,
			// 서버소켓이 연결해놓은 서버연결 정보를 전달합니다.
			System.out.println(getTime() + s.getInetAddress()  + "로부터 연결요청이 들어왔습니다.");
			
			// 소켓의 출력스트림을 DataOutoutStream에 전달해서 서버 -> 클라이언트의 데이터 출력을 준비합니다.
			// 소켓의 OutoutStream -> 시스템의 OutputStream -> DataOutputStream 전달
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);  // 최종 통신 출력 도구 : dos
			
			// 원격 소켓(remote socket)에 메세지를 보냅니다.
			dos.writeUTF("[공지]  204호 11번 자리서버로부터 테스트 메세지가 전송되었습니다.");
			System.out.println(getTime() + "데이터를 전송했습니다.");
		
			dos.close();  	// 스트림과 소켓을 닫습니다.
			s.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}

}
