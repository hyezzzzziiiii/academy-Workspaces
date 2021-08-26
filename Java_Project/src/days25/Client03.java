package days25;

import java.io.IOException;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client03 {

	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
            Sender sender = new Sender(s);
            Reader receiver = new Receiver(s);
            sender.start();
            receiver.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();

	}

}
}
