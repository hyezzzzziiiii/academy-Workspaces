

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClientSender extends Thread{
	Socket s;
	DataOutputStream out;
	String name;
	ClientSender(Socket socket, String name){
		this.s = socket;
		this.name = name;
		try {
			out = new DataOutputStream(s.getOutputStream());
		}catch (IOException e) {	}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		if(out != null) {
			try {
				out.writeUTF(name);  //���� ���� �� �̸��� ������ ����
				while(out !=null) out.writeUTF("[" + name +"]" + sc.nextLine());
				// ���� ȭ�鿡 ���� ������ ��� ������ ����(���α׷� ����ñ��� ���� �ݺ�)
			}catch(IOException e) { }
		}
	}
}

class ClientReceiver extends Thread{
	Socket s; 
	DataInputStream in;
	ClientReceiver(Socket socket){
		this.s = socket;
		try { in = new DataInputStream(s.getInputStream());
		
		} catch(IOException e) {}
	}
	public void run() {
		while(in != null) {
			try { System.out.println(in.readUTF());
			}catch(IOException e) { }
		}
	}
}
public class MultiChatClient1 {
	public static void main(String[] args) {  //���α׷��� �����μ� args
		String serverIp = "127.0.0.1";  //���� ������ ��ȯ�ʿ�
	   try{
		   Socket s = new Socket(serverIp, 7777);
		   System.out.println("������ ����Ǿ����ϴ�.");
		   ClientSender cs = new ClientSender(s, args[0]);
		   ClientReceiver cr = new ClientReceiver(s);
		   cs.start();
		   cr.start();
	   }catch(UnknownHostException e) {
		   System.out.println("�ش� �������� ����(ȣ��Ʈ)�� ã�� �� �����ϴ�.");
		   System.exit(0);
	   }catch(IOException e) {
		   System.out.println("�ش� �������� ����(ȣ��Ʈ)�� ã�� �� �����ϴ�.");
		   System.exit(0);
	   }
	}

}
