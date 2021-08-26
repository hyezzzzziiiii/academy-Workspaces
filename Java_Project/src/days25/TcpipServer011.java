

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// ���� �����ϴ� Ŭ���� : ���������� �ϸ鼭.. 
// �ڽſ��� ������ ��û�ϴ� Ŭ���̾�Ʈ�� ��ó�� �����ϰ� ������ �ϼ����� Ŭ����
public class TcpipServer011 {

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]"); //�ð� ��� ������ ����
		return f.format(new Date());
	}
	public static void main(String[] args)  {
		
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7777);  // �������� ��ü ���� / ss�� �������ִ� ��
			// 7777: ��Ʈ ��ȣ
			// ��Ʈ��ũ���� ������������ ������ ������ ���������� ���� �� ������, ������ ���� �����ϱ� ����
			// ��Ʈ��ȣ�� �����մϴ�. ��������� ���ϸ��� �����ڿ� �����Ͽ� �����մϴ�. /Ŭ���̾�Ʈ�� ���Ӱ���
			// ������� �Ϸ�Ǹ� ������ ������ �޾��ֱ� ���� �غ� �Ϸ��� ���Դϴ�.
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�."); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		// ���������� �غ� �Ϸ� ���� Ŭ���̾�Ʈ�� ���� ��û�� �ö����� ������ ��� ���߰� ��� ��ٸ��ϴ�.
		while(true) {
		try {
			System.out.println(getTime() + "�����û�� ��ٸ��ϴ�."); 
			Socket s = ss.accept();  
			// Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ��ſ� ������ �����ϰ�,
			// ���������� �����س��� �������� ������ �����մϴ�.
			System.out.println(getTime() + s.getInetAddress()  + "�κ��� �����û�� ���Խ��ϴ�.");
			
			// ������ ��½�Ʈ���� DataOutoutStream�� �����ؼ� ���� -> Ŭ���̾�Ʈ�� ������ ����� �غ��մϴ�.
			// ������ OutoutStream -> �ý����� OutputStream -> DataOutputStream ����
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);  // ���� ��� ��� ���� : dos
			
			// ���� ����(remote socket)�� �޼����� �����ϴ�.
			dos.writeUTF("[����]  204ȣ 11�� �ڸ������κ��� �׽�Ʈ �޼����� ���۵Ǿ����ϴ�.");
			System.out.println(getTime() + "�����͸� �����߽��ϴ�.");
		
			dos.close();  	// ��Ʈ���� ������ �ݽ��ϴ�.
			s.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}

}
