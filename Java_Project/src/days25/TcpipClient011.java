

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient011 {

	public static void main(String[] args) {
		String serverIp ="127.0.0.1";
		
		try {
			Socket s = new Socket(serverIp, 7777);
			// ������ �����ϸ� �Ʒ� ������ ����, �����ϸ� catch���� ����
			
			InputStream in = s.getInputStream();  // ���� ���� �о�� ȭ�鿡 ���
			DataInputStream dis = new DataInputStream(in);
			String m = dis.readUTF();
			// �������κ��� ���� �����͸� ����մϴ�.
			System.out.println("���� �޽��� :  " + m);
			System.out.println("������ �����մϴ�.");
			
			// ��Ʈ���� ������ �ݽ��ϴ�.
			dis.close();
			s.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
